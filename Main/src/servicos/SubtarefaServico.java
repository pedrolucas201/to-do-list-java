// src/servicos/SubtarefaServico.java
package servicos;

import entidades.Subtarefa;
import interfaces.servicos.ISubtarefaServico;
import interfaces.repositorios.ISubtarefaRepositorio;

import java.util.List;

public class SubtarefaServico implements ISubtarefaServico {
    private ISubtarefaRepositorio subtarefaRepositorio;

    public SubtarefaServico(ISubtarefaRepositorio subtarefaRepositorio) {
        this.subtarefaRepositorio = subtarefaRepositorio;
    }

    @Override
    public void criarSubtarefa(Subtarefa subtarefa) {
        subtarefaRepositorio.criar(subtarefa);
    }

    @Override
    public Subtarefa lerSubtarefa(int id) {
        return subtarefaRepositorio.ler(id);
    }

    @Override
    public void atualizarSubtarefa(Subtarefa subtarefa) {
        subtarefaRepositorio.atualizar(subtarefa);
    }

    @Override
    public void deletarSubtarefa(int id) {
        subtarefaRepositorio.deletar(id);
    }

    @Override
    public List<Subtarefa> listarTodasSubtarefas() {
        return subtarefaRepositorio.listarTodas();
    }
}
