import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

//Left in for future plans to add to the document
//import java.io.FileWriter;

//This class will parse a document for now for relevant specializations I found online.
//This will likely change into an enum later, but I want a prototype running before I start improvements I will have to look into.
public class Specialization{
    protected HashMap<String, String> specializationMap = new HashMap<String, String>();
    protected String discipline;
    protected String information;
    public Specialization(){
        try{
            File specializationsFile = new File("res/Specializations.txt");
            Scanner scan = new Scanner(specializationsFile);
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                if(line.equals("")){
                    String key = scan.nextLine();
                    String value = scan.nextLine();
                    specializationMap.put(key, value);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public String getSpecializationInformation(String specialization){
        return specializationMap.get(specialization);
    }
    
    //Not sure if this is actually going to be important
    //Might be an internal tool for creating staff in the hospital class
    public ArrayList<String> getSpecializationTypes(){
        return new ArrayList<String>(specializationMap.keySet());
    }
}