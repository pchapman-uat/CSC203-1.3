// Input the scanner library that allows the Scanner function to be used
import java.util.Scanner;

// This identifies the code of the whole document
public class Main {
    // The main function that runs on startup
    public static void main(String[] args) {
        
        // Following lines is to "clear" the terminal
        Integer count = 0;
        while (count <= 100) {
            System.out.println("");
            count++;
        }
        // Varriable to store the name of the station
        String station = "Starbase 13";

        String name;

        // This try is not needed, however it helps prevent a resource leek

        // This creates a scanner that waits for the user to input a value
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Before entering " + station + ", please Enter you Name"); 
            // This will save the next line (the one the user inputs) as the name variable
            name = scanner.nextLine();
        }  

        // Array of all messages that will be displayed
        String[] messages = new String[]{
            "Hello " + name + " and welcome to " + station + "!",
            station + " is a Federation starbase located on the edge of the Federation Phalanx in the Marrat Nebula.",
            "The goal of this station is to help police the Marrat region against piracy and other criminal affairs in check.",
            "We welcome you to our station, and we hope you enjoy your stay, but we would like you to understand our rules",
            "We require all guests to not disturb with the activities of our officers, remember you are being monitored at all times for criminal activity",
            "Thank you for visiting, and stay safe on your journey"
        };

        // For loop that goes through all elements in the messages array and prints them
        for(int i = 0; i < messages.length; i++){
            System.out.println(messages[i]);
        }
    }
} 