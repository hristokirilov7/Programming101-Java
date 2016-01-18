package problem03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Parser {
	public static Map<String, String> parseProperties(File file) throws IOException {
		Map<String, String> data = new HashMap<>();

		BufferedReader input = null;

		try {
			input = new BufferedReader(new FileReader(file));
			String buffer;
			while ((buffer = input.readLine()) != null)
			{
				String separated[] = buffer.split("=");
				data.put(separated[0], separated[1]);
			}

		} finally {
			if (input != null)
				input.close();
		}

		return data;
	}
}
