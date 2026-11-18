public class Main{
    public static void main(String[] args){
        BikeShop shopBikes = new BikeShop();

        Bycicle b1 = new Bycicle("Bob", "electric");
        Bycicle b2 = new Bycicle("Joey", "mountain");

        System.out.println(b1);
        System.out.println(b2);

        b1.ride(-600);
        System.out.println(b1.getMilage() + " miles");

        b1.ride(300);
        System.out.println(b1.getMilage() + " miles");

        b2.ride(1000);

        System.out.println("Does the bike need service: " + b1.needsService());
        System.out.println("Does the bike need service: " + b2.needsService());

        b1.ride(201);
        System.out.println("Does the bike need service: " + b1.needsService());

        shopBikes.serviceBike(b2, 2, "bike fell off a cliff");
        System.out.println("$" + shopBikes.chargeAmount(2));

        shopBikes.serviceBike(b1, 6, "bike got hit by a truck");
        System.out.println("$" + shopBikes.chargeAmount(6));

        System.out.println("There have been " + shopBikes.getRepairs() + " repairs total.");

        Bycicle b3 = b1;

        System.out.println(b1.getMilage() + " miles");

        b3.ride(700);

        System.out.println(b1.getMilage() + " miles");

        System.out.println(b1.getServiceRecord());
    }
}