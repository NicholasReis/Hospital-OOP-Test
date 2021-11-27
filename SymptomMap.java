import java.util.HashMap;
import java.util.ArrayList;

public class SymptomMap{
    protected HashMap<String, String> symptomsMap;
    protected ArrayList<String> symptomsList;
    
    public SymptomMap(){
        if(symptomsMap == null){
            populateHashMap();
        }
    }
    
    private void populateHashMap(){
        FileParser fp = new FileParser("Specializations");
        symptomsMap = new HashMap<String, String>(fp.getHashMap());
        symptomsList = new ArrayList<String>(fp.getMapKeys());
    }
    
    public String getSymptomData(String specializationName){
        return symptomsMap.get(specializationName);
    }
    
    public HashMap<String, String> getSymptomsMap(){
        return symptomsMap;
    }
    
    public ArrayList<String> getSymptomTypes(){
        return symptomsList;
    }
}