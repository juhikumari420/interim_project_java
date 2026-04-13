import java.util.*;

// Room class
class Room {
    private int roomNumber;
    private String type;
    private boolean isAvailable;

    public Room(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.isAvailable = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getType() {
        return type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void bookRoom() {
        isAvailable = false;
    }

    public void showDetails() {
        System.out.println("Room No: " + roomNumber + " | Type: " + type + " | Available: " + isAvailable);
    }
}

// Service Interface
interface Service {
    double calculateBill(String type);
}

// Hotel class
class Hotel implements Service {
    private List<Room> rooms;

    public Hotel() {
        rooms = new ArrayList<>();
        // Adding sample rooms
        rooms.add(new Room(101, "AC"));
        rooms.add(new Room(102, "Non-AC"
