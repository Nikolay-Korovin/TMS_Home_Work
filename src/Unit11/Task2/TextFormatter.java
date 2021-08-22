package Unit11.Task2;

import java.io.*;
import java.util.Arrays;

public class TextFormatter {
    static final String FILENAME = "src\\Unit11\\Task2\\Source_file.txt";
    static final String FILENAME2 = "src\\Unit11\\Task2\\Destination_file.txt";

    public static void formatText(String sourceFile, String destinationFile) throws IOException {
        String[] text = readAndSplitText(FILENAME);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length; i++) {
            int n = numberOfWords(text[i]);
            boolean palindrome = isStringHavePalindrome(text[i]);
            if (palindrome || (n > 2 && n < 6)) {
                stringBuilder.append(text[i] + ". ");
            }
        }
        writeStringToFile(FILENAME2, stringBuilder.toString());
    }

    public static String[] readAndSplitText(String filename) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(FILENAME));
        StringBuilder stringBuilder = new StringBuilder();
        String tempStr;
        while ((tempStr = bufferedReader.readLine()) != null) {
            stringBuilder.append(tempStr);
        }
        bufferedReader.close();
        return stringBuilder.toString().split("[.!?]\\s*");
    }

    public static int numberOfWords(String str) {
        return str.split(" ").length;
    }

    public static boolean isStringHavePalindrome(String str) {
        int numberOfWords = numberOfWords(str);
        int step = 0;
        boolean isPalindrome = false;
        StringBuilder stringBuilder = new StringBuilder();
        str = str.trim();
        for (int i = 0; i < numberOfWords; i++) {
            for (int j = step; step < str.length() && str.charAt(j) != ' '; j++) {
                stringBuilder.append(str.charAt(j));
                step++;
            }
            step++;
            if (isPalindrome(stringBuilder.toString())) {
                isPalindrome = true;
                break;
            }
            stringBuilder = new StringBuilder();
        }
        return isPalindrome;
    }

    public static boolean isPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder(str.toLowerCase());
        if (str.length() >= 3 && stringBuilder.reverse().toString().equals(str.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }

    public static void writeStringToFile(String fileName, String str) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        String[] arrayWords = str.split("\\s+");
        for (String s : arrayWords) {
            fw.write(s + " ");
        }
        fw.close();
    }

    public static void main(String[] args) throws IOException {
        formatText(FILENAME, FILENAME2);
    }

}
