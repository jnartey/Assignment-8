import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Jacob Nartey
 * 3. Storing a Student
 *
 */
public class Student {
	protected String name;
	protected String grade;
	protected double gpa;
	/**
	 * @param name
	 * @param grade
	 * @param gpa
	 */
	public Student(String name, String grade, double gpa) {
		this.name = name;
		this.grade = grade;
		this.gpa = gpa;
	}
	
	public Student() {
		
	}
	
	public Student input() {
		Scanner reader = new Scanner(System.in);
		
		//Prompting student for input
		System.out.println("Please enter your name");
		System.out.print("> ");
		String name = reader.nextLine();
		
		System.out.println("Please enter your grade");
		System.out.print("> ");
		String grade = reader.nextLine();
		
		System.out.println("Please enter your GPA");
		System.out.print("> ");
		double gpa = reader.nextDouble();
		
		reader.close();
		
		Student student = new Student(name, grade, gpa);
		
		return student;
	}
	
	public void storeData(String location, String line) {
		File file = new File(location);
		
		try {			
			FileWriter writer = new FileWriter(file, true); //Append true and overwrite is false
			writer.write(line + "\r\n");
			
			writer.close(); 	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Student data stored succesfully!");
		}
	}
	
	public void storeData(String location, double line) {
		File file = new File(location);
		
		try {			
			FileWriter writer = new FileWriter(file, true); //Append true and overwrite is false
			writer.write(line + "\r\n");
			
			writer.close(); 	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getInfo() {
		
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}
	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
}
