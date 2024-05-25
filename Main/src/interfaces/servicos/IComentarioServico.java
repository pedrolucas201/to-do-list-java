// src/interfaces/servicos/IComentarioServico.java
package interfaces.servicos;

import entidades.Comentario;
import java.util.List;

public interface IComentarioServico {
    void criarComentario(Comentario comentario);
    Comentario lerComentario(int id);
    void atualizarComentario(Comentario comentario);
    void deletarComentario(int id);
    List<Comentario> listarTodosComentarios();
}
