package Chandrayaan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChandrayaanTest {

    @Test
    void testMoveForwardFromNorth () {
        Chandrayaan spacecraft = new Chandrayaan(0, 0, 0, "N");
        spacecraft.executeCommand('f');
        assertEquals(0, spacecraft.getX());
        assertEquals(1, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
        assertEquals("N", spacecraft.getDirection());
    }

    @Test
    void testMoveForwardFromEast () {
        Chandrayaan spacecraft = new Chandrayaan(0, 0, 0, "E");
        spacecraft.executeCommand('f');
        assertEquals(1, spacecraft.getX());
        assertEquals(0, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
        assertEquals("E", spacecraft.getDirection());
    }

}
