import org.junit.Test;
import static org.junit.Assert.*;

public class Test_Enum {

    @Test
    public void testStatusEnum() {
        Status s1 = Status.Completed;
        assertEquals("Completed", s1.toString());

        Status s2 = Status.Running;
        assertEquals(0, s2.ordinal());

        Status[] ss = Status.values();
        assertEquals(4, ss.length);
        assertEquals(Status.Running, ss[0]);
        assertEquals(Status.Failed, ss[1]);
        assertEquals(Status.Stopped, ss[2]);
        assertEquals(Status.Completed, ss[3]);
    }

    @Test
    public void testLaptopEnum() {
        Laptop mac = Laptop.Mac;
        assertEquals(2000, mac.getPrice());

        Laptop lenovo = Laptop.Lenovo;
        assertEquals(1000, lenovo.getPrice());

        Laptop hp = Laptop.HP;
        assertEquals(1500, hp.getPrice());

        Laptop asus = Laptop.Asus;
        assertEquals(500, asus.getPrice());
    }
}
