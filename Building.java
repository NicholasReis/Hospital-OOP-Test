import java.util.ArrayList;

public class Building{
    protected String name;
    protected char code;
    protected ArrayList<Room> roomList = new ArrayList<Room>();
    
    public Building(String name, char code){
        this.name = name;
        this.code = code;
    }
    
    public void addRoom(char roomNumber, int roomCapacity){
        roomList.add(new Room(roomNumber, roomCapacity));
    }
    
    public void addRoom(Room r){
        roomList.add(r);
    }
    
    //Not sure what key I will use here to identify rooms
    public String getRoomCode(Room r){
        return (code + "-" + r.getRoomNumber());
    }
}
