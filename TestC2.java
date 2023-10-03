import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestC2 {
    @Test
    void testcase1() {
        Person p = new Person(-10, "NORMAL");
        assertEquals(-1, p.account(p));
    }

    @Test
    void testcase2() {
        Person p = new Person(-10, "VIP");
        assertEquals(300000, p.account(p));
    }

    @Test
    void testcase3() {
        Person p = new Person(20, "NORMAL");
        assertEquals(500000, p.account(p));
    }

    @Test
    void testcase4() {
        Person p = new Person(3, "NORMAL");
        assertEquals(200000, p.account(p));
    }

    @Test
    void testcase5() {
        Person p = new Person(20, "VIP");
        assertEquals(7500000, p.account(p));
    }

    @Test
    void testcase6() {
        Person p = new Person(3, "VIP");
        assertEquals(300000, p.account(p));
    }
}