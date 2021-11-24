import java.util.ArrayList;

public class Room{
    protected int roomNumber;
    protected int roomCapacity;
    protected ArrayList<Patient> patientList = new ArrayList<Patient>();
    
    public Room(int roomNumber, int roomCapacity){
        this.roomNumber = roomNumber;
        this.roomCapacity = roomCapacity;
    }

    public int getRoomNumber(){
        return roomNumber;
    }
    
    public boolean getRoomAvailability(){
        if(patientList.size() < roomCapacity){
            return true;
        }else{
            return false;
        }
    }
    
    public void addPatient(Patient patient){
        if(getRoomAvailability()){
            patientList.add(patient);
        }else{
            System.out.println("Room is full");
        }
    }

    //Will have to test this later
    public void removePatient(int patientID){
        for(Patient p : patientList){
            if(p.getId() == patientID){
                patientList.remove(p);
            }
        }
    }
}