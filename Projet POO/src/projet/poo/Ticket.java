package projet.poo;

public abstract class Ticket {
    
    private Client client;
    private Movie movie;
    private int price;

    public Ticket(Client client) {
        this.client = client;
    }
    
    public Ticket(Client client, Movie movie) {
        this.client = client;
        this.movie = movie;
    }
    
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public abstract void calculatePrice();
    
    @Override
    public String toString(){
        this.calculatePrice();
        return "ticket price" + this.getPrice();
    }
    
}
