import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Jacob Nartey
 * 2. Reading multiple files
 *
 */
public class MultipleFiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//File paths
		String filePath1 = "/Users/user/Desktop/courseCode.txt", filePath2 = "/Users/user/Desktop/courseName.txt";
		
		//File class objects of 2 file paths
		File file1 = new File(filePath1);
		File file2 = new File(filePath2);
		
		//String to be assigned concatenated string text
		String joinedLine = "";
		
		//ArrayList object data
		ArrayList <String> data = new ArrayList<String>();
		
		try {
			
			//Scanner objects to read files
			Scanner input1 = new Scanner(file1);
			Scanner input2 = new Scanner(file2);
			
			//While loop to add concatenated string elements to ArrayList object
			while(input1.hasNextLine() && input2.hasNextLine()) {
				//String variables assigned text read from file
				String line1 = input1.nextLine();
				String line2 = input2.nextLine();
				
				//Concatenating string variables with a '-';
				joinedLine = line1 + " - " + line2;
				
				//Adding concatenated string elements to ArrayList object
				data.add(joinedLine);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist!");
		}
		
		//Print
		for(String textLine : data) {
			System.out.println(textLine);
		}
	}

}
