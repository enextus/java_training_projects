public class Toy {
    String name;
    int cost;
    String manufacturer;
    int age;

    public Toy() {
        System.out.println("В конструкторе по умолчанию - присваиваем дефолтные значения");
    }

    public Toy(String name, int cost, String manufacturer) {
        this();
        this.name = name;
        this.cost = cost;
        this.manufacturer = manufacturer;
        System.out.println("В конструкторе с тремя параметрами - присваиваем данные значения (3)");
    }

    public Toy(String name, int cost, String manufacturer, int age) {
        this(name, cost, manufacturer);
        this.age = age;
        System.out.println("В конструкторе с четырьмя параметрами - присваиваем данные значения (4)");
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", manufacturer='" + manufacturer + '\'' +
                ", age=" + age +
                '}';
    }
}
