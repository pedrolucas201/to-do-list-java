// src/servicos/ComentarioServico.java
package servicos;

import entidades.Comentario;
import interfaces.servicos.IComentarioServico;
import interfaces.repositorios.IComentarioRepositorio;

import java.util.List;

public class ComentarioServico implements IComentarioServico {
    private IComentarioRepositorio comentarioRepositorio;

    public ComentarioServico(IComentarioRepositorio comentarioRepositorio) {
        this.comentarioRepositorio = comentarioRepositorio;
    }

    @Override
    public void criarComentario(Comentario comentario) {
        comentarioRepositorio.criar(comentario);
    }

    @Override
    public Comentario lerComentario(int id) {
        return comentarioRepositorio.ler(id);
    }

    @Override
    public void atualizarComentario(Comentario comentario) {
        comentarioRepositorio.atualizar(comentario);
    }

    @Override
    public void deletarComentario(int id) {
        comentarioRepositorio.deletar(id);
    }

    @Override
    public List<Comentario> listarTodosComentarios() {
        return comentarioRepositorio.listarTodos();
    }
}
