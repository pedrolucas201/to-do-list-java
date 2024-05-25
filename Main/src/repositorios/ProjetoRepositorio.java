package repositorios;

import entidades.Projeto;
import interfaces.repositorios.IProjetoRepositorio;

import java.util.ArrayList;
import java.util.List;

public class ProjetoRepositorio implements IProjetoRepositorio {
    private List<Projeto> projetos = new ArrayList<>();
    private int currentId = 1;

    @Override
    public void criar(Projeto projeto) {
        projeto.setId(currentId++);
        projetos.add(projeto);
    }

    @Override
    public Projeto ler(int id) {
        return projetos.stream().filter(projeto -> projeto.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void atualizar(Projeto projeto) {
        Projeto projetoExistente = ler(projeto.getId());
        if (projetoExistente != null) {
            projetoExistente.setNome(projeto.getNome());
        }
    }

    @Override
    public void deletar(int id) {
        projetos.removeIf(projeto -> projeto.getId() == id);
    }

    @Override
    public List<Projeto> listarTodos() {
        return projetos;
    }
}