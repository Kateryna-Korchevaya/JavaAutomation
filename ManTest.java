package dz11;


import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ManTest {

    @Test
    public void testIsRetired() {
        Man man = new Man("Oleg", "Kruglov", 70);
        assertTrue(man.isRetired());

        man = new Man("Oleg", "Kruglov", 60);
        assertFalse(man.isRetired());
    }

    @Test
    public void testRegisterPartnership() {
        Man man = new Man("Oleg", "Kruglov", 70);
        Woman woman = new Woman("Klara", "Krechetova", 65);

        man.registerPartnership(woman);

        assertEquals(man, woman.getPartner());
        assertEquals(woman, man.getPartner());
        assertEquals("Kruglov", woman.getLastName());
    }

    @Test
    public void testDeregisterPartnership() {
        Man man = new Man("Oleg", "Kruglov", 70);
        Woman woman = new Woman("Klara", "Krechetova", 65);

        man.registerPartnership(woman);
        man.deregisterPartnership(true);

        assertNull(man.getPartner());
        assertNull(woman.getPartner());
        assertEquals("Klara (reverted)", woman.getLastName());
    }

    @Test
    public void testGettersAndSetters() {
        Man man = new Man("Oleg", "Kruglov", 70);
        assertEquals("Oleg", man.getFirstName());
        assertEquals("Kruglov", man.getLastName());
        assertEquals(70, man.getAge());

        man.setFirstName("Alex");
        man.setLastName("Ivanov");
        man.setAge(65);

        assertEquals("Alex", man.getFirstName());
        assertEquals("Ivanov", man.getLastName());
        assertEquals(65, man.getAge());
    }
}

