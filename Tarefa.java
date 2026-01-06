public class Tarefa {

    //Atributos
    private String descricao;
    private boolean concluida;

    //Método construtor
    public Tarefa(String novadescricao) {
        this.descricao = novadescricao;
        this.concluida = false;
    }

    //Mpetodos Get & Set
    public String getDescricao() {
        return descricao;
    }

    public boolean getConcluido() {
        return concluida;
    }

    public void setConcluido(boolean concluido) {
        this.concluida = concluido;
    }

    //Métod toString formatado
    @Override
    public String toString() {
        if (concluida == true) {
            return "[X]" + descricao;
        } else {
            return "[ ]" + descricao;
        }
    }

}