public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT", 101);
        Course fizik = new Course("Fizik", "FZK", 102);
        Course kimya = new Course("Kimya", "KMY", 103);


        Teacher t1 = new Teacher("Ahmet", "05000", "MAT");
        Teacher t2 = new Teacher("Ayşe", "050111", "FZK");
        Teacher t3 = new Teacher("Zeynep", "050222", "KMY");
        mat.addTeacher(t1);
        mat.printTeacher();
        fizik.addTeacher(t2);
        fizik.printTeacher();
        kimya.addTeacher(t3);
        kimya.printTeacher();


        Student st1 = new Student("Mehmet", "1111", 1, mat, fizik, kimya);
        st1.addBulkExamNote(50, 80, 20);
        st1.addSozluNote(50, 40, 100);
        st1.calcTotalNote();
        st1.calcAvarage();
        st1.printNote();

        Student st2 = new Student("Ece", "222", 3, mat, fizik, kimya);
        st2.addBulkExamNote(80, 90, 100);
        st2.addSozluNote(90, 95, 100);
        st2.calcTotalNote();
        st2.calcAvarage();
        st2.printNote();

        Student st3 = new Student("Eda", "333", 2, mat, fizik, kimya);
        st3.addBulkExamNote(75, 55, 60);
        st3.addSozluNote(80, 70, 70);
        st3.calcTotalNote();
        st3.calcAvarage();
        st3.printNote();
    }
}