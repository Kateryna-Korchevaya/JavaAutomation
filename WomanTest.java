package dz11;


import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class WomanTest {

    @Test
    public void testIsRetired() {
        Woman woman = new Woman("Klara", "Krechetova", 65);
        assertTrue(woman.isRetired());

        woman = new Woman("Klara", "Krechetova", 55);
        assertFalse(woman.isRetired());
    }

    @Test
    public void testRegisterPartnership() {
        Woman woman = new Woman("Klara", "Krechetova", 65);
        Man man = new Man("Oleg", "Kruglov", 70);

        woman.registerPartnership(man);

        assertEquals(woman, man.getPartner());
        assertEquals(man, woman.getPartner());
        assertEquals("Kruglov", woman.getLastName());
    }

    @Test
    public void testDeregisterPartnership() {
        Woman woman = new Woman("Klara", "Krechetova", 65);
        Man man = new Man("Oleg", "Kruglov", 70);

        woman.registerPartnership(man);
        woman.deregisterPartnership(true);

        assertNull(man.getPartner());
        assertNull(woman.getPartner());
        assertEquals("Klara (reverted)", woman.getLastName());
    }

    @Test
    public void testGettersAndSetters() {
        Woman woman = new Woman("Klara", "Krechetova", 65);
        assertEquals("Klara", woman.getFirstName());
        assertEquals("Krechetova", woman.getLastName());
        assertEquals(65, woman.getAge());

        woman.setFirstName("Anna");
        woman.setLastName("Ivanova");
        woman.setAge(60);

        assertEquals("Anna", woman.getFirstName());
        assertEquals("Ivanova", woman.getLastName());
        assertEquals(60, woman.getAge());
    }
}
