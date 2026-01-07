import java.util.ArrayList;

public class GerenciadorTarefas {

    // Atributo Array List
    private ArrayList<Tarefa> tarefas;
    public Object getTarefas;

    // Método construtor
    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
    }

    // Métodos especiais de ações CRUD

    // Create
    public void adicionar(String descricao) {
        Tarefa novaTarefa = new Tarefa(descricao); // O objeto 'novaTarefa' recebe a descricao do usuário
        this.tarefas.add(novaTarefa); // A lista tarefas recebe um novo item com 'novaTarefa'
    }

    // Read
    public void listarTarefas() {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". " + tarefas.get(i));// Com o método for, 'tarefas' lista os itens
                                                                    // começando
                                                                    // no indice 0 mas mostrando 1 para o usuário
            }
        }
    

    // Update
    public void concluirTarefas(int posicao) {
        int indiceReal = posicao - 1;
        if (indiceReal >= 0 && indiceReal < tarefas.size()) {// A posição escolhida pelo usuáro é subtraida por 1
                                                             // onde
            // 'indiceReal' recebe esse valor, compara, vira parâmetro
            // e printa
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
        if (indiceReal >= 0 && indiceReal < tarefas.size()) {// A mesma logica usada no método 'concluirTarefas' se
                                                             // aplica aqui com 'indiceReal'
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
