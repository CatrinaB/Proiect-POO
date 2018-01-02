package projet.poo;

import java.util.ArrayList;

public class Client {

    private String lastName;
    private String firstName;
    private int id;
    private boolean student;
    private ArrayList<Ticket> tickets = new ArrayList<>();

    public Client() {
    }

    public Client(String lastName, String firstName, boolean student) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = (int) (Math.random() * 10000 + Math.random() * 1000 +
                Math.random() * 100 + Math.random() * 10);
        this.student = student;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    @Override
    public String toString() {
        String string = "";
        string = string.concat(this.firstName + " " + this.lastName + " " + this.id +
                " " + this.student);
        for (int i = 0; i < tickets.size(); i++)
            string = string.concat(" " + tickets.get(i).toString());
        string = string.concat("\n");

        return string;
    }
}
