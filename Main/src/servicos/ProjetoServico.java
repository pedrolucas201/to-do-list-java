// src/servicos/ProjetoServico.java
package servicos;

import entidades.Projeto;
import interfaces.servicos.IProjetoServico;
import interfaces.repositorios.IProjetoRepositorio;

import java.util.List;

public class ProjetoServico implements IProjetoServico {
    private IProjetoRepositorio projetoRepositorio;

    public ProjetoServico(IProjetoRepositorio projetoRepositorio) {
        this.projetoRepositorio = projetoRepositorio;
    }

    @Override
    public void criarProjeto(Projeto projeto) {
        projetoRepositorio.criar(projeto);
    }

    @Override
    public Projeto lerProjeto(int id) {
        return projetoRepositorio.ler(id);
    }

    @Override
    public void atualizarProjeto(Projeto projeto) {
        projetoRepositorio.atualizar(projeto);
    }

    @Override
    public void deletarProjeto(int id) {
        projetoRepositorio.deletar(id);
    }

    @Override
    public List<Projeto> listarTodosProjetos() {
        return projetoRepositorio.listarTodos();
    }
}
