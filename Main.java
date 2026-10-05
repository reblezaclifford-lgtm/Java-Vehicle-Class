public class Main {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle(
            "Ford Mustang Shelby",
            "Muscle Car",
            1968
        );

        Vehicle vehicle2 = new Vehicle(
            "Tesla Model 3",
            "Electric Sedan",
            2024
        );

        Vehicle vehicle3 = new Vehicle(
            "Toyota RAV4",
            "SUV",
            2020
        );

        System.out.println("--- Vehicle 1 ---");
        vehicle1.displayInfo();
        vehicle1.startEngine();
        vehicle1.honk();

        System.out.println("Brand: " + vehicle1.getBrand());
        System.out.println("Type: " + vehicle1.getType());
        System.out.println("Year: " + vehicle1.getYear());
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());

        System.out.println("\n--- Vehicle 2 ---");
        vehicle2.displayInfo();
        vehicle2.startEngine();
        vehicle2.honk();

        System.out.println("Brand: " + vehicle2.getBrand());
        System.out.println("Type: " + vehicle2.getType());
        System.out.println("Year: " + vehicle2.getYear());
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());

        System.out.println("\n--- Vehicle 3 ---");
        vehicle3.displayInfo();
        vehicle3.startEngine();
        vehicle3.honk();

        System.out.println("Brand: " + vehicle3.getBrand());
        System.out.println("Type: " + vehicle3.getType());
        System.out.println("Year: " + vehicle3.getYear());
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());

        System.out.println("\n--- setYear() Tests ---");

        boolean result1 = vehicle1.setYear(2000);

        System.out.println("setYear(2000): " + result1);
        System.out.println("Stored year: " + vehicle1.getYear());
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());

        boolean result2 = vehicle1.setYear(1885);

        System.out.println("\nsetYear(1885): " + result2);
        System.out.println("Stored year: " + vehicle1.getYear());

        boolean result3 = vehicle1.setYear(2027);

        System.out.println("\nsetYear(2027): " + result3);
        System.out.println("Stored year: " + vehicle1.getYear());

        System.out.println("\n--- Constructor Validation Tests ---");

        Vehicle invalidVehicle1 = new Vehicle(
            "Test Vehicle",
            "Invalid Year 1885",
            1885
        );

        System.out.println("New vehicle with year 1885");
        System.out.println("Initial year: " + invalidVehicle1.getYear());

        Vehicle invalidVehicle2 = new Vehicle(
            "Test Vehicle",
            "Invalid Year 2027",
            2027
        );

        System.out.println("\nNew vehicle with year 2027");
        System.out.println("Initial year: " + invalidVehicle2.getYear());
    }
}
