import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCollectionTest {

    @Test
    public void testSizeZero(){
        ArrayCollection arrayC = new ArrayCollection(0);
        assertEquals(0, arrayC.size());
    }

}