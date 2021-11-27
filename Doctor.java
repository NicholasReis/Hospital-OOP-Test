import java.util.ArrayList;

public class Doctor extends Person{
    
    protected ArrayList<Specialization> specialization = new ArrayList<Specialization>();
    protected String office;
    protected ArrayList<Integer> patients = new ArrayList<Integer>();
    /*
     * Future additions may include schedule/availability, salary, etc
     * This is fine for now though.
     */

    public Doctor(int id, String firstName, String lastName, int age, char sex, char gender, String office){
        super(id, firstName, lastName, age, sex, gender);
        
        this.office = office;
    }

    public String getName(){
        return "Dr. " + lastName;
    }

    public ArrayList<Specialization> getSpecialization(){
        return specialization;
    }

    public ArrayList<Integer> getPatients(){
        return patients;
    }

    public void addSpecialization(Specialization discipline){
        specialization.add(discipline);
    }

    public void addPatient(int patientID){
        patients.add(patientID);
    }
}