import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    Dog dg = new Dog();

    @Test
    public void speak() {

        Assert.assertEquals("Woof-woof",dg.speak());
    }
}