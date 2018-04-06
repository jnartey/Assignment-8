import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
	
	//Empty constructor
	public Student() {
		
	}
	
	/**
	 * Read input
	 * @return Student object
	 */
	public Student input() {
		Scanner reader = new Scanner(System.in);
		
		//Prompting student for input
		System.out.println("Please enter student's name");
		System.out.print("> ");
		String name = reader.nextLine();
		
		System.out.println("Please enter student's grade");
		System.out.print("> ");
		String grade = reader.nextLine();
		
		System.out.println("Please enter student's GPA");
		System.out.print("> ");
		double gpa = reader.nextDouble();
		
		reader.close();
		
		//Adding input to student object 
		Student student = new Student(name, grade, gpa);
		
		//Return Student object
		return student;
	}
	
	/**
	 * Store data to a file location
	 * @param location
	 * @param line
	 */
	public void storeData(String location, String line) {
		//Instantiating File class with file path parameter (location)
		File file = new File(location);
		
		try {	
			//Instantiating FileWriter to write to file
			FileWriter writer = new FileWriter(file, true); //Append true and overwrite is false
			
			//Writing text to file line by line
			writer.write(line + "\r\n");
			
			//Close file after writing
			writer.close(); 	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Store data to a file location
	 * @param location
	 * @param line
	 */
	public void storeData(String location, double line) {
		//Instantiating File class with file path parameter (location)
		File file = new File(location);
		
		try {	
			//Instantiating FileWriter to write to file
			FileWriter writer = new FileWriter(file, true); //Append true and overwrite is false
			
			//Writing text to file line by line
			writer.write(line + "\r\n");
			
			//Close file after writing
			writer.close(); 	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Convert 3 file sources to csv format and store in students.csv
	 * @param location1
	 * @param location2
	 * @param location3
	 */
	public void convertToCSV(String csvLocation, String location1, String location2, String location3) {
		//Files instance to read 3 text files and 1 CSV file
		File fileCSV = new File(csvLocation);
		File file1 = new File(location1);
		File file2 = new File(location2);
		File file3 = new File(location3);
		
		//3 instances of ArrayLists to take 3 text files inputs of string
		ArrayList<String> data1 = new ArrayList<String>();
		ArrayList<String> data2 = new ArrayList<String>();
		ArrayList<String> data3 = new ArrayList<String>();
		
		try {
			//Scanner reading 3 text files
			Scanner input1 = new Scanner(file1);
			Scanner input2 = new Scanner(file2);
			Scanner input3 = new Scanner(file3);
						
			//looping line by line and storing it into ArrayList objects
			while(input1.hasNextLine() && input2.hasNextLine() && input3.hasNextLine()) {
				data1.add(input1.nextLine());
				data2.add(input2.nextLine());
				data3.add(input3.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
		
		try {	
			
			//Instantiating FileWriter to write to file
			FileWriter writer = new FileWriter(fileCSV); //Overwrite is true
			
			//Writing to file in CSV format line by line using a for loop
			for(int i = 0; i < data1.size(); i++) {
				writer.write(data1.get(i) + "," + data2.get(i) + "," + data3.get(i) + "\r\n");
			}
			
			//Close file after writing
			writer.close(); 	
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * store csv file
	 * @param location
	 */
	public void storeCSV(String location) {
		///Instantiating File class with file path parameter (location)
		File file = new File(location);
		
		//
		Student student = new Student();
		
		try {		
			//Instantiating FileWriter to write to file
			FileWriter writer = new FileWriter(file, true); //Append true and overwrite is false
			
			//Write to file in CSV format
			writer.write(student.getName() + "," + student.getGrade() + "," + student.getGpa() + "\r\n");
			
			//Close file after writing
			writer.close(); 	
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Read data from 3 files
	 * @param location1
	 * @param location2
	 * @param location3
	 */
	public void readData(String location1, String location2, String location3) {
		//Instantiating File class with file path parameter (location)
		File file1 = new File(location1);
		File file2 = new File(location2);
		File file3 = new File(location3);
		
		//Student ArrayList Objects
		ArrayList<String> data1 = new ArrayList<String>();
		ArrayList<String> data2 = new ArrayList<String>();
		ArrayList<String> data3 = new ArrayList<String>();
		
		try {
			//Read files from 3 text files
			Scanner input1 = new Scanner(file1);
			Scanner input2 = new Scanner(file2);
			Scanner input3 = new Scanner(file3);
						
			while(input1.hasNextLine() && input2.hasNextLine() && input3.hasNextLine()) {
				//Add text to ArrayList objects
				data1.add(input1.nextLine());
				data2.add(input2.nextLine());
				data3.add(input3.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Creating Student object array
		Student[] students = new Student[data1.size()];
		
		//Storing student objects into Student[] array
 		if(data1.size() == data2.size() && data1.size() == data3.size()) {
			for(int i = 0; i < data1.size(); i++) {
				students[i] = new Student(data1.get(i), data2.get(i), Double.parseDouble(data3.get(i)));
			}
			
			//Looping Student object and printing to console
			for(Student student : students) {
				//Calling the getInfo method to print to console
				student.getInfo(student);
			}
		}else {
			System.out.println("Inconsisitent values in files");
		}
	}
	
	/**
	 * read csv file
	 * @param location
	 */
	public void readCSV(String location) {
		//Instantiating File class with file path parameter (location)
		File file = new File(location);
		
		//Student ArrayList Object
		ArrayList<Student> data = new ArrayList<Student>();
		
		try {
			Scanner input = new Scanner(file);
			
			while(input.hasNextLine()) {
				
				//storing the line in a String array.
				String line[] = input.nextLine().split(",");
				
				//immediately storing the data from that array in a Student object.
				data.add(new Student(line[0], line[1], Double.parseDouble(line[2])));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int index = 0;
		//Student object array student[]
		Student[] array = new Student[data.size()];
		
		//Finally, adding the Student object to your Student[] array and continue with the loop.
		for(Student student : data) {
			array[index] = student;
			index++;
		}
		
		//looping through Student[] array and calling getInfo method on each student object
		for(Student student : array) {
			//Calling the getInfo method to print to console
			getInfo(student);
		}
	}
	
	
	/**
	 * Get info method to print to console
	 * @param student object
	 */
	public void getInfo(Student student) {
		System.out.println("My name is " + student.getName() + ". I'm in grade " + student.getGrade() + " and I have a " + student.getGpa() + " GPA. For now, at least...");
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
