package Activity4;

public class Main {

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Apple", "iPhone 13", "Black", 2021, "M1",
                8, 3200, 6.5);

        SmartWatch smartWatch = new SmartWatch("Garmin", "Fenix 5", "Black", 2019,
                5, false);

        System.out.println("El smartphone es el " + smartPhone + ".\nEl smartwatch es el " + smartWatch + ".");
    }
}
