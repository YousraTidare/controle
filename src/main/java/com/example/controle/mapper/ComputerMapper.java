package com.example.controle.mapper;


import com.example.controle.dao.entities.Computer;
import com.example.controle.dto.ComputerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Computer fromComputerDtoToComputer(ComputerDTO computerDTO){
        return mapper.map(computerDTO, Computer.class);
    }

    public ComputerDTO fromComputerToComputerDto(Computer computer){
        return mapper.map(computer, ComputerDTO.class);
    }
}
