import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Author joanneRowling = new Author( "Джоан ", " Роулинг ");
        Book potter = new Book("Гарри Поттер ", 1996, joanneRowling);

        potter.setPublishData(1997);

        System.out.println( potter.getTitle()+" "+ potter.getPublishData()+ " " + joanneRowling.getName() + joanneRowling.getSurname()+"");

        Author levTolstoy = new Author( " Лев ", " Толстой ");
        Book warAndPeace = new Book( "Война и мир",1989, levTolstoy);

        warAndPeace.setPublishData(1888);
        System.out.println(warAndPeace.getTitle()+ " " + warAndPeace.getPublishData() + " " + levTolstoy.getName() + "" + levTolstoy.getSurname() + "" );
    }

}