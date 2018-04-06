/**
 * @author Jacob Nartey
 * 4. Students revisited
 *
 */
public class StudentsRevisited {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Creating an instance of Student class
		Student student = new Student();
		
		//Calling readData method to read from 3 files and print to console
		student.readData("/Users/user/Desktop/names.txt", "/Users/user/Desktop/grades.txt", "/Users/user/Desktop/gpas.txt");
	}

}
