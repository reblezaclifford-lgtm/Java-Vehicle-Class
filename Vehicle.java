public class Vehicle {

    private String brand;
    private String type;
    private int year;

    public Vehicle(String brand, String type, int year) {
        this.brand = brand;
        this.type = type;

        if (year >= 1886 && year <= 2026) {
            this.year = year;
        } else {
            this.year = 2026;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public boolean setYear(int year) {
        if (year >= 1886 && year <= 2026) {
            this.year = year;
            return true;
        }

        return false;
    }

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

    public int calculateAge() {
        return 2026 - year;
    }

    public boolean isVintage() {
        return calculateAge() > 25;
    }
}
