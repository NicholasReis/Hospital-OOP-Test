import java.util.HashMap;
import java.util.ArrayList;

public class SpecializationMap{
    protected HashMap<String, String> specializationMap;
    protected ArrayList<String> specializationList;
    
    public SpecializationMap(){
        if(specializationMap == null){
            populateHashMap();
        }
    }
    
    private void populateHashMap(){
        FileParser fp = new FileParser("Specializations");
        specializationMap = new HashMap<String, String>(fp.getHashMap());
        specializationList = new ArrayList<String>(fp.getMapKeys());
    }
    
    public String getSpecializationData(String specializationName){
        return specializationMap.get(specializationName);
    }
    
    public HashMap<String, String> getSpecializationMap(){
        return specializationMap;
    }
    
    public ArrayList<String> getSpecializationTypes(){
        return specializationList;
    }
}