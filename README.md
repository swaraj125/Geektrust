This document explains how we compile and execute your solution in Java. You MUST only submit source code and not the JAR file.

Solution without Build files
If you are providing a solution without using the build file, we want you to name your Main class as Geektrust.java. This is the file that will contain your main method.

This file should receive in the command line argument and parse the file passed in. Once the file is parsed and the application processes the commands, it should only print the output.

For e.g your Geektrust.java file will look like this

public class Geektrust {

	public static void main(String[] args)  {
		String filePath = args[0];
		//Parse the file and call your code
		//Print the output
	}
....
....
}
We build and run the solution by using the following commands. Make sure if your have any config files, its in the classpath.

javac <path_of_package>/Geektrust.java
java -cp <code_path> <package>.Geektrust <absolute_path_to_input_file>
