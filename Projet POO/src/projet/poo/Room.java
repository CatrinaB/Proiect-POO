package projet.poo;

public class Room {
    private int noRoom;
    private int noPlaces;
    private int noPlacesLeft;
    
    public Room (){
        this.noRoom = 1; 
        this.noPlaces = 80;
        this.noPlacesLeft = this.noPlaces;
    }
    
    public Room (int noPlaces){
        this.noRoom = 1;
        this.noPlaces = noPlaces;
        this.noPlacesLeft = this.noPlaces;
    }
    
    public Room (int noRoom, int noPlaces){
        this.noRoom = noRoom;
        this.noPlaces = noPlaces;
        this.noPlacesLeft = this.noPlaces;
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

    public int getNoPlacesLeft() {
        return noPlacesLeft;
    }

    public void setNoPlacesLeft(int noPlacesLeft) {
        this.noPlacesLeft = noPlacesLeft;
    }
    
    public void newTicket(){
        this.noPlacesLeft--;
    }
}
