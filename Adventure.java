import java.util.ArrayList;
import java.util.Scanner;

// This is the main method that runs the video game
// It will keep going until the user has either died or gotten all of the stones and won

public class Adventure {

    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        // Create weapons in an array list
        String[] weapons = {"Nerf Super Soaker", "Ninja Star", "Nuclear Bomb", "Tank", "Fork"};
        String currentWeapon = "Fork";
        int hearts = 3;
        boolean attackBikiniBottom = true;
        boolean attackPHouse = true;
        boolean attackDeathStar = true;
        boolean attackContinental = true;
        int fourPointsToWin = 0;
        int battlesLost;
        int timesYouRan;

        // Create a default object so that you can use all the stuff that you put in Avatar
        Avatar avatar = new Avatar();
        // Create a nations object
        Nations nations = new Nations();
        // Create a default purse object
        Purse purse = new Purse();
        // Pass the purse object to the avatar object
        avatar.setPurse(purse);
        avatar.printIntro1();

        // Create a big while loop to run the rest of the game
        boolean runGame = true;
        while (runGame) {
            // Give them their options
            System.out.println();
            System.out.println("Options:");
            System.out.println();
            System.out.println("g - Grab weapon");
            System.out.println("o - Open your purse");
            System.out.println();
            System.out.println("Lands to Explore:");
            System.out.println("b - Bikini Bottom");
            System.out.println("p - Pascual's House");
            System.out.println("d - Death Star");
            System.out.println("c - The Continental");
            System.out.println();
            System.out.println("Please choose");
            System.out.println();
            char selection = scnr.next().charAt(0);
            // Create a big switch statement that will have all the options of things you can do
            switch (selection) {

                case 'g' :
                    scnr.nextLine();
                    System.out.println();
                    System.out.println("Choose wisely: ");
                    System.out.println();
                    System.out.println("Nerf Super Soaker");
                    System.out.println("Ninja Star");
                    System.out.println("Nuclear Bomb");
                    System.out.println("Tank");
                    System.out.println("Fork");
                    System.out.println();
                    String weaponChoice = scnr.nextLine();
                    boolean invalidChoice = true;
                    for (String w : weapons) {
                        if (weaponChoice.equalsIgnoreCase(w)) {
                            currentWeapon = w;
                            invalidChoice = false;
                        }
                    }
                    if (invalidChoice) {
                        System.out.println("Not a weapon dude.");
                    }
                    break;

                case 'o' :
                        purse.displayRocks();
                    break;

                case 'b' :
                    if (attackBikiniBottom) {
                        nations.printNation("Bikini Bottom");
                        System.out.println();
                        System.out.println("Would you like to attack Patrick?");
                        String answer = scnr.next();
                        scnr.nextLine();
                        boolean runA = true;
                        while (runA) {
                            System.out.println();
                            runA = false;
                            if (answer.equalsIgnoreCase("yes")) {
                                boolean victoryA = nations.checkWin("Bikini Bottom", currentWeapon);
                                if (victoryA) {
                                    purse.addToPurse(0, "Aqua");
                                    attackBikiniBottom = false;
                                    fourPointsToWin += 1;
                                    avatar.checkGameOver(fourPointsToWin);
                                }
                                else{
                                    hearts -= 1;
                                    avatar.checkDead(hearts);
                                    avatar.addBattlesLost();
                                }
                            }
                            else if (answer.equalsIgnoreCase("no")) {
                                System.out.println("Patrick says 'Is Mayonnaise An Instrument?' as you swim away.");
                                avatar.addTimesYouRan();
                            }
                            else {
                                System.out.println("Valid answer please.");
                                answer = scnr.next();
                                scnr.nextLine();
                                runA = true;
                            }
                        } // End of while loop
                    } // End of attack loop
                    else {
                        System.out.println("Patrick has gone back to playing with Spongebob. Bikini Bottom has no more rocks for you to collect.");
                        System.out.println();
                    }
                    break; // End of Bikini Bottom

                case 'p' :
                    if (attackPHouse) {
                        nations.printNation("Pascual's House");
                        System.out.println();
                        System.out.println("Would you like to attack homeboy Pascual?");
                        String answer = scnr.next();
                        scnr.nextLine();
                        boolean runA = true;
                        while (runA) {
                            System.out.println();
                            runA = false;
                            if (answer.equalsIgnoreCase("yes")) {
                                boolean victoryA = nations.checkWin("Pascual's House", currentWeapon);
                                if (victoryA) {
                                    purse.addToPurse(1, "Air");
                                    attackPHouse = false;
                                    fourPointsToWin += 1;
                                    avatar.checkGameOver(fourPointsToWin);
                                }
                                else{
                                    hearts -= 1;
                                    avatar.checkDead(hearts);
                                    avatar.addBattlesLost();
                                }
                            }
                            else if (answer.equalsIgnoreCase("no")) {
                                System.out.println("Pascual calls you a chicken as you retreat.");
                                avatar.addTimesYouRan();
                            }
                            else {
                                System.out.println("Valid answer please.");
                                answer = scnr.next();
                                scnr.nextLine();
                                runA = true;
                            }
                        } // End of while loop
                    } // End of attack loop
                    else {
                        System.out.println();
                        System.out.println("Pascual's house is in ruins. He had it coming.");
                        System.out.println();
                    }
                    break;

                case 'd' :
                    if (attackDeathStar) {
                        nations.printNation("Death Star");
                        System.out.println();
                        System.out.println("Would you like to attack Darth Maul, the fallen sith apprentice?");
                        String answer = scnr.next();
                        scnr.nextLine();
                        boolean runA = true;
                        while (runA) {
                            System.out.println();
                            runA = false;
                            if (answer.equalsIgnoreCase("yes")) {
                                boolean victoryA = nations.checkWin("Death Star", currentWeapon);
                                if (victoryA) {
                                    purse.addToPurse(2, "Fire");
                                    attackDeathStar = false;
                                    fourPointsToWin += 1;
                                    avatar.checkGameOver(fourPointsToWin);
                                }
                                else{
                                    hearts -= 1;
                                    avatar.checkDead(hearts);
                                    avatar.addBattlesLost();
                                }
                            }
                            else if (answer.equalsIgnoreCase("no")) {
                                System.out.println("Darth Maul continues his conversation with Vader.");
                                avatar.addTimesYouRan();
                            }
                            else {
                                System.out.println("Valid answer please.");
                                answer = scnr.next();
                                scnr.nextLine();
                                runA = true;
                            }
                        } // End of while loop
                    } // End of attack loop
                    else {
                        System.out.println();
                        System.out.println("You own the Death Star and are the new leader of the Galactic Empire.");
                        System.out.println();
                    }
                    break;
                
                case 'c' :
                    if (attackContinental) {
                        nations.printNation("The Continental");
                        System.out.println();
                        System.out.println("Would you like to attack John Wick?");
                        String answer = scnr.next();
                        scnr.nextLine();
                        boolean runA = true;
                        while (runA) {
                            System.out.println();
                            runA = false;
                            if (answer.equalsIgnoreCase("yes")) {
                                boolean victoryA = nations.checkWin("The Continental", currentWeapon);
                                if (victoryA) {
                                    purse.addToPurse(3, "Earth");
                                    attackContinental = false;
                                    fourPointsToWin += 1;
                                    avatar.checkGameOver(fourPointsToWin);
                                }
                                else{
                                    hearts -= 1;
                                    avatar.checkDead(hearts);
                                    avatar.addBattlesLost();
                                }
                            }
                            else if (answer.equalsIgnoreCase("no")) {
                                System.out.println("John Wick continues his unstoppable conquest.");
                                avatar.addTimesYouRan();
                            }
                            else {
                                System.out.println("Valid answer please.");
                                answer = scnr.next();
                                scnr.nextLine();
                                runA = true;
                            }
                        } // End of while loop
                    } // End of attack loop
                    else {
                        System.out.println();
                        System.out.println("You and John Wick are now best buds. Y'all go to the park together to walk y'all's dogs.");
                        System.out.println();
                    }
                    break;
                
                default:
                    System.out.println();
                    System.out.println("Bro what?");
                    scnr.nextLine();
                    break;




            } // End of selection switch statement

        } // End of big while runGame statement





        
    }

}
