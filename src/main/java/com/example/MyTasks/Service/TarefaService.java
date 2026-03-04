package com.example.MyTasks.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.example.MyTasks.model.Tarefa;
import com.example.MyTasks.repository.TarefaRepository;

@Service
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }
    
    public Tarefa cadastrarTarefa(Tarefa tarefa){
        return this.tarefaRepository.save(tarefa);
    }

    public Optional<Tarefa> busacTarefa(Long id){
        return this.tarefaRepository.findById(id);
    }

    public void deletarTarefa(Tarefa tarefa){
        this.tarefaRepository.delete(tarefa);
    }

    public List<Tarefa> listarTarefas(){
        return this.tarefaRepository.findAll();
    }
}
