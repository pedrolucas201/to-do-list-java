// src/interfaces/repositorios/IProjetoRepositorio.java
package interfaces.repositorios;

import entidades.Projeto;
import java.util.List;

public interface IProjetoRepositorio {
    void criar(Projeto projeto);
    Projeto ler(int id);
    void atualizar(Projeto projeto);
    void deletar(int id);
    List<Projeto> listarTodos();
}
