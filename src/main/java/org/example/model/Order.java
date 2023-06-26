package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.OrderStatusEnum;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Orders")
public class Order {
    @Id
    private int Id;
    private LocalDateTime OrderDate;
    private OrderStatusEnum Status;

    @ManyToOne
    @JoinColumn(name="IdCustomer")
    private Customer Customer;

    @OneToOne
    @JoinColumn(name = "Id")
    private OrderDetails OrderDetails;
}
