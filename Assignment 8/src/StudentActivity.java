import java.util.Scanner;

/**
 * @author Jacob Nartey
 * 3. Storing a Student
 *
 */
public class StudentActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Creating an instance of Student class
		Student student = new Student();
		
		//Taking input
		Student studentData = student.input();
		
		//Writing inputs to text files names, grades and gpas
		student.storeData("/Users/user/Desktop/names.txt", studentData.getName());
		student.storeData("/Users/user/Desktop/grades.txt", studentData.getGrade());
		student.storeData("/Users/user/Desktop/gpas.txt", studentData.getGpa());
		System.out.println("Student added successfully!");
	}

}
