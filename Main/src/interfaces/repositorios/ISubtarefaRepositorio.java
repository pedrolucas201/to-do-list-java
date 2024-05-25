// src/interfaces/repositorios/ISubtarefaRepositorio.java
package interfaces.repositorios;

import entidades.Subtarefa;
import java.util.List;

public interface ISubtarefaRepositorio {
    void criar(Subtarefa subtarefa);
    Subtarefa ler(int id);
    void atualizar(Subtarefa subtarefa);
    void deletar(int id);
    List<Subtarefa> listarTodas();
}
