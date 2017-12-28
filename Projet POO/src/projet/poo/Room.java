package projet.poo;

public class Room {
    private int noPlaces;
    
    public Room (){
        noPlaces = 80;
    }
    
    public Room (int noPlaces){
        this.noPlaces = noPlaces;
    }

    public int getNoPlaces() {
        return noPlaces;
    }

    public void setNoPlaces(int noPlaces) {
        this.noPlaces = noPlaces;
    }
}
