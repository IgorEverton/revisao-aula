package org.example.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.valueobject.Address;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Customers")
public class Customer {
    @Id
    private int Id;
    private String Name;
    @Embedded
    private Address Address;
    private String Phone;
    private String Email;

    @OneToMany(mappedBy = "Customer")
    private List<ShoppingCart> ShoppingCart;

    @OneToMany(mappedBy = "Customer")
    private List<Order> Orders;

    @OneToMany(mappedBy = "Customer")
    private List<Login> Logins;
}
