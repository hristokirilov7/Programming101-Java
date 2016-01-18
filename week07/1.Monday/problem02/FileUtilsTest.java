package problem02;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import org.junit.Test;

public class FileUtilsTest {

	@Test
	public void testReadFromFile() throws IOException {
		String expected = "Test input.";
		String actual = FileUtils.readFrom(new File("src/problem02/testInput.txt"));
		assertEquals(actual.toString(), expected, actual);
	}

	@Test(expected = IOException.class)
	public void testExceptionReadFromFile() throws IOException {
		FileUtils.readFrom(new File("testInput.txt"));

	}

	@Test
	public void testReadFromPath() throws IOException {
		String expected = "Test input.";
		String actual = FileUtils.readFrom(Paths.get("src/problem02/testInput.txt"));
		assertEquals(expected, actual);
	}

	@Test(expected = IOException.class)
	public void testExceptionReadFromPath() throws IOException {
		FileUtils.readFrom(Paths.get("testInput.txt"));

	}

}
