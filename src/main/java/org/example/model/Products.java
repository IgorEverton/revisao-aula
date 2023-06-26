package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Products")
public class Products {
    @Id
    private int Id;
    private String Name;
    private String Type;
    private int CmSize;
    private String Workmanship;
}
