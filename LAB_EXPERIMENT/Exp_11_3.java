import java.io.*;

public class Exp_11_3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileWordCount <filename>");
            System.exit(1);
        }

        String filename = args[0];
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                charCount += line.length();
                wordCount += line.split("\\s+").length; // Split by whitespace to count words
                lineCount++;
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            System.exit(2);
        }

        System.out.println("Character count: " + charCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Line count: " + lineCount);
    }
}
