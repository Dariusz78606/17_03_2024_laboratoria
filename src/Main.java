public class Main {
    public static void main(String[] args) {
        Film movie = new Film();
        movie.name_movie = "Avatar";
        movie.year_movie = 2018;
        movie.setName_author("Andrzej");
        movie.setYear_author(1986);
        movie.info();
        Car car = new Car(
                "Volvo",
                2012,
                "benzyna",
                "czerwony");
        System.out.println(car.infoCar());
    }

}