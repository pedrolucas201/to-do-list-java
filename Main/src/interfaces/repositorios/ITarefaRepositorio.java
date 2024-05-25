// src/interfaces/repositorios/ITarefaRepositorio.java
package interfaces.repositorios;

import entidades.Tarefa;
import java.util.List;

public interface ITarefaRepositorio {
    void criar(Tarefa tarefa);
    Tarefa ler(int id);
    void atualizar(Tarefa tarefa);
    void deletar(int id);
    List<Tarefa> listarTodas();
}