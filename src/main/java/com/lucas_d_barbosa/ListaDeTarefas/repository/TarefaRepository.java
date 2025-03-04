package com.lucas_d_barbosa.ListaDeTarefas.repository;
import com.lucas_d_barbosa.ListaDeTarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer>  {
}
