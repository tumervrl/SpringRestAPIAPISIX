package com.example.restapi.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String email;
}
