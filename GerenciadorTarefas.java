import java.util.ArrayList;

public class GerenciadorTarefas {

    // Atributo Array List
    private ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();

    // Método construtor
    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
    }

    // Métodos especiais de ações CRUD

    // Create
    public void adicionar(String descricao) {
        Tarefa novaTarefa = new Tarefa(descricao);
        this.tarefas.add(novaTarefa);
    }

    // Read
    public void listarTarefas() {
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }
    }

    // Update
    public void concluirTarefas(int posicao) {
        int indiceReal = posicao - 1;
        if (indiceReal >= 0 && indiceReal < tarefas.size()) {
            Tarefa t = tarefas.get(indiceReal);
            t.setConcluido(true);
            System.out.println("\nTarefa conluida com sucesso");
        } else {
            System.out.println("\nErro!! Posição invalida.");
        }
    }

    // Delete
    public void removerTarefa(int posicao) {
        int indiceReal = posicao - 1;
        if (indiceReal >= 0 && indiceReal < tarefas.size()) {
            tarefas.remove(indiceReal);
            System.out.println("\nTarefa removida com sucesso.");
        } else {
            System.out.println("\nErro!! Posição invalida.");
        }
    }

    // Métodos especiais Get & Set
    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

}
