package School_Mangament_System;

public class Teacher {


	/**
	 * This class is responsible for keeping track of
	 * teachers Name, ID, and salary
	 */

	    private int id;
	    private String name;
	    private int salary;
	    private int salaryEarned;
	    
	    /**
	     * Creates a new Teacher object
	     * @param id - ID for the teacher
	     * @param name - Name of the teacher
	     * @param salary - Salary of the teacher
	     */
	    public Teacher(int id, String name, int salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	        this.salaryEarned = 0;  // Initially earned nothing
	    }
	    
	    // Getters
	    public int getId() {
	        return id;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public int getSalary() {
	        return salary;
	    }
	    
	    // Setter for salary (can change over time)
	    public void setSalary(int salary) {
	        this.salary = salary;
	    }
	    
	    /**
	     * Adds to the salary earned
	     * Removes from the total money earned by the school
	     * @param salary
	     */
	    public void receiveSalary(int salary) {
	        salaryEarned += salary;
	        School.updateTotalMoneySpent(salary);
	    }
	    
	    @Override
	    public String toString() {
	        return "Name of the teacher: " + name + 
	               " Total salary earned so far: $" + salaryEarned;
	    
	}
}
