// src/interfaces/servicos/ITarefaServico.java
package interfaces.servicos;

import entidades.Tarefa;
import java.util.List;

public interface ITarefaServico {
    void criarTarefa(Tarefa tarefa);
    Tarefa lerTarefa(int id);
    void atualizarTarefa(Tarefa tarefa);
    void deletarTarefa(int id);
    List<Tarefa> listarTodasTarefas();
}


