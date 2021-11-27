import java.util.HashMap;
import java.util.ArrayList;

public class Symptom{
    protected String symptomName;
    protected String symptomData;
    
    public Symptom(String symptomName){
        SymptomMap sm = new SymptomMap();
        this.symptomName = symptomName;
        this.symptomData = sm.getSymptomData(symptomName);
    }
    
    public String getSymptomData(){
        return symptomData;
    }
}