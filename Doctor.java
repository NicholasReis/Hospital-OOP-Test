import java.util.ArrayList;

public class Doctor{
    protected int id;
    protected String firstName;
    protected String lastName;
    protected int age;
    protected ArrayList<String> specialization = new ArrayList<String>();
    protected String office;
    protected ArrayList<Integer> patients = new ArrayList<Integer>();
    /*
     * Future additions may include schedule/availability, salary, etc
     * This is fine for now though.
     */

    public Doctor(int id, String firstName, String lastName, int age,
    String office){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.specialization = specialization;
        this.office = office;
    }

    public String getName(){
        return "Dr. " + lastName;
    }

    public ArrayList<String> getSpecialization(){
        return specialization;
    }

    public ArrayList<Integer> getPatients(){
        return patients;
    }

    public void addSpecialization(String discipline){
        specialization.add(discipline);
    }

    public void addPatient(int patientID){
        patients.add(patientID);
    }
}