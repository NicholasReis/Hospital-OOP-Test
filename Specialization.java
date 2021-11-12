import java.util.HashMap;
import java.util.ArrayList;

public class Specialization{
    protected HashMap<String, String> specializations;
    protected ArrayList<String> specializationsList;
    
    public Specialization(){
        FileParser fp = new FileParser("Specializations");
        specializations = new HashMap<String, String>(fp.getHashMap());
        specializationsList = new ArrayList<String>(fp.getMapKeys());
    }
    
    public HashMap<String, String> getSpecializationMap(){
        return specializations;
    }
    
    public ArrayList<String> getSpecializationTypes(){
        return specializationsList;
    }
}