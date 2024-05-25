// src/interfaces/servicos/IUsuarioServico.java
package interfaces.servicos;

import entidades.Usuario;
import java.util.List;

public interface IUsuarioServico {
    void criarUsuario(Usuario usuario);
    Usuario lerUsuario(int id);
    void atualizarUsuario(Usuario usuario);
    void deletarUsuario(int id);
    List<Usuario> listarTodosUsuarios();
}
