package jeff.balbalosa;

public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass!");
        System.out.println("OOP_Composition - house Class");
        System.out.println("");

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("Modern", 4,3,2,1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Room bedroom = new Room("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}