import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class FileParser{
    protected HashMap<String, String> dataHashMap = new HashMap<String, String>();
    protected String key;
    protected String data;
    public FileParser(String fileName){
        try{
            File specializationsFile = new File("res/"+fileName+".txt");
            Scanner scan = new Scanner(specializationsFile);
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                if(line.equals("")){
                    key = scan.nextLine();
                    data = scan.nextLine();
                    dataHashMap.put(key, data);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //Returns the map
        public HashMap getHashMap(){
        return dataHashMap;
    }
    
    //Returns the keys for the map
    public ArrayList<String> getMapKeys(){
        return new ArrayList<String>(dataHashMap.keySet());
    }
}
