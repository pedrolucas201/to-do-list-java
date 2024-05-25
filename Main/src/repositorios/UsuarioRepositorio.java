package repositorios;

import entidades.Usuario;
import interfaces.repositorios.IUsuarioRepositorio;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio implements IUsuarioRepositorio {
    private List<Usuario> usuarios = new ArrayList<>();
    private int currentId = 1;

    @Override
    public void criar(Usuario usuario) {
        usuario.setId(currentId++);
        usuarios.add(usuario);
    }

    @Override
    public Usuario ler(int id) {
        return usuarios.stream().filter(usuario -> usuario.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void atualizar(Usuario usuario) {
        Usuario usuarioExistente = ler(usuario.getId());
        if (usuarioExistente != null) {
            usuarioExistente.setNome(usuario.getNome());
            usuarioExistente.setEmail(usuario.getEmail());
        }
    }

    @Override
    public void deletar(int id) {
        usuarios.removeIf(usuario -> usuario.getId() == id);
    }

    @Override
    public List<Usuario> listarTodos() {
        return usuarios;
    }
}