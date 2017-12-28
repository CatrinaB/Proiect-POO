package projet.poo;

public class StudentTicket extends Ticket{

    public StudentTicket(Client client) {
        super(client);
    }

    public StudentTicket(Client client, Movie movie) {
        super(client, movie);
    }
    
    public void calculatePrice(){
        this.setPrice(10);
    }
}
