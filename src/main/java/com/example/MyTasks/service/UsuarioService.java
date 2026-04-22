package com.example.MyTasks.service;

import java.util.List;

import com.example.MyTasks.model.Tarefa;
import com.example.MyTasks.model.Usuario;
import com.example.MyTasks.repository.UsuarioRepository;

public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public List<Tarefa> listarTarefas(Usuario usuario){
        return null;

    }
    
}
