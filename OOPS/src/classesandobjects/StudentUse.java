package classesandobjects;

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Aditya";
        s1.rollNumber = 17;
        System.out.println(s1.name + " " + s1.rollNumber);

        s2.name = "Raghav";
        s2.rollNumber = 31;
        System.out.println(s2.name + " " + s2.rollNumber);
    }
}
