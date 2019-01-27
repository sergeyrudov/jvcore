package jvcore.jvcore.daySixteen;

import jvcore.jvcore.dayFiveteen.Dog;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testObject {
    public Dog d;

    @Before
    public void createDog(){
        d = new Dog();
    }

    @Test
    public void testNameShouldBeChauChau(){
        String tName = d.getPoroda();
        assertEquals("chau-chau",tName);
    }
    @Test
    public void testSmallDOg(){
        boolean isSmall = d.isSmallDog();
        Assert.assertTrue("Dog should be small ",isSmall);
    }
}
