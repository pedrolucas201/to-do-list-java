// src/servicos/UsuarioServico.java
package servicos;

import entidades.Usuario;
import interfaces.servicos.IUsuarioServico;
import interfaces.repositorios.IUsuarioRepositorio;

import java.util.List;

public class UsuarioServico implements IUsuarioServico {
    private IUsuarioRepositorio usuarioRepositorio;

    public UsuarioServico(IUsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    @Override
    public void criarUsuario(Usuario usuario) {
        usuarioRepositorio.criar(usuario);
    }

    @Override
    public Usuario lerUsuario(int id) {
        return usuarioRepositorio.ler(id);
    }

    @Override
    public void atualizarUsuario(Usuario usuario) {
        usuarioRepositorio.atualizar(usuario);
    }

    @Override
    public void deletarUsuario(int id) {
        usuarioRepositorio.deletar(id);
    }

    @Override
    public List<Usuario> listarTodosUsuarios() {
        return usuarioRepositorio.listarTodos();
    }
}
