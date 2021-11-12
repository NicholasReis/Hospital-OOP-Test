import java.util.ArrayList;

public class Doctor{
    protected int id;
    protected String firstName;
    protected String lastName;
    protected int age;
    protected ArrayList<String> specialization = new ArrayList<String>();
    protected String office;
    protected ArrayList<String> patients = new ArrayList<String>();
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

    public ArrayList<String> getPatients(){
        return patients;
    }

    public void addSpecialization(String discipline){
        specialization.add(discipline);
    }

    public void addPatient(String patientName){
        patients.add(patientName);
    }
}