public class Student {
    String name;
    String stuNo;
    int classes;
    Course course1;
    Course course2;
    Course course3;
    double average = 0;

    Student(String name, String stuNo, int classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;

    }

    void addBulkExamNote(int course1Note, int course2Note, int course3Note) {
        if (course1Note >= 0 || course1Note <= 100) {
            this.course1.note = course1Note;
        }
        if (course2Note >= 0 || course2Note <= 100) {
            this.course2.note = course2Note;
        }
        if (course3Note >= 0 || course3Note <= 100) {
            this.course3.note = course3Note;
        }
    }

    void addSozluNote(int course1sozlu, int course2sozlu, int course3sozlu) {
        if (course1sozlu >= 0 || course1sozlu <= 100) {
            this.course1.sozluNote = course1sozlu;
        }
        if (course2sozlu >= 0 || course2sozlu <= 100) {
            this.course2.sozluNote = course2sozlu;
        }
        if (course3sozlu >= 0 || course3sozlu <= 100) {
            this.course3.sozluNote = course3sozlu;
        }
    }

    void calcTotalNote(){
        this.course1.totNote = ((course1.note * 0.8) + (course1.sozluNote * 0.2));
        this.course2.totNote = ((course2.note * 0.8) + (course2.sozluNote * 0.2));
        this.course3.totNote = ((course3.note * 0.8) + (course3.sozluNote * 0.2));
    }
    void calcAvarage() {
        this.average = (this.course1.totNote + this.course2.totNote + this.course3.totNote) / 3;
    }

    boolean checkIsPass(){
         return this.average > 55;
    }

    void printNote() {

        System.out.println(course1.name + "dersinin notu :" + this.course1.note);
        System.out.println(course2.name + "dersinin notu :" + this.course2.note);
        System.out.println(course3.name + "dersinin notu :" + this.course3.note);
        System.out.println(course1.name + "dersinin sözlü notu :" + this.course1.sozluNote);
        System.out.println(course2.name + "dersinin sözlü notu :" + this.course2.sozluNote);
        System.out.println(course3.name + "dersinin sözlü notu :" + this.course3.sozluNote);
        if (checkIsPass()) {
            System.out.println("Tebrikler! Sınıfı " + this.average + " not ortalamasıyla geçtiniz.");
        } else {
            System.out.println("Sınıfta kaldınız.");
        }
        System.out.println("========================================");
    }
}
