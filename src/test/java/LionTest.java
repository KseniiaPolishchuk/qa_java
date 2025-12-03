import com.example.Feline;
import com.example.Lion;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private Feline feline;
    private Lion lion;
    @Before
    public void setUp() throws Exception {
        feline = mock(Feline.class);
        lion = new Lion("Самец", feline);
    }

    @Test
    public void getKittensTest() {
        Predator mockPredator = mock(Predator.class);
        lion = new Lion(mockPredator);
        lion.getKittens();
        verify(mockPredator).getKittens();
    }
    @Test
    public void getFoodTest() throws Exception {
        Feline mockFeline = mock(Feline.class);
        lion = new Lion(mockFeline);
        lion.getFood();
        verify(mockFeline).getFood("Хищник");
    }
    @Test
    public void doesHaveManeTest() throws Exception {
        Feline feline = mock(Feline.class);
        Lion  lion = new Lion("Самец", feline);
        Assert.assertEquals(true, lion.doesHaveMane());

    }

    @Test
    public void shouldThrowExceptionSex() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> {
            lion = new Lion("Неизвестно", feline);
        });
        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

}