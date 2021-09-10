package patika_dev_java101;

import java.util.Random;

public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheckWeight()) {

            if (startFirstMatch()) { //Random dan true gelirse;
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("-----New Round-----");
                    this.f2.health = this.f1.hit(f2); //ilk vuruşu f1(A boksörü) yapacak.
                    if (isWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }

            } else {//Random dan false gelirse;
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("-----New Round-----");
                    this.f1.health = this.f2.hit(f1);//ilk vuruşu f2(B boksörü) yapacak.
                    if (isWin()) {
                        break;
                    }
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
                
            }
        } else {
            System.out.println("Sporcuların sikletleri uygun değil...");
        }
    }

    boolean isCheckWeight() {
        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandı! ");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandı! ");
            return true;
        }
        return false;
    }

    void printScore() {
        System.out.println("------------------");
        System.out.println(this.f1.name + " Kalan Sağlık : " + this.f1.health);
        System.out.println(this.f2.name + " Kalan Sağlık : " + this.f2.health);
    }

    boolean startFirstMatch() { //Boksörlerin ilk vuruşu yapma ihtimali Random metoduyla (true/false) %50 ihtimal.
        Random randomStartFirst = new Random();
        boolean startFirst = randomStartFirst.nextBoolean();
        System.out.println(startFirst);
        return startFirst;
    }

}
