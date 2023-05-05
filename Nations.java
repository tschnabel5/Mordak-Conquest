import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

// This holds a hashmap of the basic intro for each of worlds
// It also checks if you've beaten a boss

public class Nations {

    private HashMap<String, String> nations = new HashMap<>();

    // Create a default constructor
    // Default constructor just adds items to the hashmap
    public Nations() {
        this.nations.put("Bikini Bottom", "Patrick Star has taken over Bikini Bottom and is holding Spongebob hostage. Patrick is using the aqua stone to hold control the sea in the surrounding area.");
        this.nations.put("Pascual's House", "Pascual used to be your friend, until he broke your ankles on the basketball court \nand then laughed about how trash of a baller you were. We'll see who's laughing this time." );
        this.nations.put("Death Star", "You have boarded the Death Star in your X-Wing you borrowed from Luke. \nWhen you see Darth Maul he laughs and call you puny.");
        this.nations.put("The Continental", "You have entered the New York Contenintal. John Wick went insane after the Russians killed his second dog. He's using the Earth stone to destroy everything in the path of his revenge.");
    }

    public void printNation(String nation) {
        String printNationInfo = this.nations.get(nation);
        System.out.println();
        System.out.println(printNationInfo);
    }

    // Create a method that returns a boolean
    // The method has a weapon and map input. If the weapon is corect and beats the boss of that map, return true, loses return false
    public boolean checkWin(String map, String weapon) {
        // Bikini Bottom
        if (map == "Bikini Bottom") {
            if (weapon.equalsIgnoreCase("Ninja Star")) {
                System.out.println("You hit Patrick in the eye with your ninja star and he cried like a little baby.");
                System.out.println("You now have the Aqua Stone.");
                System.out.println();
                return true;
            }
            else {
                System.out.println("Patrick eats " + weapon + "s for breakfest. Bad choice.");
                System.out.println("Patrick hits you with his jellyfishing net, damaging you by one heart.");
                return false;
            }
        }
        // Pascual's House
        if (map == "Pascual's House") {
            if (weapon.equalsIgnoreCase("Tank")) {
                System.out.println("While Pascual may be a baller, he wasn't smart enough to make his house tank resistant. \nHe tries to say apoligize, but instead you leave the his house detonating it as you walk away like a BA.\n");
                System.out.println("You now have the Air Stone.");
                System.out.println();
                return true;
            }
            else {
                System.out.println("Pascual's house is " + weapon + " resistant");
                System.out.println("Pascual challenges you to a one V one and breaks your ankles again. You lose a heart.");
                return false;
            }
        }
        // Death Star
        if (map == "Death Star") {
            if (weapon.equalsIgnoreCase("Nerf Super Soaker")) {
                System.out.println("Out of all the weapons you really choose a water gun. Darth Maul sees the water gun and cowers in fear. \nMaul fold immediatly, apparently Mauls are deathly allergic to water. Maul gives you the keys to the Death Star and flies away in a TIE fighter.\n");
                System.out.println("You now have the Fire Stone.");
                System.out.println();
                return true;
            }
            else {
                System.out.println("Darth Maul uses the force to deflect your " + weapon + ".");
                System.out.println("Darth Maul force chokes you. (one heart lost)");
                return false;
            }
        }
        // The Continental
        if (map == "The Continental") {
            if (weapon.equalsIgnoreCase("Nuclear Bomb")) {
                System.out.println("Really? A nuclear bomb to kill a single person. Well, you killed all of the civilians of New York and John Wick survived because he is immortal.");
                System.out.println("But you made John Wick realize how much death and descruction he's caused. He gives you the Earth stone and retires from being an assasin.");
                System.out.println("You now have the Earth Stone.");
                System.out.println();
                return true;
            }
            else {
                System.out.println("John Wick absorbs the damage from your " + weapon);
                System.out.println("John Wick shoots you in the foot and tells you to go mess with someone your own size. (you lost one life)");
                return false;
            }
        }





        return true;

    } // End of checkWin method



}
