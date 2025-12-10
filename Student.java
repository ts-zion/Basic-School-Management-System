package School_Mangament_System;
/**
 * This class is responsible for keeping track of students
 * ID, name, grade, and fees paid
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;
    
    /**
     * Constructor to create a new Student object
     * @param id - ID for the student (unique value)
     * @param name - Name of the student
     * @param grade - Grade of the student
     */
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;  // Initially, no fees paid
        this.feesTotal = 30000;  // $30,000 per year
    }
    
    /**
     * Used to update the student's grade
     * @param grade - new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    /**
     * Add the fees to the fees paid field
     * Keep adding the fees to the existing fees paid
     * @param fees - the fees that the student pays
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(fees);
    }
    
    // Getters
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getGrade() {
        return grade;
    }
    
    public int getFeesPaid() {
        return feesPaid;
    }
    
    public int getFeesTotal() {
        return feesTotal;
    }
    
    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }
    
    @Override
    public String toString() {
        return "Student name: " + name + 
               " Total fees paid so far: $" + feesPaid;
    }
}