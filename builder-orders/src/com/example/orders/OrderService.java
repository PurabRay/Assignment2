package com.example.orders;

import java.util.List;

public class OrderService {
    public Order createOrder(String id, String email, List<OrderLine> lines, Integer discount, boolean expedited, String notes) {
        Order.Builder builder = new Order.Builder(id, email, lines != null && !lines.isEmpty() ? lines.get(0) : null);
        if (lines != null) {
            for (int i = 1; i < lines.size(); i++) {
                builder.addLine(lines.get(i));
            }
        }
        if (discount != null) {
            builder.discountPercent(discount);
        }
        builder.expedited(expedited);
        if (notes != null) {
            builder.notes(notes);
        }
        return builder.build();
    }
}