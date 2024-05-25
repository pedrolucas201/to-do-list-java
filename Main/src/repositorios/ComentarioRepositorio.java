package repositorios;

import entidades.Comentario;
import interfaces.repositorios.IComentarioRepositorio;

import java.util.ArrayList;
import java.util.List;

public class ComentarioRepositorio implements IComentarioRepositorio {
    private List<Comentario> comentarios = new ArrayList<>();
    private int currentId = 1;

    @Override
    public void criar(Comentario comentario) {
        comentario.setId(currentId++);
        comentarios.add(comentario);
    }

    @Override
    public Comentario ler(int id) {
        return comentarios.stream().filter(comentario -> comentario.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void atualizar(Comentario comentario) {
        Comentario comentarioExistente = ler(comentario.getId());
        if (comentarioExistente != null) {
            comentarioExistente.setTexto(comentario.getTexto());
            comentarioExistente.setTarefaId(comentario.getTarefaId());
        }
    }

    @Override
    public void deletar(int id) {
        comentarios.removeIf(comentario -> comentario.getId() == id);
    }

    @Override
    public List<Comentario> listarTodos() {
        return comentarios;
    }
}