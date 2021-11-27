import java.util.ArrayList;

public class Patient extends Person{
    //IDs rather than doctor name/room name for physical security reasons
    private int doctorID;
    private String roomID;
    protected int age;
    protected ArrayList<Symptom> symptoms = new ArrayList<Symptom>();
    protected String currentDiagnosis;

    public Patient(int id, String firstName, String lastName, char sex,
    char gender, int age){
        super(id, firstName, lastName, age, sex, gender);
    }
    
    public String getPatientName(){
        //Prioritizes preferred gender, should one not be provided defaults to sex
        if(Character.toLowerCase(gender) == 'm'){
            return "Mr. "+ lastName;
        }else if(Character.toLowerCase(gender) == 'f'){
            return "Ms. "+ lastName;
        }else if(Character.toLowerCase(gender) == 'n'){
            return "Mx. "+ lastName;
        }else{
            if(sex == 'm'){
                return "Mr. "+ lastName;
            }else if(sex == 'f'){
                return "Ms. "+ lastName;
            }else{
                return "Mx. "+ lastName;
            }
        }
    }
    
    public String getPatientRoomID(){
        return roomID;
    }

    public ArrayList<Symptom> getPatientSymptoms(){
        return symptoms;
    }
    
    public String getPatientDiagnosis(){
        return currentDiagnosis;
    }

    //Setters
    public void setDoctorID(int id){
        doctorID = id;
    }

    public void setRoomID(String id){
        roomID = id;
    }

    public void setSymptom(String symptomName){
        symptoms.add(new Symptom(symptomName));
    }

    public void setDiagnosis(String diagnosis){
        currentDiagnosis = diagnosis;
    }
}
