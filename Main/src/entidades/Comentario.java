package entidades;

public class Comentario {
    private int id;
    private int tarefaId;
    private String texto;

    public Comentario() {}

    public Comentario(int id, int tarefaId, String texto) {
        this.id = id;
        this.tarefaId = tarefaId;
        this.texto = texto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTarefaId() {
        return tarefaId;
    }

    public void setTarefaId(int tarefaId) {
        this.tarefaId = tarefaId;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}