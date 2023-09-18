package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // Create objects of the CD and DVD classes
        CD theNorthBorders = new CD("The North Borders", true);
        CD philosophyPapers = new CD("Philosophy Papers");
        DVD friendsSeason3 = new DVD("Friends: Season 3");


        // Create File objects and add them to the CD and DVD objects using writeData()
        File firstFires = new File("First Fires", 50);
        File cirrus = new File("Cirrus", 61);
        File transit = new File("Transit", 57);
        theNorthBorders.writeFile(firstFires);
        theNorthBorders.writeFile(cirrus);
        theNorthBorders.writeFile(transit);

        File historyOfPhilosophy = new File("history-of-philosophy.doc", 0.8);
        File absoluteTruths = new File("absolute-truths.doc", 1.2);
        philosophyPapers.writeFile(historyOfPhilosophy);
        philosophyPapers.writeFile(absoluteTruths);

        File s3e1 = new File("S3:E1 - The One with the Princess Leia Fantasy", 420);
        File s3e2 = new File("S3:E1 - The One Where No One's Ready", 420);
        File s3e3 = new File("S3:E1 - The One with the Jam", 420);
        File s3e4 = new File("S3:E1 - The One with the Metaphorical Tunnel", 420);
        friendsSeason3.writeFile(s3e1);
        friendsSeason3.writeFile(s3e2);
        friendsSeason3.writeFile(s3e3);
        friendsSeason3.writeFile(s3e4);


        // Print each CD and DVD object
        System.out.println(theNorthBorders);
        System.out.println(philosophyPapers);
        System.out.println(friendsSeason3);


        // Use runFile() on both CD files
        theNorthBorders.runFile(cirrus);
        philosophyPapers.runFile(absoluteTruths);


        // Try to write a file to the DVD that has already been written
        friendsSeason3.writeFile(s3e2);


        // Use eraseData() to remove one file from the CD-ROM object, and then try to run that file
        philosophyPapers.removeFile(historyOfPhilosophy);
        theNorthBorders.runFile(historyOfPhilosophy);


        // Use reformatDisc() to wipe all files from the music CD object, and then try to run a file from it
        theNorthBorders.reformatDisc();
        theNorthBorders.runFile(transit);






    }
}