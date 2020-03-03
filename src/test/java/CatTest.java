import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    Cat c = new Cat();


    @Test
    public void setColor() {

        Assert.assertEquals("black",c.getColor());
    }


    @Test
    public void speak() {
        Assert.assertNotEquals("jump-jump",c.speak());
    }
}