package projet.poo;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Movie {
    private String name;
    private ArrayList<Ticket> tickets;
    private Room room;
    private GregorianCalendar dateTime;
    
    public Movie() {
        
    }

    public Movie(String name, Room room) {
        this.name = name;
        this.room = room;
    }
    
    public Movie(String name, ArrayList<Ticket> tickets, Room room, GregorianCalendar dateTime) {
        this.name = name;
        this.tickets = tickets;
        this.room = room;
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public GregorianCalendar getDateTime() {
        return dateTime;
    }

    public void setDateTime(GregorianCalendar dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Movie{" + "name=" + name + ", tickets=" + tickets + ", room=" + room + ", dateTime=" + dateTime + '}';
    }
    
    public void addTicket(Client client){
        ArrayList<Ticket> temp = client.getTickets();
        if (temp.size() > room.getNoPlaces())
            System.out.println("There are less than " + temp.size() +
                    " places available!");
        else
            for (int i = 0; i < temp.size(); i++)
                tickets.add(temp.get(i));
    }
}

