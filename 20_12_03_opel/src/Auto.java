public class Auto {
    public String brand;
    public String color;

    public Auto(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}