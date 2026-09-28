public class Vehicle {
    
    String brand;
    String type;
    int year;

    
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Year: " + year);
    }

    public void startEngine() {
        System.out.println("The engine of " + brand + " is starting... Vroom!");
    }

    public void honk() {
        System.out.println(brand + " says: Beep beep!");
    }

    
    public static void main(String[] args) {
        
        Vehicle vehicle1 = new Vehicle();
        vehicle1.brand = "Ford Mustang Shelby";
        vehicle1.type = "Muscle Car";
        vehicle1.year = 1968;
        
        Vehicle vehicle2 = new Vehicle();
        vehicle2.brand = "Tesla Model 3";
        vehicle2.type = "Electric Sedan";
        vehicle2.year = 2024;
        
        Vehicle vehicle3 = new Vehicle();
        vehicle3.brand = "Toyota RAV4";
        vehicle3.type = "SUV";
        vehicle3.year = 2020;

        System.out.println("--- Vehicle 1 ---");
        vehicle1.displayInfo();
        vehicle1.startEngine();
        vehicle1.honk();

        System.out.println("\n--- Vehicle 2 ---");
        vehicle2.displayInfo();
        vehicle2.startEngine();
        vehicle2.honk();

        System.out.println("\n--- Vehicle 3 ---");
        vehicle3.displayInfo();
        vehicle3.startEngine();
        vehicle3.honk();
    }
}
