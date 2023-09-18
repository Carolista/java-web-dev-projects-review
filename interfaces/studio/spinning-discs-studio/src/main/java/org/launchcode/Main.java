package org.launchcode;

public class Main {
    public static void main(String[] args) {

        /* CD AND DVD CLASSES */

        // Create objects of the CD and DVD classes
        CD theNorthBorders = new CD("The North Borders", true);
        CD graphicDesignProjects = new CD("Graphic Design Projects");
        DVD friendsSeason3 = new DVD("Friends: Season 3");


        // Create File objects and add them to the CD and DVD objects using writeData()
        File firstFires = new File("First Fires", 50);
        File cirrus = new File("Cirrus", 61);
        File transit = new File("Transit", 57);
        theNorthBorders.writeFile(firstFires);
        theNorthBorders.writeFile(cirrus);
        theNorthBorders.writeFile(transit);

        File festivalPoster = new File("festival-poster.psd", 240);
        File companyLogo = new File("company-logo.ai", 52);
        graphicDesignProjects.writeFile(festivalPoster);
        graphicDesignProjects.writeFile(companyLogo);

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
        System.out.println(graphicDesignProjects);
        System.out.println(friendsSeason3);


        // Use runFile() on both CD files
        theNorthBorders.runFile(cirrus);
        graphicDesignProjects.runFile(companyLogo);


        // Try to write a file to the DVD that has already been written
        friendsSeason3.writeFile(s3e2);


        // Use eraseData() to remove one file from the CD-ROM object, and then try to run that file
        graphicDesignProjects.removeFile(festivalPoster);
        theNorthBorders.runFile(festivalPoster);


        // Use reformatDisc() to wipe all files from the music CD, and then try to run a file from it
        theNorthBorders.reformatDisc();
        theNorthBorders.runFile(transit);


        // Create a 720 MB MP4 file and try to write it to the CD that is no longer a music CD
        File tooBigFile = new File("too-big-file.mp4", 720);
        theNorthBorders.writeFile(tooBigFile);


        /* BONUS MISSION 1: FLOPPYDISK AND VINYLRECORD CLASSES*/

        // Create objects of the FloppyDisk and VinylRecord classes
        FloppyDisk philosophyPapers = new FloppyDisk("Philosophy Papers", 3.5);
        VinylRecord magCityInstr = new VinylRecord("Magnificent City Instrumentals", 12, "RJD2");

        // Create File objects and add them to the FloppyDisk object using writeData()
        File historyOfPhilosophy = new File("history-of-philosophy.doc", 0.4);
        File absoluteTruths = new File("absolute-truths.doc", 0.63);
        philosophyPapers.writeFile(historyOfPhilosophy);
        philosophyPapers.writeFile(absoluteTruths);

        // Create File objects and add them (as an array) to the VinylRecord object using pressVinyl()
        File aBeautifulMine = new File("A Beautiful Mine", 53);
        File fire = new File("Fire", 41);
        File aSundayMystery = new File("A Sunday Mystery", 13);
        File[] files = new File[] { aBeautifulMine, fire, aSundayMystery };
        magCityInstr.pressVinyl(files);

        // Print each object
        System.out.println(philosophyPapers);
        System.out.println(magCityInstr);

        // Run a file from the FloppyDisk object
        philosophyPapers.runFile(absoluteTruths);

        // Play a track from the VinylRecord object
        magCityInstr.playTrack(aBeautifulMine);


        /* BONUS MISSION 2: WHEEL & FRISBEE CLASSES */

        // Create multiple objects of the Wheel and Frisbee classes
        Wheel michelin = new Wheel("Michelin Defender 2 235/60 R18 106H", 18);
        Wheel goodyear = new Wheel("Goodyear Edge A/T 225/75 R15", 15);
        Frisbee ultimateDisc = new Frisbee("Innova Pulsar", "Ultimate disc");
        Frisbee freestyleDisc = new Frisbee("Discraft Sky Styler", "Freestyle disc");

        // Print each object
        System.out.println(michelin);
        System.out.println(goodyear);
        System.out.println(ultimateDisc);
        System.out.println(freestyleDisc);

        // Drive a car for one Wheel object
        michelin.driveCar();

        // Change the MPH of both wheels and drive cars
        michelin.setMilesPerHour(45);
        goodyear.setMilesPerHour(70);
        michelin.driveCar();
        goodyear.driveCar();

        // Throw a disc for each Frisbee object
        ultimateDisc.throwFrisbee();
        freestyleDisc.throwFrisbee();
    }
}