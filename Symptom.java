import java.util.HashMap;
import java.util.ArrayList;

public class Symptom{
    protected HashMap<String, String> symptoms;
    protected ArrayList<String> symptomsList;
    
    public Symptom(){
        FileParser fp = new FileParser("Symptoms");
        symptoms = new HashMap<String, String>(fp.getHashMap());
        symptomsList = new ArrayList<String>(fp.getMapKeys());
    }

    public HashMap<String, String> getSymptomsMap(){
        return symptoms;
    }
    
    public ArrayList<String> getSymptomTypes(){
        return symptomsList;
    }
}