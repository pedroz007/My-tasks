package com.example.MyTasks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.MyTasks.Service.TarefaService;
import com.example.MyTasks.model.Tarefa;
import com.example.MyTasks.model.Usuario;

import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService){
        this.tarefaService = tarefaService;
    }

    @GetMapping("/{id}")
    public Tarefa buscarPorId( @PathVariable Long id ){
        return this.tarefaService.busacTarefa(id)
            .orElseThrow(() -> new EntityNotFoundException("Tarefa não encontarda"));
    }
    
}
