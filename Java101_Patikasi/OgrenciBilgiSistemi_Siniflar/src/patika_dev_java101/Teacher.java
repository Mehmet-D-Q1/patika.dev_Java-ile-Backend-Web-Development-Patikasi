package patika_dev_java101;

public class Teacher {
    String name;
    String mobilNo;
    String branch;

    public Teacher(String name, String mobilNo, String branch) {
        this.name = name;
        this.mobilNo = mobilNo;
        this.branch = branch;
    }

    void printTeacherInfo(){
        System.out.println("Akademisyen Bilgileri:");
        System.out.println("Ad: " + this.name);
        System.out.println("Telefon: " + this.mobilNo);
        System.out.println("Bölüm: " + this.branch);
    }

}
