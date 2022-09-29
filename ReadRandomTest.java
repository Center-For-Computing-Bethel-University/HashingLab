import java.io.*;
import java.util.*;

public class ReadRandomTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile datafile;
        Scanner keyboard;
        long numBytes;
//        keyboard = new Scanner(System.in);
  //      System.out.println("How many to skip?");
    //    numBytes = keyboard.nextInt();
//        for (numBytes = 30; numBytes < 50; numBytes++) { 
//            System.out.println("skipping: "+numBytes);
            datafile = new RandomAccessFile("threerow.ran","rw");
            readline(datafile);
            datafile.seek(20);
            readline(datafile);
            datafile.seek(40);
            readline(datafile);
//        datafile.skipBytes(19);
  //      readline(datafile);
            datafile.close();
//        }
    }
    public static void readline(RandomAccessFile datafile) throws IOException {
        char oneByte;
        int oneInt;
        double oneDouble;

        oneByte = datafile.readChar();
        System.out.println(oneByte);
        oneByte = datafile.readChar();
        System.out.println(oneByte);
        oneInt = datafile.readInt();
        System.out.println(oneInt);
        oneInt = datafile.readInt();
        System.out.println(oneInt);
        oneDouble = datafile.readDouble();
        System.out.println(oneDouble);
    }
}
