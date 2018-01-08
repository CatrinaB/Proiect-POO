package projet.poo;

import java.util.GregorianCalendar;

// clasa abstracta ce va calcula preturile biletelor

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
        return "\nMovie: " + movie.getName() + "\nDate: " + 
                movie.getDateTime().get(GregorianCalendar.DAY_OF_MONTH) + "." + 
                movie.getDateTime().get(GregorianCalendar.MONTH) + "\nTime: " + 
                movie.getDateTime().get(GregorianCalendar.HOUR_OF_DAY) + ":" + 
                movie.getDateTime().get(GregorianCalendar.MINUTE) + "\nRoom: " +
                movie.getRoom().getNoRoom();
    }
    
}
