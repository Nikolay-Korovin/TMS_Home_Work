package Unit4;
//крестики нолики

import java.util.Scanner;

public class CrossZero {
    static int theStupidityMeter1 = 0;
    static int theStupidityMeter2 = 0;
    static int[] checkArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        char[][] array = new char[3][3];
        char numbers = 1;
        boolean work = true;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                array[i][j] = numbers;
                System.out.print((int) array[i][j] + " ");
                ++numbers;
            }

            System.out.println();
        }

        while (work) {
            firstPlayerTurn(sc, array);
            display(array);
            work = check(array);
            if (!work) {
                break;
            }

            secondPlayerTurn(sc, array);
            display(array);
            work = check(array);
        }

    }

    static void firstPlayerTurn(Scanner sc, char[][] array) {
        System.out.println("ход игрока 1, введите координату цифру");
        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            char y = (char) x;
            while (true) {
                if (secondCheck(checkArray, x)) {                         //x >= 1 && x <= 9
                    for (int i = 0; i < array.length; ++i) {
                        for (int j = 0; j < array.length; ++j) {
                            if (y == array[i][j]) {
                                array[i][j] = 'X';
                            }
                        }
                    }
                    break;
                } else {
                    System.out.println("Место уже занято, введите другую координату");
                    if (sc.hasNextInt()) {
                        x = sc.nextInt();
                        y = (char) x;
                    }
                }
            }
        } else {
            ++theStupidityMeter1;
            System.out.println("Надо было вводить цифру, переход хода, счётчик невменяемости первого игрока " + theStupidityMeter1 + " :]");
            sc.next();
        }

    }

    static void secondPlayerTurn(Scanner sc, char[][] array) {
        System.out.println("ход игрока 2, введите координату цифру");
        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            char y = (char) x;
            while (true) {
                if (secondCheck(checkArray, x)) {
                    for (int i = 0; i < array.length; ++i) {
                        for (int j = 0; j < array.length; ++j) {
                            if (y == array[i][j]) {
                                array[i][j] = 'O';
                            }
                        }
                    }
                    break;
                } else {
                    System.out.println("Место уже занято, введите другую координату");
                    if (sc.hasNextInt()) {
                        x = sc.nextInt();
                        y = (char) x;
                    }
                }
            }
        } else {
            ++theStupidityMeter2;
            System.out.println("Надо было вводить цифру, переход хода, счётчик невменяемости второго игрока " + theStupidityMeter2 + " :]");
            sc.next();
        }

    }

    static void display(char[][] array) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                if (array[i][j] != 'X' && array[i][j] != 'O') {
                    System.out.print((int) array[i][j] + " ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    static boolean check(char[][] array) {
        int counter = 0;
        boolean condition = false;
        int i;
        int j;

        for (i = 0; i < array.length; ++i) {
            for (j = 0; j < array[i].length; ++j) {
                if (array[i][j] == 'X') {
                    ++counter;
                }
            }

            if (counter == 3) {
                System.out.println("Игрок 1 победил! ");
                condition = true;
                return false;
            }

            counter = 0;
        }

        for (i = 0; i < array.length; ++i) {
            for (j = 0; j < array.length; ++j) {
                if (array[j][i] == 'X') {
                    ++counter;
                }
            }

            if (counter == 3) {
                System.out.println("Игрок 1 победил! ");
                condition = true;
                return false;
            }

            counter = 0;
        }

        for (i = 0; i < array.length; ++i) {
            if (array[i][i] == 'X') {
                ++counter;
                if (counter == 3) {
                    System.out.println("Игрок 1 победил! ");
                    condition = true;
                    return false;
                }
            }
        }

        counter = 0;
        i = 0;

        for (j = array.length - 1; i < array.length; --j) {
            if (array[i][j] == 'X') {
                ++counter;
                if (counter == 3) {
                    System.out.println("Игрок 1 победил! ");
                    condition = true;
                    return false;
                }
            }

            ++i;
        }

        counter = 0;

        for (i = 0; i < array.length; ++i) {
            for (j = 0; j < array[i].length; ++j) {
                if (array[i][j] == 'O') {
                    ++counter;
                }
            }

            if (counter == 3) {
                System.out.println("Игрок 2 победил! ");
                condition = true;
                return false;
            }

            counter = 0;
        }

        for (i = 0; i < array.length; ++i) {
            for (j = 0; j < array.length; ++j) {
                if (array[j][i] == 'O') {
                    ++counter;
                }
            }

            if (counter == 3) {
                System.out.println("Игрок 2 победил! ");
                condition = true;
                return false;
            }

            counter = 0;
        }

        for (i = 0; i < array.length; ++i) {
            if (array[i][i] == 'O') {
                ++counter;
                if (counter == 3) {
                    System.out.println("Игрок 2 победил! ");
                    condition = true;
                    return false;
                }
            }
        }

        counter = 0;
        i = 0;

        for (j = array.length - 1; i < array.length; --j) {
            if (array[i][j] == 'O') {
                ++counter;
                if (counter == 3) {
                    System.out.println("Игрок 2 победил! ");

                    return false;
                }
            }

            ++i;
        }
        counter = 0;

        for (i = 0; i < array.length; ++i) {
            for (j = 0; j < array[i].length; ++j) {
                if (array[i][j] == 'X' || array[i][j] == 'O') {
                    ++counter;
                }
            }
        }

        if(counter == 9 && !condition){
            System.out.println("ничья");
            return false;
        }

        return true;
}

    static boolean secondCheck(int[] checkArray, int x) {
        boolean smth = true;
        for (int i = 0; i < checkArray.length; i++) {
            if (x >= 1 && x <= 9 && x == checkArray[i]) {
                checkArray[x - 1] = 1000;
                smth = true;
                break;
            } else {
                //System.out.println("Эта клетка уже занята");
                smth = false;
            }
        }
        return smth;
    }
}