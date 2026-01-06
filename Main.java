import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        Scanner entrada = new Scanner(System.in);
        int opcao;

        while (true) {
            System.out.println("\n--------SISTEMA DE TAREFAS CRUD-------");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Listar Tarefas");
            System.out.println("3 - Concluir Tarefa");
            System.out.println("4 - Remover Tarefa");
            System.out.println("0 - Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("\nAdicione uma tarefa: ");
                    String tarefa = entrada.nextLine();
                    gerenciador.adicionar(tarefa);
                    System.out.println("\nTarefa adicionada!");
                    break;

                case 2:
                    System.out.println("\n----Sua lista de tarefas----\n");
                    gerenciador.listarTarefas();
                    break;

                case 3:
                    System.out.println("\n--------------------------");
                    gerenciador.listarTarefas();
                    System.out.println("\nDigite o numero da tarefa que foi concluida: ");
                    int numero = entrada.nextInt();
                    gerenciador.concluirTarefas(numero);
                    break;

                case 4:
                    System.out.println("-----------------------------");
                    gerenciador.listarTarefas();
                    System.out.println("\nDigite o numero da tarefa para remover: ");
                    int num = entrada.nextInt();
                    gerenciador.removerTarefa(num);
                    break;

                case 0:
                    System.out.println("\nSaindo...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção invalida!!");

            }

        }

        /*
         * CASO 0: // Sair
         * ESCREVER "Saindo..."
         * PARAR O PROGRAMA (System.exit)
         * 
         * CASO PADRÃO: // Se digitar qualquer outra coisa
         * ESCREVER "Opção Inválida!"
         * FIM ESCOLHA
         * 
         * ESCREVER "---------------------------"
         * FIM ENQUANTO
         * FIM
         */

    }
}
