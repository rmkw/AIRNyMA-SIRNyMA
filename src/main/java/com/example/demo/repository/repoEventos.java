package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.entityEventos;

public interface repoEventos extends JpaRepository<entityEventos, Long>{
    
}
