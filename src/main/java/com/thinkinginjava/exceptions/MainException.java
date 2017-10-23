//: com.thinkinginjava.exceptions/MainException.java

import java.io.FileInputStream;

public class MainException {
    // Pass all com.thinkinginjava.exceptions to the console:
    public static void main(String[] args) throws Exception {
        // Open the file:
        FileInputStream file =
                new FileInputStream("MainException.java");
        // Use the file ...
        // Close the file:
        file.close();
    }
} ///:~
