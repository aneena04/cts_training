package com.cts.test;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BasicOperations {
	public static void main(String[] args) throws IOException {
		// FileSystem fs=FileSystems.getDefault();
		// Path path=fs.getPath("C:/Users/Dell/Desktop");
		Path path = Paths.get("C:/Users/Dell/Desktop");
		System.out.println("name count:" + path.getNameCount());
		System.out.println("is absolte" + path.isAbsolute());
		System.out.println("name  :" + path.getName(2));
		//Path newfile = Paths.get("C:/Users/Dell/Desktop/Java/xxx.txt");
		//Path n11 = Paths.get("C:/Users/Dell/Desktop/Java/aa4");
		//Path n12 = Paths.get("C:/Users/Dell/Desktop/Java/abc");

		// Files files=Files.delete(newfile);
		// Path n=Paths.get("C:/Users/Dell/Desktop/Java/new11.txt");
		// Files.delete(newfile);
		// Files.copy(newfile, n);
		// Files.createFile(newfile);
		//Files.createDirectory(n12);
	}

}
