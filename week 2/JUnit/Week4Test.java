import static org.junit.Assert.*;
import org.junit.Test;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        assertEquals(1, Week4.max2Int(1, 1));
    }

    @Test
    public void testMax2Int2() {
        assertEquals(2, Week4.max2Int(2, 1));
    }

    @Test
    public void testMax2Int3() {
        assertEquals(1, Week4.max2Int(1, -1));
    }

    @Test
    public void testMax2Int4() {
        assertEquals(3, Week4.max2Int(1, 3));
    }

    @Test
    public void testMax2Int5() {
        assertEquals(1, Week4.max2Int(1, 0));
    }

    @Test
    public void testMinArray1() {
        assertEquals(0, Week4.minArray(new int[] { 0, 1 }));
    }

    @Test
    public void testMinArray2() {
        assertEquals(2, Week4.minArray(new int[] { 5, 6, 2 }));
    }

    @Test
    public void testMinArray3() {
        assertEquals(0, Week4.minArray(new int[] { 5, 6, 2, 0, 2 }));
    }

    @Test
    public void testMinArray4() {
        assertEquals(10, Week4.minArray(new int[] { 51, 26, 32, 10 }));
    }

    @Test
    public void testMinArray5() {
        assertEquals(0, Week4.minArray(new int[] { 0, 1, 2 }));
    }

    @Test
    public void testCalculateBMI1() {
        assertEquals("Thiếu cân", Week4.calculateBMI(18, 1));
    }

    @Test
    public void testCalculateBMI2() {
        assertEquals("Bình thường", Week4.calculateBMI(22, 1));
    }

    @Test
    public void testCalculateBMI3() {
        assertEquals("Thừa cân", Week4.calculateBMI(23, 1));
    }

    @Test
    public void testCalculateBMI4() {
        assertEquals("Béo phì", Week4.calculateBMI(25, 1));
    }

    @Test
    public void testCalculateBMI5() {
        assertEquals("Bình thường", Week4.calculateBMI(19, 1));
    }
}