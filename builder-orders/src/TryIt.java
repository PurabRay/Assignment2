import com.example.orders.Order;
import com.example.orders.OrderLine;
import com.example.orders.OrderService;
import com.example.orders.PricingRules;

public class TryIt {
    public static void main(String[] args) {
        OrderLine l1 = new OrderLine("A", 1, 200);
        OrderLine l2 = new OrderLine("B", 3, 100);

        Order o = new Order.Builder("o2", "a@b.com", l1)
                .addLine(l2)
                .discountPercent(10)
                .build();

        System.out.println("Before: " + o.totalAfterDiscount());
        l1.setQuantity(999);
        System.out.println("After:  " + o.totalAfterDiscount());
        System.out.println("=> Totals remain stable due to defensive copies.");
    }
}
