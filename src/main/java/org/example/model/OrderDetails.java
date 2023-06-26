package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "OrderDetails")
public class OrderDetails {

    @OneToOne
    @EmbeddedId
    @JoinColumn(name = "IdOrder")
    private Order Order;
}
