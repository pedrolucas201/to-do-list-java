package repositorios;

import entidades.Tarefa;
import interfaces.repositorios.ITarefaRepositorio;

import java.util.ArrayList;
import java.util.List;

public class TarefaRepositorio implements ITarefaRepositorio {
    private List<Tarefa> tarefas = new ArrayList<>();
    private int currentId = 1;

    @Override
    public void criar(Tarefa tarefa) {
        tarefa.setId(currentId++);
        tarefas.add(tarefa);
    }

    @Override
    public Tarefa ler(int id) {
        return tarefas.stream().filter(tarefa -> tarefa.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void atualizar(Tarefa tarefa) {
        Tarefa tarefaExistente = ler(tarefa.getId());
        if (tarefaExistente != null) {
            tarefaExistente.setTitulo(tarefa.getTitulo());
            tarefaExistente.setDescricao(tarefa.getDescricao());
        }
    }

    @Override
    public void deletar(int id) {
        tarefas.removeIf(tarefa -> tarefa.getId() == id);
    }

    @Override
    public List<Tarefa> listarTodas() {
        return tarefas;
    }
}