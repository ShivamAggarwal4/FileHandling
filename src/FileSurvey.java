import java.io.*;
import java.util.Scanner;

public class FileSurvey {
    public static void main(String[] args) {
    writingInNumberFile();
    readingTheNumberFile();

    }
    public static void writingInNumberFile(){
        try {
            PrintWriter fileout = new PrintWriter(new FileWriter("numbers.txt"));
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your number");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                fileout.println(i);
            }
            fileout.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void readingTheNumberFile() {
        try {
           FileReader fileReader = new FileReader("numbers.txt");
           PrintWriter result= new PrintWriter(new FileWriter("output.txt"));
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char)i);
                result.print((char)i);
            }
            fileReader.close();
            result.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
