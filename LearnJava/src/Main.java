import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //System of vehicle
        int option;
        char letter = 'y';

        do {
        System.out.println("=== M E N U ===");
        System.out.println("1) Car");
        System.out.println("2) Motorcycle");
        System.out.println("3) Bicycle");
        System.out.println("4) Save archive");
        System.out.println("5) Exit");
        do {
            System.out.println("Select an option: ");
            option = scanner.nextInt();
            scanner.nextLine();
            if (option < 1 || option > 5) {
                System.out.println("Select a valid option");
            }
        } while (option < 1 || option > 5);
        Vehicle vehicle = null;
        switch (option) {
            case 1:
                System.out.println("Enter the owner: ");
                String carOwner = scanner.nextLine();
                System.out.println("Speed? ");
                int carSpeed = scanner.nextInt();
                scanner.nextLine();
                vehicle = new Car(carOwner, carSpeed);

                vehicle.start();
                vehicle.stop();
                break;
            case 2:
                System.out.println("Enter the owner of the Motorcycle: ");
                String motorOwner = scanner.nextLine();
                System.out.println("Speed? ");
                int motoSpeed = scanner.nextInt();
                scanner.nextLine();
                vehicle = new Motorcycle(motorOwner, motoSpeed);

                vehicle.start();
                vehicle.stop();
                break;
            case 3:
                System.out.println("Enter the owner of the bicycle: ");
                String bikeOwner = scanner.nextLine();
                System.out.println("Speed? ");
                int bikeSpeed = scanner.nextInt();
                scanner.nextLine();
                vehicle = new Bicycle(bikeOwner, bikeSpeed);

                vehicle.start();
                vehicle.stop();
                break;
            case 4:
                try {
                    FileWriter writer = new FileWriter("archive.txt", true);

                    writer.write("Information saved successfully");
                    writer.close();
                    System.out.println("Saved in file");

                } catch (IOException e) {
                    System.out.println("Error saving file");
                }
                break;
            case 5:
                System.out.println("Exiting of the program... ");
                return;
            default:
                System.out.println("Invalid option");
                break;
        }
        System.out.println("Try again ? (y/n) ");
        letter = scanner.next().charAt(0);
        scanner.nextLine();

    }while (letter == 'y' || letter == 'Y');

        System.out.println("Thank you so much");

    scanner.close();
    }
}