import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerMovieTest {

    @Test
    public void addNewMovie() {
        ManagerMovie manager = new ManagerMovie();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addNewMovies() {
        ManagerMovie manager = new ManagerMovie();

        manager.addMovies("bloodshot");
        manager.addMovies("forward");
        manager.addMovies("gentlemen");
        manager.addMovies("number one");
        manager.addMovies("invisible man");

        String[] expected = {"bloodshot", "forward", "gentlemen", "number one", "invisible man"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void limitMovies() {
        ManagerMovie manager = new ManagerMovie();

        manager.addMovies("forward");
        manager.addMovies("gentlemen");
        manager.addMovies("number one");
        manager.addMovies("invisible man");

        String[] expected = {"invisible man", "number one", "gentlemen", "forward"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
