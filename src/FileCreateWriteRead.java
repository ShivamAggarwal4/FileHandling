import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreateWriteRead {
    public static void main(String[] args) {
//        creating a file
        File myFile = new File("manjulika.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
//      writing a fie
        try {
            FileWriter fileWriter = new FileWriter("manjulika.txt");
            fileWriter.write("Amijetomaar sudhuje tomaar aaAA AAaaaaaaa\nTananana dhun tananana dhun \nsa sa re re sa sa re re sa re sa");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        reading a file
        File myfile=new File("manjulika.txt");
        try {
            Scanner scanning = new Scanner(myFile);
            while(scanning.hasNextLine()){
                System.out.println(scanning.nextLine());
            }
            scanning.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
////        deleting a file
//        File manjulika =new File("manjulika.txt");
//        if(manjulika.delete()){
//            System.out.println("Manjulika ka badla pura hua");
//        }else{
//            System.out.println("Bhoolbhulaiya 2 is coming");
//        }
    }
}
