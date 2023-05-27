import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerMovieTest {


    @Test
    public void adobeLimit() {
        ManagerMovie manager = new ManagerMovie();

        manager.addMovies("Бладшот");
        manager.addMovies("Вперед");
        manager.addMovies("Отель/Белград/");
        manager.addMovies("Джентельмены");
        manager.addMovies("Человек - неведимка");
        manager.addMovies("Тролли. Мировой тур");
        manager.addMovies("Номер один");

        String[] expected = {"Бладшот", "Вперед", "Отель/Белград/", "Джентельмены", "Человек - неведимка" ,
                "Тролли. Мировой тур" , "Номер один"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void belowLimit() {
        ManagerMovie manager = new ManagerMovie();

        manager.addMovies("Отель/Белград/");
        manager.addMovies("Вперед");
        manager.addMovies("Джентельмены");

        String[] expected = {"Джентельмены", "Вперед", "Отель/Белград/"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Limit(){
        ManagerMovie manager = new ManagerMovie();

        manager.addMovies("Бладшот");
        manager.addMovies("Вперед");
        manager.addMovies("Отель/Белград/");
        manager.addMovies("Джентельмены");
        manager.addMovies("Человек - неведимка");

        String[] expected = {"Человек - неведимка", "Джентельмены", "Отель/Белград/","Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected , actual);
    }

}
