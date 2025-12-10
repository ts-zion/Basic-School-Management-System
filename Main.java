package School_Mangament_System;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create Teachers
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher melissa = new Teacher(2, "Melissa", 700);
        Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);
        
        // Create Students
        Student tamasha = new Student(1, "Tamasha", 4);
        Student rakshit = new Student(2, "Rakshit", 12);
        Student rabbi = new Student(3, "Rabbi", 5);
        
        // Create Lists
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(vanderhorn);
        
        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rakshit);
        studentList.add(rabbi);
        
        // Create School
        School ghs = new School(teacherList, studentList);
        
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());
        
        // Students pay fees
        tamasha.payFees(5000);
        rakshit.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());
        
        // Pay teacher salaries
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName() + 
                           " and now has $" + ghs.getTotalMoneyEarned());
        
        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.getName() + 
                           " and now has $" + ghs.getTotalMoneyEarned());
        
        melissa.receiveSalary(melissa.getSalary());
        System.out.println(melissa);
        
        // Adding new teacher
        Teacher megan = new Teacher(6, "Megan", 900);
        ghs.addTeacher(megan);
        
        // Print student info
        System.out.println(rakshit);
    }
}