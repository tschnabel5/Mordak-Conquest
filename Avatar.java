import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

// General Headers
// This class saves the name of the player and also counts how many times they run away from a battle and how many battles they loose

public class Avatar {

    private String name;
    private Purse purse;
    private int timesYouRan = 0;
    private int battlesLost = 0;


    public Avatar() {
        // Nothing
    }

    public void printIntro1() {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to the land of Mordak");
        System.out.println();
        System.out.println("Please choose your character name");
        this.name = scnr.nextLine();
        System.out.println("Welcome to the land of Mordak "+ this.name + ". You have a long perilous journey ahead of you.");
        System.out.println();
        System.out.println("To win you must traverse this land, fighting the 4 elemental bosses until you defeat them all.");
        System.out.println("After you defeat a boss, you obtain their infinity rock.");
        System.out.println("Once you have all infinity rocks, you gain the powers of Spinjitzu and become the most power ninja in the world.");
        System.out.println("Though be careful. Loose three battles and you demise will be iminent.");
        System.out.println();
        System.out.println("Your starting weapon is a fork. You can change you weapon anytime.");
        System.out.println("You start with 3 hearts. Be careful.");
        System.out.println("Here is what you can do.");

    }

    public void setPurse(Purse purse) {
        this.purse = purse;
    }

    public Purse getPurse() {
        return this.purse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    } 

    // Create a method that checks if you're dead or not
    public void checkDead(int hearts) {
        if (hearts == 0) {
            System.out.println();
            System.out.println("After all that hard work, you are dead. Do better next time.");
            System.out.println();
            System.out.println("(Haha, you suck loser. L+ ratio.)");
            System.out.println();
            System.exit(0);
        }
    }

    public void checkGameOver(int points) {
        if (points == 4) {
            System.out.println("Congradulations. You have successfully saved the world of Mordak "+ this.name);
            System.out.println("With all four infinity rocks you now how the power of the Green Ninja.");
            System.out.println("You have sworn to the citizens of Mordak that you will be their protector.");
            System.out.println();
            System.out.println("(Your stats will be printed to a new file)");
            System.out.println(this.battlesLost);
            System.out.println(this.timesYouRan);
            String stats = this.name.concat("CharacterStats.txt");
            FileOutputStream outputStream = null;
            try {
                outputStream = new FileOutputStream(stats);
            }
            catch (FileNotFoundException e) {
                System.out.println("Cannot find the file named " + stats + ".");
            }
            PrintWriter printW = new PrintWriter(outputStream);
            printW.println("Here are you stats " + this.name + ".");
            printW.println("Battles Lost: " + this.battlesLost);
            printW.println("# of Battles You Ran From: " + this.timesYouRan);
            printW.close();
            System.exit(0);
        }
    }

    public void addBattlesLost() {
        this.battlesLost += 1;
    }

    public void addTimesYouRan() {
        this.timesYouRan += 1;
    }


    }
