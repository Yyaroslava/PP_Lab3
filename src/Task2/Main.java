package Task2;

import java.io.*;

public class Main {
	public static void main(String[] args) {
		File directory = new File("fileD");
		// /*
		File file = new File(directory,"fileF.txt");
		try {
			// The mkdir() method is a part of File class, used to create a new directory denoted by the abstract pathname
			// returns true if directory is created else returns false
			directory.mkdir();
			// The createNewFile() function is a part of File class in Java, it creates new empty file
			// returns true if the abstract file path does not exist and a new file is created
			// returns false if the filename already exists.
			file.createNewFile();
			// signals that an I/O exception of some sort has occurred.
		} catch (IOException e) {
			// printStackTrace () helps you understand where the real problem is
			// Цей метод відображає повідомлення про помилку на консолі, де ми отримуємо виняток у вихідному коді
			// is a member of the Throwable class in the java.lang package
			e.printStackTrace();
		}
		// InputStream - an abstract class, describes the input stream
		//FileInputStream - class for reading information from a file
		try (InputStream inputStream = new FileInputStream("fileD/fileF.txt")) {
			// reads one bite, if there are no data: -1
			int ins = inputStream.read();
			while (ins != -1){
				System.out.print((char) ins);
				ins = inputStream.read();
			}
		}catch(IOException ex){
			ex.printStackTrace();
		}
        // */

	    /*
        File file = new File("fileF.txt");
        try {
          file.createNewFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        // try with resources
        // the transmitted object must implement a Closeable interface
        try (InputStream inputStream = new FileInputStream("fileF.txt")) {
            int ins = inputStream.read();
            while (ins != - 1){
                System.out.print((char) ins);
                ins = inputStream.read();
            }
        } catch (Exception ex2) {
            ex2.printStackTrace();
        }
        */
	}
}
