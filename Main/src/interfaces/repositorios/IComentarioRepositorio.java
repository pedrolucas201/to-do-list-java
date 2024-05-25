// src/interfaces/repositorios/IComentarioRepositorio.java
package interfaces.repositorios;

import entidades.Comentario;
import java.util.List;

public interface IComentarioRepositorio {
    void criar(Comentario comentario);
    Comentario ler(int id);
    void atualizar(Comentario comentario);
    void deletar(int id);
    List<Comentario> listarTodos();
}
