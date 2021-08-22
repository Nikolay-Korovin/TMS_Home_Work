package Unit11.Task1;

//1)В исходном файле находятся слова, каждое слово на новой строке.
//После запуска программы должен создать файл, который будет содержать в себе только палиндромы.

import java.io.*;

public class Unit11Task1 {
    static final String FILE1 = "src//Unit11//Task1//Source_file.txt";
    static final String FILE2 = "src//Unit11//Task1//Destination_file.txt";

    public static String readOnlyPalindromes(String sourceFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(sourceFile));
        StringBuilder stringBuilder;
        StringBuilder stringBuilderFinal = new StringBuilder();
        String s;
        while ((s = br.readLine()) != null) {
            stringBuilder = new StringBuilder(s);
            if (s.equals(stringBuilder.reverse().toString())) {
                stringBuilderFinal.append(stringBuilder).append("\n");
            }
        }
        br.close();
        return stringBuilderFinal.toString();
    }

    public static void writeStringToFile(String destinationFileName, String str) throws IOException {
        FileWriter fw = new FileWriter(destinationFileName);
        String[] arrayWords = str.split("\\s+");
        for (String s : arrayWords) {
            fw.write(s + "\n");
        }
        fw.close();
    }

    public static void main(String[] args) throws IOException {
        writeStringToFile(FILE2, readOnlyPalindromes(FILE1));
    }
}
