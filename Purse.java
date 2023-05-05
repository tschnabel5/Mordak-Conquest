public class Purse {

// This class holds a rock everytime you get a new one

private String[] rocksInPurse = {"_", "_", "_", "_"};
// Create an empty constructor
    public Purse() {
        // Nothing
    }

    public void displayRocks() {
        boolean hasRocks = false;
        for(String rock : this.rocksInPurse) {
            if(rock != "_") {
                hasRocks = true;
            }
        }
        if (!hasRocks) {
            System.out.println();
            System.out.println("You ain't got nun.");
            System.out.println();
        }
        else {
            System.out.println();
            for (String rock : this.rocksInPurse) {
                System.out.print(rock + " ");
            }
            System.out.println();
            System.out.println();
        }
    }

    // Make a method that puts rocks in your purse
    public void addToPurse(int index, String rock) {
        this.rocksInPurse[index] = rock;
    }


}