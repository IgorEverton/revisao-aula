package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "ShoppingCart")
public class ShoppingCart {
    @Id
    private int Id;
    private int IdProduto;
    private int Quanttity;
    @ManyToOne
    @JoinColumn(name = "IdCustomer")
    private Customer Customer;
}
