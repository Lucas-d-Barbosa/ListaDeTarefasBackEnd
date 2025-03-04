package com.lucas_d_barbosa.ListaDeTarefas.service;

import com.lucas_d_barbosa.ListaDeTarefas.model.Tarefa;
import com.lucas_d_barbosa.ListaDeTarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;

    public Tarefa criarTarefa(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public List<Tarefa> obterTodasTarefas() {
        return tarefaRepository.findAll();
    }

    public Optional<Tarefa> obterTarefaPorId(Integer id) {
        return tarefaRepository.findById(id);
    }

    public Tarefa atualizarTarefa(Integer id, Tarefa tarefaAtualizada) {
        if (tarefaRepository.existsById(id)) {

            return tarefaRepository.save(tarefaAtualizada);
        } else {
            throw new RuntimeException("Tarefa não encontrada!");
        }
    }


    public void deletarTarefa(Integer id) {
        if (tarefaRepository.existsById(id)) {
            tarefaRepository.deleteById(id);
        } else {
            throw new RuntimeException("Tarefa não encontrada!");
        }
    }

}
