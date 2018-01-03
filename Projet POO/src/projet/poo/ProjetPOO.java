package projet.poo;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class ProjetPOO {
    static ArrayList<Client> clients = new ArrayList<>();
    
    static final private GregorianCalendar date1 = new GregorianCalendar(2018, 1, 23, 10, 15);
    static final private GregorianCalendar date2 = new GregorianCalendar(2018, 1, 22, 22, 30);
    static final private GregorianCalendar date3 = new GregorianCalendar(2018, 1, 22, 17, 45);
    static final private GregorianCalendar date4 = new GregorianCalendar(2018, 1, 23, 14, 20);
    
    static final private Room room1 = new Room(1, 80);
    static final private Room room2 = new Room(2, 100);
    
    static final private Movie movie1 = new Movie("Avatar", room1, date1);
    static final private Movie movie2 = new Movie("Life of Pi", room1, date2);
    static final private Movie movie3 = new Movie("Inception", room2, date3);
    static final private Movie movie4 = new Movie("Shutter Island", room2, date4);
    
    static ArrayList<Movie> movies = new ArrayList<>();
    
    //public static void getData(){
      //  String text = GUI.getjTextField1();
    //}

    public static Client constructClient(String firstName, String lastName, boolean isStudent){
        Client c = new Client(firstName, lastName, isStudent);
        clients.add(c);
        return c;
    }
    
    public static String showClients(){
        String s = "";
        for (int i = 0; i < clients.size(); i++)
            s = s.concat(clients.get(i).toString());
        return s;
    }
    
    public static void addToArray(){
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
    }
    
    public static void createTicket(Client c){
        addToArray();
        Ticket t;
        int index = GUI.getjComboBox1Value();
        if (c.isStudent() == true)
            t = new StudentTicket(c, movies.get(index));
        else
            t = new NormalTicket(c, movies.get(index));
        
        c.addTicket(t);
    }

    public static Movie getMovie1() {
        return movie1;
    }

    public static Movie getMovie2() {
        return movie2;
    }

    public static Movie getMovie3() {
        return movie3;
    }

    public static Movie getMovie4() {
        return movie4;
    }
    
    

}
