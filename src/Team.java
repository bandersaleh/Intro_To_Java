import java.util.Scanner;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.ArrayList;
import static java.lang.System.out;

// New Class
public class Team {

    // Fields
    private String teamName;
    private ArrayList<Player> players;

    // Constructors
    public Team(String name) {
        this.teamName = name;
        this.players = new ArrayList<>();
    }

    // Properties
    public String getName() {
        return teamName;
    }
    public ArrayList<Player> getPlayers() {
        return players;
    }

    // Methods
    public void addPlayer(Player player) {
        players.add(player);
    }

}