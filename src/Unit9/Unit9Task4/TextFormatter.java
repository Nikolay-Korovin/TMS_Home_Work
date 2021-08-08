package Unit9.Unit9Task4;

import java.io.*;

public class TextFormatter {
    static final String FILENAME = "src\\Unit9\\Unit9Task4\\SourceTextFile.txt";
    static final String FILENAME2 = "src\\Unit9\\Unit9Task4\\DestinationFile.txt";

    public static void main(String[] args) throws IOException, InterruptedException {
        String[] str = readAndSplitText(FILENAME);
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            int n = numberOfWords(str[i]);
            boolean palindrome = isStringHavePalindrome(str[i]);
            if (palindrome || (n > 2 && n < 6)) {
                stringBuilder.append(str[i] + ". ");
            }
        }
        writeStringToFile(FILENAME2, stringBuilder.toString());
    }

    public static boolean isStringHavePalindrome(String str) {
        int spaces = findSpaces(str);
        int step = 0;
        boolean isPalindrome = false;
        StringBuilder stringBuilder = new StringBuilder();
        str = str.trim();
        for (int i = 0; i <= spaces; i++) {
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
        //StringBuilder stringBuilder1 = new StringBuilder(str.toLowerCase());
        //if (stringBuilder.length() >= 3 && stringBuilder.toString().equals(stringBuilder1.toString())) {
        if (stringBuilder.reverse().toString().equals(str.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }

    public static int findSpaces(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                counter++;
            }
        }
        return counter;
    }

    public static int numberOfWords(String str) {
        //str = str.trim();
        //int numOfWords = findSpaces(str);
        //return numOfWords + 1;
        return str.split(" ").length;
    }

    public static String[] readAndSplitText(String filename) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(FILENAME), "cp1251"));
        String text = bufferedReader.readLine();
        return text.split("[.!?]\\s*");
    }

    public static void writeStringToFile(String fileName, String str) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        String[] arrayWords = str.split("\\s+");
        for (String s : arrayWords) {
            fw.write(s + " ");
        }
        fw.close();
    }
}
