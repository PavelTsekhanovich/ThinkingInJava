package com.thinkinginjava.io;

import java.io.*;

public class Redirecting {
    public static void main(String[] args)
            throws IOException {
        PrintStream console = System.out;
        BufferedInputStream in = new BufferedInputStream(
                new FileInputStream("/Users/pavel/Documents/Java/text.txt"));
        PrintStream out = new PrintStream(
                new BufferedOutputStream(
                        new FileOutputStream("/Users/pavel/Documents/Java/textOut.txt")));
        System.setIn(in);
        System.setOut(out);
        System.setErr(out);
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null)
            System.out.println(s);
        out.close(); // Remember this!
        System.setOut(console);
    }
}
