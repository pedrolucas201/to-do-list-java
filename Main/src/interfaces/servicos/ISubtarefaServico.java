// src/interfaces/servicos/ISubtarefaServico.java
package interfaces.servicos;

import entidades.Subtarefa;
import java.util.List;

public interface ISubtarefaServico {
    void criarSubtarefa(Subtarefa subtarefa);
    Subtarefa lerSubtarefa(int id);
    void atualizarSubtarefa(Subtarefa subtarefa);
    void deletarSubtarefa(int id);
    List<Subtarefa> listarTodasSubtarefas();
}
