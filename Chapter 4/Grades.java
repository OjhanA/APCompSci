/***************************************************************
 * Program that keeps track of grades for students
 * @author Ojhan Ardalan
 * October 20 2016
 ****************************************************************/
public class Grades {
    public static void main(String[] args) {
        System.out.print("\f");
        Student student1 = new Student("Mary");
        Student student2 = new Student("Mike");//create student2, "Mike"

        student1.inputGrades();//input grades for Mary
        System.out.println(student1.getAverage());//print average for Mary

        System.out.println();

        student2.inputGrades();//input grades for Mike
        System.out.println(student2.getAverage());//print average for Mike
        
        System.out.println();
        
        System.out.println(student1.toString());
        System.out.println(student2.toString());

    }
}
