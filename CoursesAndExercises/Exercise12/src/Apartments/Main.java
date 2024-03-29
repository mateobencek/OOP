package Apartments;

import java.awt.*;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Apartment apartment = new Apartment("Unska 2, 10000 Zagreb", 2);

        Room kitchen = new Room(FloorType.CERAMIC, new BigDecimal("8.56"), false, 1, Color.YELLOW);
        Room bathRoom = new BathRoom(true, 1, "shower", FloorType.CERAMIC, new BigDecimal("7.28"), true, 0, Color.BLUE);
        Room bedRoom1 = new Room(FloorType.HARDWOOD, new BigDecimal("12.23"), true, 1, Color.PINK);
        Room bedRoom2 = new Room(FloorType.HARDWOOD, new BigDecimal("17.33"), true, 2, Color.GREEN);
        Room livingRoom = new Room(FloorType.HARDWOOD, new BigDecimal("20.08"), true, 3, Color.ORANGE);

        apartment.addRooms(kitchen, bathRoom, bedRoom1, bedRoom2, livingRoom);

        System.out.println("Added room found: " + apartment.containsRoom(bedRoom2));
        System.out.println("Identical room found: " + apartment.containsRoom(new Room(FloorType.HARDWOOD, new BigDecimal("17.33"), true, 2, Color.GREEN)));
        System.out.println("Almost identical room found: " +
                apartment.containsRoom(new Room(FloorType.HARDWOOD, new BigDecimal("18.01").subtract(new BigDecimal("0.68")), true, 2,
                        Color.GREEN)));

        System.out.println("Identical bathroom found: " + apartment.containsRoom(new BathRoom(true, 1, "shower", FloorType.CERAMIC, new BigDecimal("7.28"), true, 0, Color.BLUE)));
        System.out.println("Different bathroom found: " + apartment.containsRoom(new BathRoom(false, 2, "bath", FloorType.CERAMIC, new BigDecimal("7.28"), true, 0, Color.BLUE)));
    }
}
