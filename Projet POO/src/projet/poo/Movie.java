package projet.poo;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Movie {
    private ArrayList<Ticket> tickets;
    private Room room;
    private GregorianCalendar dateTime;

    public Movie(ArrayList<Ticket> tickets, Room room, GregorianCalendar dateTime) {
        this.tickets = tickets;
        this.room = room;
        this.dateTime = dateTime;
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
