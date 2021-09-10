package patika_dev_java101;

public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    public Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighter foe){
        System.out.println(this.name + " boksörü -> " + foe.name + " boksörüne " + this.damage + " hasar verdi." );
        if (foe.isDodge()){
            System.out.println(foe.name + " gelen hasarı blokladı...");
            System.out.println("**********************");
            return foe.health;
        }
        if (foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100; // 0.0 --- 99.9

        return randomNumber <= this.dodge;
    }

}
