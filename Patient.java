import java.util.ArrayList;

public class Patient{
    //IDs rather than doctor name/room name for physical security reasons
    private int doctorID;
    private String roomCode;
    protected String firstName;
    protected String lastName;
    protected char sex;
    protected char gender;
    protected int age;
    protected ArrayList<Symptom> symptoms;
    public Patient(int doctorID, String roomCode, String firstName,
    String lastName, char sex, char gender, int age, ArrayList<Symptom> symptoms){
        this.doctorID = doctorID;
        this.roomCode = roomCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.symptoms = symptoms;
    }

    public int getPatientDoctorID(){
        return doctorID;
    }

    public String getPatientRoomCode(){
        return roomCode;
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
    
    public ArrayList<Symptom> getPatientSymptoms(){
        return symptoms;
    }
}
