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

////    Created by Bander Saleh
////    using Java (programming language)
////    via Prog_4-CSI_226
////    at RTC Spring 2023 Quarter


// The App's Initial Main Class
public class Main {

    // Public Fields Data goes here?
    public ArrayList<Team> teams;
    public ArrayList<Player> players;


    // Main Class that could InitializeComponent()
    public static void main(String[] args) {

        initialData(); //call a Method that loads preloaded data for our app


    }// Main


    // Properties
    public static int getMenuOption(Scanner scanner) {
        System.out.println("\nSelect an option:\n");
        System.out.println("1 - List Teams and Players");
        System.out.println("2 - Add a Team");
        System.out.println("3 - Add a Player");
        System.out.print("Option: ");
        return scanner.nextInt();
    }

    // Methods
    public static void displayTeamsAndPlayers(ArrayList<Team> teams) {
        System.out.println();
        for (Team team : teams) {
            System.out.println(team.getName());
            for (Player player : team.getPlayers()) {
                System.out.println(player.playerName() + " " + player.playerNumber());
            }
            System.out.println();
        }
    }

    public static void initialData(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Team> teams = new ArrayList<>();
        teams.add(new Team("Supersonics"));

        // Initial Interactive User Interface App Functionality (below)
        System.out.println("Welcome to Team Manager 2023");

        int option = getMenuOption(scanner);

        if (option == 1) {
            displayTeamsAndPlayers(teams);
        } else if (option == 2) {
            addTeam(scanner, teams);
        } else if (option == 3) {
            addPlayer(scanner, teams);
        }

    }

    public static void addTeam(Scanner scanner, ArrayList<Team> teams) {
        System.out.println("\nAdding a Team\n");
        System.out.print("Enter team name: ");
        String teamName = scanner.next();
        Team team = new Team(teamName);
        teams.add(team);
        System.out.println("Team added successfully!");
    }

    public static void addPlayer(Scanner scanner, ArrayList<Team> teams) {
        System.out.println("\nAdding a Player\n");
        System.out.print("Enter name: ");
        String playerName = scanner.next();
        System.out.print("Enter a number: ");
        int playerNumber = scanner.nextInt();

        System.out.println("\nChoose a team:\n");
        for (int i = 0; i < teams.size(); i++) {
            System.out.println(i + " - " + teams.get(i).getName());
        }

        System.out.print("Team: ");
        int teamIndex = scanner.nextInt();

        if (teamIndex >= 0 && teamIndex < teams.size()) {
            Team selectedTeam = teams.get(teamIndex);
            Player player = new Player(playerName, playerNumber);
            selectedTeam.addPlayer(player);
            System.out.println("Player added successfully!");
        } else {
            System.out.println("Invalid team index!");
        }
    }

}