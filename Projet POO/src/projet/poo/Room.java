package projet.poo;

public class Room {
    private int noRoom;
    private int noPlaces;
    
    public Room (int noRoom){
        this.noRoom = noRoom;
        noPlaces = 80;
    }
    
    public Room (int noRoom, int noPlaces){
        this.noRoom = noRoom;
        this.noPlaces = noPlaces;
    }

    public int getNoRoom() {
        return noRoom;
    }

    public void setNoRoom(int noRoom) {
        this.noRoom = noRoom;
    }

    public int getNoPlaces() {
        return noPlaces;
    }

    public void setNoPlaces(int noPlaces) {
        this.noPlaces = noPlaces;
    }
}
