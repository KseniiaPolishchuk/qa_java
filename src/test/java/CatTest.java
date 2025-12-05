import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Test
    public void getSoundTest() {
        Feline mockfeline = mock(Feline.class);
        Cat cat = new Cat(mockfeline);
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        Feline mockFeline = mock(Feline.class);
        Cat cat = new Cat(mockFeline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(mockFeline.eatMeat()).thenReturn(expectedFood);
        List<String> food = cat.getFood();
        Assert.assertEquals(expectedFood, food);

    }
}