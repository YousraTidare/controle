package com.example.controle.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Computer {
    @Id
    @GeneratedValue
    private int id_Pc;
    private String proce;
    private String ram;
    private String hardDrive;
    private double price;
    private String macAddress;
}
