package com.example.pcmarket.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @ManyToOne
    private Attachment attachment;
    private String description;
    private Integer price;
    @ManyToOne
    private Brand brand;
    @ManyToOne
    private Review review;
    @OneToOne
    private Category category;
}
