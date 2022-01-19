package classesandobjects;

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student("Aditya", 11);
        Student s2 = new Student("Raghav", 17);
        Student s3 = new Student("Ragav", 16);

        System.out.println(Student.getNumStudents());
        System.out.println(Student.getNumStudents());
    }
}
