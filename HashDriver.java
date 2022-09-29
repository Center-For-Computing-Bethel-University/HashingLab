import java.io.*;
import java.util.*;

public class HashDriver {
    public static void main(String[] args) throws IOException {
        loaddata(args[0]);
        searchdata(args[1]);
    }
    
    public static void loaddata(String inFile) throws IOException {
        Scanner file;
        String line;
        SellItem item;
        
        file = new Scanner(new FileReader(inFile));
        file.nextLine(); // skip header line
        while (file.hasNext()) {
            line = file.nextLine();
            item = new SellItem(line);
            DataFile.save(item);
        }
        file.close();
    }
    
    public static void searchdata(String searchFile) throws IOException {
        Scanner file;
        int id;
        SellItem item;
                
        file = new Scanner(new FileReader(searchFile));
        while (file.hasNext()) {
            id = file.nextInt();
            item = DataFile.find(id);
            if (item != null) 
                System.out.println(item.toString());
            else
                System.out.println("Item not found");
        }
        file.close();
    }
}