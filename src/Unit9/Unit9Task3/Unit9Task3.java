package Unit9.Unit9Task3;

//В исходном файле находятся слова, каждое слово на новой строке.
// После запуска программы должен создать файл, который будет содержать в себе только полиндромы.

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Unit9Task3 {
    static final String FILENAME = "src\\Unit9\\Unit9Task3\\SourceFile.txt";
    static final String FILENAME2 = "src\\Unit9\\Unit9Task3\\DestinationFile.txt";

    public static void main(String[] args) throws InterruptedException, IOException {
        writeStringToFile(FILENAME2, readString(new StringBuilder()).toString());
    }

    public static StringBuilder readString(StringBuilder stringBuilder2) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(FILENAME), StandardCharsets.UTF_8));
        FileWriter fw = null;
        String currentLine;
        boolean isNewFileCreated = false;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder1;

        while ((currentLine = bufferedReader.readLine()) != null) {
            stringBuilder = new StringBuilder(currentLine);
            stringBuilder1 = new StringBuilder(currentLine);
            if (!isNewFileCreated && stringBuilder.toString().equals((stringBuilder1.reverse()).toString())) {
                File file = new File(FILENAME2);
                fw = new FileWriter(file);
                isNewFileCreated = true;
            }
            if (stringBuilder.toString().equals((stringBuilder1.reverse()).toString()) && fw != null) {
                stringBuilder2.append(stringBuilder).append("\n");
            }
        }

        return stringBuilder2;
    }

    public static void writeStringToFile(String fileName, String str) throws IOException {
        FileWriter fw = new FileWriter(fileName, StandardCharsets.UTF_8);
        String[] arrayWords = str.split("\\s+");
        for (String s : arrayWords) {
            fw.write(s + "\n");
        }
        fw.close();
    }

}
