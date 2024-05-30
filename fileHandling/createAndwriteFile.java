// //create new file and write file
// package fileHandling;

// import java.io.File; //for
// import java.io.IOException;

// public class createAndwriteFile {
// public static void main(String[] args) {
// try {
// File myObj = new File("text.txt");
// if (myObj.createNewFile()) {
// System.out.println("file is created" + myObj.getName());
// } else {
// System.out.println("File already exists.");
// }
// } catch (IOException e) {
// System.out.println("something error");
// e.printStackTrace();
// }
// System.out.println("hello");
// }
// }
///////////////////////////////////////////////////////////////////
// //create file
// package fileHandling;

// import java.io.File;
// import java.io.IOException;

// public class createAndwriteFile {
// public static void main(String[] args) {
// try {
// File myobj = new File("newFile.txt");
// if (myobj.createNewFile()) {
// System.out.println("file created" + myobj.getName());
// } else {
// System.out.println("file already present here");
// }
// } catch (IOException e) {
// System.out.println("some error");
// }
// }
// }

////////////////////////////////////////////////////////////////////////////////
// write file
package fileHandling;

import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors

public class createAndwriteFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("newFile.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}