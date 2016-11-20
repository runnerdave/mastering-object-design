package net.runnerdave.school;

/**
 * Created by davidajimenez on 20/11/2016.
 */
public class SchoolOperations {
    public static void main(String[] args) {
        System.out.println("== Welcome to the school operations ==");

        System.out.println("\n== Enter maths teacher ==");
        CourseInstructor mathsTeacher = new MathTeacher();
        ((SchoolStaff)mathsTeacher).performOtherResponsibilities();
        mathsTeacher.teach();

        System.out.println("\n== Enter english teacher ==");
        SchoolStaff englishTeacher = new EnglishTeacher();
        englishTeacher.performOtherResponsibilities();
        ((CourseInstructor)englishTeacher).teach();

        System.out.println("\n== Enter substitute teacher ==");
        SchoolStaff substituteTeacher = new SubstituteTeacher();
        substituteTeacher.performOtherResponsibilities();
        try {
            ((CourseInstructor)substituteTeacher).teach();
        } catch (Exception e) {
            System.out.println("substitute teachers cannot teach... unfortunately");
        }
    }
}
