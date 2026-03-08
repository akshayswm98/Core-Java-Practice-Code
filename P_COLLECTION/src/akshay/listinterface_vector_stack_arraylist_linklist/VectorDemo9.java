package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.*;

record Player(Integer id, String name, Double basePrice)
{
}

class IplAction
{
    private String iplTeam;
    private Vector<Player> listOfPlayer;
    
    public IplAction(String iplTeam) 
    {
        this.iplTeam = iplTeam;
        this.listOfPlayer = new Vector<>(); // FIX 1
    }
    
    public void addPlayer(Player player)
    {
        listOfPlayer.add(player); // FIX 2
    }

    public void displayAllThePlayer()
    {
        System.out.println("All The Player :- " + iplTeam);
        listOfPlayer.forEach(player -> System.out.println(player));
    }

    public void returnAndRemove()
    {
        Iterator<Player> iterator = listOfPlayer.iterator();
        while(iterator.hasNext())
        {
            Player player = iterator.next();
            if(player.basePrice() > 100000)
            {
                iterator.remove();
            }
        }
    }
}

public class VectorDemo9 
{
    public static void main(String[] args) 
    {
        IplAction ipl = new IplAction("SRH");
        ipl.addPlayer(new Player(111, "Akshay", 190000D));
        ipl.addPlayer(new Player(222, "Head", 140000D));
        ipl.addPlayer(new Player(333, "Klassen", 110000D));
        ipl.addPlayer(new Player(444, "Nitish", 100000D));
        
        ipl.returnAndRemove();
        ipl.displayAllThePlayer();
    }
}