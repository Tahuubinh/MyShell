package Hello;
import java.io.File;

//importing the FileReader class
import java.io.Reader;
import java.io.Writer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Main {
	public static void main(String[] args) {
		File file = new File("output.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Writer writer;
		try {
			writer = new FileWriter("output.txt");
			writer.append("Hello");
			writer.append("Hi");
			writer.write("2");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		char[] array = new char[100];
		try {
			Reader reader= new FileReader("output.txt");
			reader.read(array);
			System.out.println(array);
			reader.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}