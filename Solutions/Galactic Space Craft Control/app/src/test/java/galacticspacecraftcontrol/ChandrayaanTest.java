package galacticspacecraftcontrol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChandrayaanTest {

    @Test
    public void testInitialPositionAndDirection() {
        Chandrayaan spacecraft = new Chandrayaan(0, 0, 0, "N");
        assertEquals(0, spacecraft.getX());
        assertEquals(0, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
        assertEquals("N", spacecraft.getDirection());
    }

    @Test
    public void testMoveForwardNorth() {
        Chandrayaan spacecraft = new Chandrayaan(0, 0, 0, "N");
        spacecraft.processCommands(new char[] {'f'});
        assertEquals(0, spacecraft.getX());
        assertEquals(1, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
        assertEquals("N", spacecraft.getDirection());
    }

    @Test
    public void testMoveBackwardNorth() {
        Chandrayaan spacecraft = new Chandrayaan(0, 0, 0, "N");
        spacecraft.processCommands(new char[] {'b'});
        assertEquals(0, spacecraft.getX());
        assertEquals(-1, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
        assertEquals("N", spacecraft.getDirection());
    }

    @Test
    public void testTurnLeftFromNorth() {
        Chandrayaan spacecraft = new Chandrayaan(0, 0, 0, "N");
        spacecraft.processCommands(new char[] {'l'});
        assertEquals(0, spacecraft.getX());
        assertEquals(0, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
        assertEquals("W", spacecraft.getDirection());
    }

    @Test
    public void testTurnRightFromNorth() {
        Chandrayaan spacecraft = new Chandrayaan(0, 0, 0, "N");
        spacecraft.processCommands(new char[] {'r'});
        assertEquals(0, spacecraft.getX());
        assertEquals(0, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
        assertEquals("E", spacecraft.getDirection());
    }

    @Test
    public void testTurnUpFromNorth() {
        Chandrayaan spacecraft = new Chandrayaan(0, 0, 0, "N");
        spacecraft.processCommands(new char[] {'u'});
        assertEquals(0, spacecraft.getX());
        assertEquals(0, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
        assertEquals("U", spacecraft.getDirection());
    }

    @Test
    public void testTurnDownFromNorth() {
        Chandrayaan spacecraft = new Chandrayaan(0, 0, 0, "N");
        spacecraft.processCommands(new char[] {'d'});
        assertEquals(0, spacecraft.getX());
        assertEquals(0, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
        assertEquals("D", spacecraft.getDirection());
    }

    @Test
    public void testFullExample() {
        Chandrayaan spacecraft = new Chandrayaan(0, 0, 0, "N");
        spacecraft.processCommands(new char[] {'f', 'r', 'u', 'b', 'l'});
        assertEquals(0, spacecraft.getX());
        assertEquals(1, spacecraft.getY());
        assertEquals(-1, spacecraft.getZ());
        assertEquals("U", spacecraft.getDirection());
    }
}
