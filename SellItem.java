import java.io.*;
import java.util.*;

public class SellItem {
    public static final int DATASIZE=20;
    public static final int IDOFFSET=4;
    private char location;
    private char type;
    private int id;
    private int amount;
    private double cost;
    
    public SellItem(String line) {
        String[] parts;
        parts = line.split(",");
        location = parts[0].charAt(0);
        type = parts[4].charAt(0);
        id = Integer.parseInt(parts[6]);
        amount = Integer.parseInt(parts[8]);
        cost = Double.parseDouble(parts[9]);
    }
    
    public SellItem(char inLoc, char inTyp, int inId, int inAm, double inCos) {
        location = inLoc;
        type = inTyp;
        id = inId;
        amount = inAm;
        cost = inCos;
    }
    
    public SellItem(RandomAccessFile datafile) throws IOException {
        location = datafile.readChar();
        type = datafile.readChar();
        id = datafile.readInt();
        amount = datafile.readInt();
        cost = datafile.readDouble();
    }
    
    public void write(RandomAccessFile datafile) throws IOException {
         // write this code
    }
    
    public char getLocation() {
         // write this code
    }
    public char getType() {
            // write this code
    }
    public int getId() {
        // write this code
    }
    public int getAmount() {
        // write this code
    }
    public double getCost() {
        // write this code
    }
    public int[] hash() {
        // write this code 
    }
    
    public static int[] hash(int id) {
        // write this code
    }
    
    public boolean equals(SellItem other) {
        return id == other.getId();
    }
    public String toString() {
        return ""+id;
    }
}    
