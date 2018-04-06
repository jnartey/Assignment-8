/**
 * @author Jacob Nartey
 * 5. There has to be a better way
 *
 */
public class StudentCSV {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Instantiating Student class
		Student student = new Student();
		
		//Reading the 3 files sources and storing it into students.csv in csv format
		student.convertToCSV("/Users/user/Desktop/students.csv", "/Users/user/Desktop/names.txt", "/Users/user/Desktop/grades.txt", "/Users/user/Desktop/gpas.txt");
		
		//Reading csv file students.csv of Student objects array
		student.readCSV("/Users/user/Desktop/students.csv");
	}

}
