import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Author joanneRowling = new Author( "Джоан ", " Роулинг ");
        Book potter = new Book("Гарри Поттер ", 1996, joanneRowling);
        Book potter2 = new Book("Гарри Поттер ", 1996, joanneRowling);


        System.out.println( potter.getTitle()+" "+ potter.getPublishData()+ " " + joanneRowling.getName() + joanneRowling.getSurname()+"");

        Author levTolstoy = new Author( " Лев ", " Толстой ");
        Book warAndPeace = new Book( "Война и мир",1989, levTolstoy);

        warAndPeace.setPublishData(1888);
        System.out.println(warAndPeace.getTitle()+ " " + warAndPeace.getPublishData() + " " + levTolstoy.getName() + "" + levTolstoy.getSurname() + "" );
        System.out.println(potter);
        System.out.println(potter.equals(levTolstoy));
        System.out.println(potter.equals(potter2));
        System.out.println(potter.hashCode() == potter2.hashCode());
        System.out.println(potter.hashCode() == levTolstoy.hashCode());
    }

}