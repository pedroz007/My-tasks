package com.example.MyTasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MyTasks.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
