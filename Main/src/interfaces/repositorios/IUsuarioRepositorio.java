// src/interfaces/repositorios/IUsuarioRepositorio.java
package interfaces.repositorios;

import entidades.Usuario;
import java.util.List;

public interface IUsuarioRepositorio {
    void criar(Usuario usuario);
    Usuario ler(int id);
    void atualizar(Usuario usuario);
    void deletar(int id);
    List<Usuario> listarTodos();
}
