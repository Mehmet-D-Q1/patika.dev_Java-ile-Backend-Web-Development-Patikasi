package patika_dev_java101;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String studentNo;
    String classes;
    double totalAvarage;
    boolean isPass;


    public Student(String name, String studentNo, String classes, Course c1, Course c2, Course c3) {

        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.totalAvarage = 0;
        this.isPass = false;
    }

    void addBulkExamNote(int exNote1, int exNote2, int exNote3) {
        if (exNote1 >= 0 && exNote1 <= 100) {
            this.c1.note = exNote1;
        }
        if (exNote2 >= 0 && exNote2 <= 100) {
            this.c2.note = exNote2;
        }
        if (exNote3 >= 0 && exNote3 <= 100) {
            this.c3.note = exNote3;
        }
    }

    void addBulkVerbalNote(int vbNote1, int vbNote2, int vbNote3) {
        if (vbNote1 >= 0 && vbNote1 <= 100) {
            this.c1.verbalGrade = vbNote1;
        }
        if (vbNote2 >= 0 && vbNote2 <= 100) {
            this.c2.verbalGrade = vbNote2;
        }
        if (vbNote3 >= 0 && vbNote3 <= 100) {
            this.c3.verbalGrade = vbNote3;
        }

    }

    void calcAvarage(){

        double tarihAverage = this.c1.verbalGrade * this.c1.effectOfVerbalNote + this.c1.note * this.c1.effectOfExamNote;
        double fizikAverage = this.c2.verbalGrade * this.c2.effectOfVerbalNote + this.c2.note * this.c2.effectOfExamNote;
        double biyolojiAverage = this.c3.verbalGrade * this.c3.effectOfVerbalNote + this.c3.note * this.c3.effectOfExamNote;
        this.totalAvarage = (tarihAverage + fizikAverage + biyolojiAverage) / 3;
    }

    void isPass() {
        if (this.c1.note == 0 || this.c2.note == 0 || this.c3.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();

            System.out.println("Ortalama : " + this.totalAvarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.totalAvarage > 55;
    }

    void printNote() {
        System.out.println("-------------------------");
        System.out.println("Öğrenci: " + this.name);
        System.out.println(this.c1.name + " Notu :" + this.c1.note);
        System.out.println(this.c2.name + " Notu :" + this.c2.note);
        System.out.println(this.c3.name + " Notu :" + this.c3.note);

    }
}
