import java.util.ArrayList;

public class Patient{
    //IDs rather than doctor name/room name for physical security reasons
    private int patientID;
    private int doctorID;
    private String roomID;
    protected String firstName;
    protected String lastName;
    protected char sex;
    protected char gender;
    protected int age;
    protected ArrayList<String> symptoms = new ArrayList<String>();
    protected String currentDiagnosis;

    public Patient(int patientID, String firstName, String lastName, char sex,
    char gender, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.gender = gender;
        this.age = age;
    }

    //Getters    
    public int getPatientID(){
        return patientID;
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
    
    public int getPatientAge(){
        return age;
    }
    
    public int getPatientDoctorID(){
        return doctorID;
    }

    public String getPatientRoomID(){
        return roomID;
    }

    public ArrayList<String> getPatientSymptoms(){
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

    public void setSymptom(String symptom){
        symptoms.add(symptom);
    }

    public void setDiagnosis(String diagnosis){
        currentDiagnosis = diagnosis;
    }
}
