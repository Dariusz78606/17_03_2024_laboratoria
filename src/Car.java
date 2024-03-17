public class Car {
    private String name;
    private int year;
    private String fuel;
    private String color;

    public Car(String name, int year, String fuel, String color) {
        this.name = name;
        this.year = year;
        this.fuel = fuel;
        this.color = color;
    }

    public String infoCar() {
         return "Nazwa samochodu to " + this.name +
                 ". Rok produkcji: " + this.year +
                 ". Kolor samochodu: " + this.color +
                 ". Rodzaj paliwa: " + this.fuel + ".";
     }
}
