package problem02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class FileUtils {
	private static FileUtils instance = null;

	private FileUtils() {
	}

	public static FileUtils getInstance() {
		if (instance == null) {
			instance = new FileUtils();
		}
		return instance;
	}

	public static String readFrom(File file) throws IOException {
		BufferedReader input = null;
		StringBuilder builder = new StringBuilder();
		try {
			input = new BufferedReader(new FileReader(file));
			String tmp;
			while ((tmp = input.readLine()) != null) {
				builder.append(tmp);
			}
		} finally {
			if (input != null)
				input.close();
		}
		return builder.toString();
	}

	public static String readFrom(Path path) throws IOException {
		return readFrom(path.toFile());
	}

	public static void writeIn(File file, String text) throws IOException {
		//BufferedWriter output = null;
		try (BufferedWriter output = new BufferedWriter(new FileWriter(file))){
			//output = new BufferedWriter(new FileWriter(file));
			output.write(text);
		}/* finally {
			if (output != null) {
				output = null;
			}
		}*/
	}

	public static void writeIn(Path path, String text) throws IOException {
		writeIn(path.toFile(), text);
	}
}
