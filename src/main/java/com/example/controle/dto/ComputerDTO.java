package com.example.controle.dto;

import jdk.jfr.Category;
import lombok.*;
import org.springframework.stereotype.Controller;


@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class ComputerDTO {
     String proce;
     String ram;
     String hardDrive;
     double price;
     String macAddress;

}
