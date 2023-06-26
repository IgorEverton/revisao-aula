package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.LoginStatusEnum;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Login")
public class Login {
    @Id
    private int Id;
    private LocalDateTime LoginDate;
    private LoginStatusEnum Status;
    @ManyToOne
    @JoinColumn(name = "IdCustomer")
    public Customer Customer;
}
