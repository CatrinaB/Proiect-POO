package projet.poo;

public class NormalTicket extends Ticket{

    public NormalTicket(Client client) {
        super(client);
    }

    public NormalTicket(Client client, Movie movie) {
        super(client, movie);
    }
    
    public void calculatePrice(){
        this.setPrice(20); //se calculeaza pretul biletului pentru un student
    }
}
