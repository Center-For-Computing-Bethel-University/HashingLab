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
        datafile.writeChar(location);
        datafile.writeChar(type);
        datafile.writeInt(id);
        datafile.writeInt(amount);
        datafile.writeDouble(cost);
    }
    
    public char getLocation() {
        return location;
    }
    public char getType() {
        return type;
    }
    public int getId() {
        return id;
    }
    public int getAmount() {
        return amount;
    }
    public double getCost() {
        return cost;
    }
    public int[] hash() {
        int[] hashcodes;
        hashcodes = new int[2];
        hashcodes[0] = id / DataFile.BLOCKSIZE;
        hashcodes[1] = id % DataFile.BLOCKSIZE / DataFile.INDEXSIZE;
        return hashcodes;
    }
    
    public static int[] hash(int id) {
        int[] hashcodes;
        hashcodes = new int[2];
        hashcodes[0] = id / DataFile.BLOCKSIZE;
        hashcodes[1] = id % DataFile.BLOCKSIZE / DataFile.INDEXSIZE;
        return hashcodes;
    }
    
    public boolean equals(SellItem other) {
        return id == other.getId();
    }
    public String toString() {
        return ""+id;
    }
}    