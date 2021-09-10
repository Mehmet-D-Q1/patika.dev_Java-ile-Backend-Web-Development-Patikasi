package patika_dev_java101;

public class Main {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Mahmut Demir","368996556","TRH");
        teacher1.printTeacherInfo();
        System.out.println("-----------------------------");
        Teacher teacher2 = new Teacher("Selim Duran","566589633","FZK");
        teacher2.printTeacherInfo();
        System.out.println("-----------------------------");
        Teacher teacher3 = new Teacher("Mert Yalın","986532145","BIO");
        teacher3.printTeacherInfo();
        System.out.println("-----------------------------");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(teacher1);
        System.out.println("-----------------------------");
        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(teacher2);
        System.out.println("-----------------------------");
        Course biyoloji = new Course("Biyoloji","101","BIO");
        biyoloji.addTeacher(teacher3);
        System.out.println("-----------------------------");

        Student student1 = new Student("Kemal Sunal","123456","4",tarih, fizik, biyoloji);
        student1.addBulkExamNote(100,75,50);
        student1.addBulkVerbalNote(50,50,50);
        student1.isPass();
        student1.c1.printTeacher();
        System.out.println("-----------------------------");
        Student student2 = new Student("Güdük Necmi","648792512","2",tarih, fizik, biyoloji);
        student2.addBulkExamNote(60,70,80);
        student1.addBulkVerbalNote(55,55,55);
        student2.isPass();
        student2.c2.printTeacher();
        System.out.println("-----------------------------");
        Student student3 = new Student("Hayri Keton","351212454","6",tarih, fizik, biyoloji);
        student3.addBulkExamNote(45,60,45);
        student1.addBulkVerbalNote(60,60,50);
        student3.isPass();
        student3.c3.printTeacher();

    }
}
