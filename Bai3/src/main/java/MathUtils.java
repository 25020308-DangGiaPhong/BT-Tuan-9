import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    // Khởi tạo Logger từ thư viện Logback/SLF4J
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    // Một hàm cộng cơ bản
    public int add(int a, int b) {
        // Sử dụng structured logging thay vì System.out.println
        logger.info("Đang thực hiện phép tính cộng: {} + {}", a, b);
        return a + b;
    }

    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        math.add(5, 7);
        logger.info("Chương trình chạy thành công!");
    }
}