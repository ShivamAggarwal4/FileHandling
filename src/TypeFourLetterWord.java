import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class TypeFourLetterWord {
    static Scanner scanning = new Scanner(System.in);
    public static void main(String[] args) {
            char charactersForInputNumber[][] = new char[8][3];
            int digitsOfEnteredFourDigitNumber[] = new int[4];
            double inputFourDigitNumber = scanning.nextInt();
            inputFourDigitNumberDetectionAndCharacterAssigning(charactersForInputNumber,inputFourDigitNumber,digitsOfEnteredFourDigitNumber);
            printAndCreateWordsFormLetters(charactersForInputNumber,digitsOfEnteredFourDigitNumber);
    }
    public static void printAndCreateWordsFormLetters(char charactersForInputNumber[][],int digitsOfEnteredFourDigitNumber[]){
        try {
            PrintStream printStream = new PrintStream("txtmessage.txt");
        String finalWords;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        for (int m = 0; m < 3; m++) {
                            finalWords = "" + charactersForInputNumber[digitsOfEnteredFourDigitNumber[0]][j] + charactersForInputNumber[digitsOfEnteredFourDigitNumber[1]][k] + charactersForInputNumber[digitsOfEnteredFourDigitNumber[2]][l] + charactersForInputNumber[digitsOfEnteredFourDigitNumber[3]][m];
                            printStream.println(finalWords);
                            System.out.println(finalWords);
                            }
                    }
                }
            }
            printStream.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void inputFourDigitNumberDetectionAndCharacterAssigning(char charactersForInputNumber[][],double inputFourDigitNumber,int digitsOfEnteredFourDigitNumber[]){
        int count = 3;int digitsOfEnteredFourDigitNumberIndex = 0;
        for (int i = 0, m = 2; i < 8 && m < 10; i++, m++) {
            for (int j = 0, n = (65 + ((m - 2) * 3)); j < 3 && n < (65 + ((m - 1) * 3)); j++, n++) {
                charactersForInputNumber[i][j] = (char) n;


                if (m == (int) (inputFourDigitNumber / Math.pow(10, count))) {
                    digitsOfEnteredFourDigitNumber[digitsOfEnteredFourDigitNumberIndex] = i;
                    i = -1;
                    j = -1;
                    m = 1;
                    n = 64;
                    digitsOfEnteredFourDigitNumberIndex++;
                    inputFourDigitNumber = inputFourDigitNumber % Math.pow(10, count);
                    count--;
                }


            }

        }
    }
}
