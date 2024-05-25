package repositorios;

import entidades.Subtarefa;
import interfaces.repositorios.ISubtarefaRepositorio;

import java.util.ArrayList;
import java.util.List;

public class SubtarefaRepositorio implements ISubtarefaRepositorio {
    private List<Subtarefa> subtarefas = new ArrayList<>();
    private int currentId = 1;

    @Override
    public void criar(Subtarefa subtarefa) {
        subtarefa.setId(currentId++);
        subtarefas.add(subtarefa);
    }

    @Override
    public Subtarefa ler(int id) {
        return subtarefas.stream().filter(subtarefa -> subtarefa.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void atualizar(Subtarefa subtarefa) {
        Subtarefa subtarefaExistente = ler(subtarefa.getId());
        if (subtarefaExistente != null) {
            subtarefaExistente.setTitulo(subtarefa.getTitulo());
            subtarefaExistente.setDescricao(subtarefa.getDescricao());
            subtarefaExistente.setTarefaId(subtarefa.getTarefaId());
        }
    }

    @Override
    public void deletar(int id) {
        subtarefas.removeIf(subtarefa -> subtarefa.getId() == id);
    }

    @Override
    public List<Subtarefa> listarTodas() {
        return subtarefas;
    }
}