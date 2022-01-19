package classesandobjects;

public class Student {
   public String name;
    final private int rollNumber;
    double cgpa;
    final static double CONVERSIONFACTOR = 0.95;
    private static int numStudents;

    public Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
        numStudents++;
    }

    public static int getNumStudents(){
        return numStudents;
    }
}
