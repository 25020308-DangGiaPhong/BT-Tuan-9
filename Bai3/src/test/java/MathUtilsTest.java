import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {

    @Test
    public void testAdd() {
        MathUtils math = new MathUtils();
        int result = math.add(5, 7);
        
        // Kiểm tra xem 5 + 7 có đúng bằng 12 không
        assertEquals(12, result, "Phép cộng 5 + 7 phải cho ra kết quả là 12");
    }
}