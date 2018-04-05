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
		// TODO Auto-generated method stub
		String filePath1 = "C:\\Users\\Students\\Desktop\\courseCode.txt", filePath2 = "C:\\Users\\Students\\Desktop\\courseName.txt";
		
		File file1 = new File(filePath1);
		File file2 = new File(filePath2);
		
		String joinedLine = "";
		
		ArrayList <String> data = new ArrayList<String>();
		
		try {
			Scanner input1 = new Scanner(file1);
			Scanner input2 = new Scanner(file2);
			
			while(input1.hasNextLine() && input2.hasNextLine()) {
				String line1 = input1.nextLine();
				String line2 = input2.nextLine();
				
				joinedLine = line1 + " - " + line2;
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
