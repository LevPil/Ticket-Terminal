import org.example.Payment;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentTest {
    Payment ticketService = new Payment();

    @Test
    void discountStudent(){
        assertEquals(700, ticketService.discountByCategory("student",1000));
    }

    @Test
    void testEnoughPoints() {
        assertEquals(500, ticketService.applyPointsDiscount(1000, 500, 500));
    }

    @Test
     void testAllPointsCoverPrice() {
        assertEquals(0, ticketService.applyPointsDiscount(300, 500, 400));
    }

}
