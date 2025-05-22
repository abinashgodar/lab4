package Implements;
import Abstract.FirstYearCourse;

public class Programming extends FirstYearCourse{

    @Override
    public
    void printName(){
        System.out.println("Course Name:Programming");

    }
    @Override
    public
    void printCode(){
        System.out.println("Course Code:777");

    }
    public static void main(String[] args) {
        Programming course = new Programming();
        course.printName();
        course.printCode();
        course.printTotalWeeks();
    }


}