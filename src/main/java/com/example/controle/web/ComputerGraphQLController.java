package com.example.controle.web;

import com.example.controle.dto.ComputerDTO;
import com.example.controle.service.ComputerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class ComputerGraphQLController {
    private ComputerService computerService;

    @MutationMapping
    public ComputerDTO saveComputer(@Argument ComputerDTO computer){
        return computerService.saveComputer(computer);
    }

    @MutationMapping
    public Boolean deleteComputer(@Argument Integer id){
        return computerService.deleteComputer(id);
    }


    @QueryMapping
    public List<ComputerDTO> getComputerByProce(@Argument String proce){
        return computerService.getComputerByProce(proce);
    }

    @QueryMapping
    public List<ComputerDTO> getComputerByProceAndPrice(@Argument String proce, @Argument double price){
        return computerService.getComputerByProceAndPrice(proce, price);
    }

}
