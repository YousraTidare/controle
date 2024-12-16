package com.example.controle.repositories;

import com.example.controle.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer,Integer> {
    public List<Computer> findByProce(String proce);

    public List<Computer> findByProceAndPrice(String proce, double price);
}
