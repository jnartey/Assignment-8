import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Jacob Nartey
 * 1. Reading a single file
 */
public class SingleFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//File path or location
		String location = "C:\\Users\\Students\\Desktop\\hello.txt";
		ArrayList <String> data = new ArrayList<String>();
		
		File file = new File(location);
		
		try {
			Scanner reader = new Scanner(file);
			
			while(reader.hasNextLine()) {
				String line = reader.nextLine();
				data.add(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist!");
		}
		
		//Printing the lines of the file.
		System.out.println(
				"Printing lines of file\n"
				+ "---------------------"
				);
		for(String text : data) {
			System.out.println(text);
		}
		
		System.out.println("");
		
		//Modify the program to print the lines of the file backwards.
		int dataSize = data.size() - 1;
		
		System.out.println(
				"Printing lines of file backwards\n"
				+ "--------------------------------"
				);
		
		for(int i = dataSize; i >= 0; --i) {
			System.out.println(data.get(i));
		}
	}

}
