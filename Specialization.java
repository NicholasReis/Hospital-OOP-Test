import java.util.HashMap;
import java.util.ArrayList;

public class Specialization{
    protected String specializationName;
    protected String specializationData;
    
    public Specialization(String specializationName){
        SpecializationMap sm = new SpecializationMap();
        specializationName = specializationName;
        specializationData = sm.getSpecializationData(specializationName);
    }
    
    public String getSpecializationData(){
        return specializationData;
    }
}