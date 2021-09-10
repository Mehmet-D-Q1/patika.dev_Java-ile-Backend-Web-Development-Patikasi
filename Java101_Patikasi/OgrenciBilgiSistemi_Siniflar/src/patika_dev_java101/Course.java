package patika_dev_java101;

public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalGrade;
    double effectOfVerbalNote = 0.2;
    double effectOfExamNote = 0.8;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;


    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            System.out.println("Öğretmen ile ders uyumlu.");

        }
        else {
            System.out.println("Öğretmen ile Ders bölümleri uyuşmuyor.");
        }

    }

    void printTeacher(){

        if (teacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + teacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }

    }
}
