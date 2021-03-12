package adventureGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();
            String[] direction = scanner.nextLine().toUpperCase().split(" ");
            String currentDir = direction[0];
            boolean wordFound = false;

            for (String dir : direction) {
                switch (dir) {
                    case "NORTH":
                        currentDir = "N";
                        wordFound = true;
                        break;
                    case "SOUTH":
                        currentDir = "S";
                        wordFound = true;
                        break;
                    case "EAST":
                        currentDir = "E";
                        wordFound = true;
                        break;
                    case "WEST":
                        currentDir = "W";
                        wordFound = true;
                        break;
                    case "QUIT":
                        currentDir = "Q";
                        wordFound = true;
                        break;
                }
                if (wordFound) {
                    break;
                }
            }

            if (exits.containsKey(currentDir)) {
                loc = exits.get(currentDir);

            } else {
                System.out.println("You cannot go in that direction");
            }
        }


    }
}
