public class Film extends Author{
    String name_movie = "Antek";
    int year_movie;

    public void info() {
        System.out.println(
                "Nazwa filmu to " + this.name_movie +
                ". Rok produkcji " + year_movie +
                ". Autor filmu to " + this.getName_author() +
                " zrodzony w roku " + this.getYear_author() + "."
        );
    }
}
