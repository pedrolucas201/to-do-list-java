package entidades;

public class Subtarefa extends Tarefa {
    private int tarefaId;

    public Subtarefa() {}

    public Subtarefa(int id, String titulo, String descricao, int tarefaId) {
        super(id, titulo, descricao);
        this.tarefaId = tarefaId;
    }

    public int getTarefaId() {
        return tarefaId;
    }

    public void setTarefaId(int tarefaId) {
        this.tarefaId = tarefaId;
    }
}