package com.thinkinginjava.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class FileOutputShortcut {
    static String file = "/Users/pavel/Documents/Java/text.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
                new StringReader(
                        BufferedInputFile.read("/Users/pavel/Documents/Java/text.txt")));
        // Here's the shortcut:
        PrintWriter out = new PrintWriter(file);
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null) {
            out.println(lineCount++ + ": " + s);
        }
        out.close();
        // Show the stored file:
        System.out.println(BufferedInputFile.read(file));
    }
}
