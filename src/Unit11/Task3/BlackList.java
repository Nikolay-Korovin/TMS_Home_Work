package Unit11.Task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class BlackList {
    static final String FILENAME = "src\\Unit11\\Task3\\Source_file.txt";
    static final String FILENAME2 = "src\\Unit11\\Task3\\Black_list.txt";

    //сам метод цензурирования
    public static void censorText(String sourceFile, String blackList) throws IOException {
        String[] textArr = readAndSplitText(sourceFile);
        String[] blackListArr = readAndSplitBL(blackList);
        String[] cursedStrings = new String[textArr.length];
        boolean mainCondition = false;
        int sentencesCounter = 0;

        for (int i = 0; i < textArr.length; i++) {
            String[] words = textArr[i].split(" ");
            mainCondition = isStringHaveBLWord(words, blackListArr);
            if (mainCondition) {
                sentencesCounter++;
                cursedStrings[sentencesCounter - 1] = textArr[i];
            }
        }
        if (!mainCondition) {
            System.out.println("текст соотвествует цензуре");
        } else {
            System.out.println("текст НЕ соотвествует цензуре");
            System.out.println("Количество предложений подлежащих исправлению = " + sentencesCounter);
            System.out.println();
            showArray(cursedStrings);
        }
    }

    //метод ищет слово из чёрного списка в предложениях из переданного массива
    public static boolean isStringHaveBLWord(String[] str, String[] bl) {
        boolean condition = false;
        for (int i = 0; i < str.length; i++) {
            String[] tempStr = str[i].split(" ");
            for (int j = 0; j < tempStr.length; j++) {
                if (compareWordToAllBL(tempStr[j], bl)) {
                    condition = true;
                    break;
                } else {
                    condition = false;
                }
            }
            if (condition) {
                break;
            }
        }
        return condition;
    }

    //сравниваем слово со всеми словами из чёрного списка
    public static boolean compareWordToAllBL(String str, String[] bl) {
        boolean condition = false;
        for (int i = 0; i < bl.length; i++) {
            if (str.equalsIgnoreCase(bl[i])) {
                condition = true;
                break;
            } else {
                condition = false;
            }
        }
        return condition;
    }

    //возвращаем массив с предложениями из текста
    public static String[] readAndSplitText(String filename) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        StringBuilder stringBuilder = new StringBuilder();
        String tempStr;
        while ((tempStr = bufferedReader.readLine()) != null) {
            stringBuilder.append(tempStr);
        }
        bufferedReader.close();
        return stringBuilder.toString().split("[.!?]\\s*");
    }

    //возвращаем массив со словами из чёрного списка
    public static String[] readAndSplitBL(String filename) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        StringBuilder stringBuilder = new StringBuilder();
        String tempStr;
        while ((tempStr = bufferedReader.readLine()) != null) {
            stringBuilder.append(tempStr);
        }
        bufferedReader.close();
        return stringBuilder.toString().split("[,]\\s*");
    }

    //просто выводим содержимое стринговых массивов
    public static void showArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        censorText(FILENAME, FILENAME2);
    }
}
