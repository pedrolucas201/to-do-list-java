// src/interfaces/servicos/IProjetoServico.java
package interfaces.servicos;

import entidades.Projeto;
import java.util.List;

public interface IProjetoServico {
    void criarProjeto(Projeto projeto);
    Projeto lerProjeto(int id);
    void atualizarProjeto(Projeto projeto);
    void deletarProjeto(int id);
    List<Projeto> listarTodosProjetos();
}
