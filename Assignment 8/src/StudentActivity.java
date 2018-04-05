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
		
		student.storeData("C:\\Users\\Students\\Desktop\\names.txt", studentData.getName());
		student.storeData("C:\\Users\\Students\\Desktop\\grades.txt", studentData.getGrade());
		student.storeData("C:\\Users\\Students\\Desktop\\gpas.txt", studentData.getGpa());
	}

}
