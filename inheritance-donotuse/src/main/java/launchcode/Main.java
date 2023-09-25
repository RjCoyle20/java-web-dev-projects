package launchcode;


public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());   // prints true

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight()); // prints 13

        Cat suki = new HouseCat("Suki", 8);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

        System.out.println(suki.noise()); // prints "Meeeeeeooooowww!"
        System.out.println(cheshireCat.noise()); // prints "Hello, my name is Cheshire!"



    }

}
