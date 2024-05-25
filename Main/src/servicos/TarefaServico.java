package servicos;

import entidades.Tarefa;
import interfaces.servicos.ITarefaServico;
import interfaces.repositorios.ITarefaRepositorio;

import java.util.List;

public class TarefaServico implements ITarefaServico {
    private ITarefaRepositorio tarefaRepositorio;

    public TarefaServico(ITarefaRepositorio tarefaRepositorio) {
        this.tarefaRepositorio = tarefaRepositorio;
    }

    @Override
    public void criarTarefa(Tarefa tarefa) {
        tarefaRepositorio.criar(tarefa);
    }

    @Override
    public Tarefa lerTarefa(int id) {
        return tarefaRepositorio.ler(id);
    }

    @Override
    public void atualizarTarefa(Tarefa tarefa) {
        tarefaRepositorio.atualizar(tarefa);
    }

    @Override
    public void deletarTarefa(int id) {
        tarefaRepositorio.deletar(id);
    }

    @Override
    public List<Tarefa> listarTodasTarefas() {
        return tarefaRepositorio.listarTodas();
    }
}