import java.util.Scanner;

public class MainInput{
    public static void main(String[] args){
        BikeShop shopBikes = new BikeShop();

        Scanner s = new Scanner(System.in);

        System.out.println("To create a new bike, please press 1.");
        int yes = s.nextInt();

        Bycicle b1;

        if (yes == 1){
            System.out.println("What is your name?");
            String bugFix = s.nextLine();
            String name = s.nextLine();
            if (name != ""){
                System.out.println("What type of bike do you want?");
                String type = s.nextLine();
                b1 = new Bycicle(name, type);
                System.out.println(b1);
                System.out.println("How many miles would you like to ride your bike?");
                int milesRide = s.nextInt();
                b1.ride(milesRide);
                if (b1.needsService() == true){
                    System.out.println("Your bike needs service.");
                } else {
                    System.out.println("Your bike does not need service");
                }
                System.out.println("Would you like to service your bike? If yes press 1.");
                yes = s.nextInt();
                if (yes == 1){
                    System.out.println("For how many hours?");
                    int hours = s.nextInt();
                    System.out.println("Why?");
                    bugFix = s.nextLine();
                    String reason = s.nextLine();
                    shopBikes.serviceBike(b1, hours, reason);
                    System.out.println(b1.getServiceRecord());
                    System.out.println("How many more miles would you like to ride your bike?");
                    milesRide = s.nextInt();
                    b1.ride(milesRide);
                    if (b1.needsService() == true){
                        System.out.println("Your bike needs service.");
                    } else {
                        System.out.println("Your bike does not need service");
                    }
                    System.out.println("Would you like to service your bike? If yes press 1.");
                    yes = s.nextInt();
                    while (yes == 1){
                        System.out.println("For how many hours?");
                        hours = s.nextInt();
                        System.out.println("Why?");
                        bugFix = s.nextLine();
                        reason = s.nextLine();
                        shopBikes.serviceBike(b1, hours, reason);
                        System.out.println(b1.getServiceRecord());
                        System.out.println("How many more miles would you like to ride your bike?");
                        milesRide = s.nextInt();
                        b1.ride(milesRide);
                        if (b1.needsService() == true){
                            System.out.println("Your bike needs service.");
                        } else {
                            System.out.println("Your bike does not need service");
                        }
                        System.out.println("Would you like to service your bike? If yes press 1.");
                        yes = s.nextInt();
                     }
                } else {
                    System.out.println("How many more miles would you like to ride your bike?");
                    milesRide = s.nextInt();
                    b1.ride(milesRide);
                    System.out.println("Would you like to service your bike? If yes press 1.");
                    yes = s.nextInt();
                    while (yes == 1){
                        System.out.println("For how many hours?");
                        int hours = s.nextInt();
                        System.out.println("Why?");
                        bugFix = s.nextLine();
                        String reason = s.nextLine();
                        shopBikes.serviceBike(b1, hours, reason);
                        System.out.println(b1.getServiceRecord());
                        System.out.println("How many more miles would you like to ride your bike?");
                        milesRide = s.nextInt();
                        b1.ride(milesRide);
                        if (b1.needsService() == true){
                            System.out.println("Your bike needs service.");
                        } else {
                            System.out.println("Your bike does not need service");
                        }
                        System.out.println("Would you like to service your bike? If yes press 1.");
                        yes = s.nextInt();
                     }
                }
            } else {
                System.out.println("No name detected");
            }
        } else {
            System.out.println("To create a new bike, please press 1.");
            yes = s.nextInt();  
        }
        s.close();;
    }
}