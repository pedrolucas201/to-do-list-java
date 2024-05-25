package main;

import entidades.Tarefa;
import repositorios.TarefaRepositorio;
import servicos.TarefaServico;
import interfaces.servicos.ITarefaServico;

import java.util.List;
import java.util.Scanner;

public class ListaDeTarefasApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ITarefaServico tarefaServico = new TarefaServico(new TarefaRepositorio());

        while (true) {
            System.out.println("1. Criar Tarefa");
            System.out.println("2. Ler Tarefa");
            System.out.println("3. Atualizar Tarefa");
            System.out.println("4. Deletar Tarefa");
            System.out.println("5. Listar Todas Tarefas");
            System.out.println("0. Sair");
            System.out.print("Digite a opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título da tarefa: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    tarefaServico.criarTarefa(new Tarefa(0, titulo, descricao));
                    break;
                case 2:
                    System.out.print("Digite o ID da tarefa: ");
                    int id = scanner.nextInt();
                    Tarefa tarefa = tarefaServico.lerTarefa(id);
                    if (tarefa != null) {
                        System.out.println(" ");
                        System.out.println("ID da Tarefa: " + tarefa.getId());
                        System.out.println("Título da Tarefa: " + tarefa.getTitulo());
                        System.out.println("Descrição da Tarefa: " + tarefa.getDescricao());
                        System.out.println(" ");
                    } else {
                        System.out.println("Tarefa não encontrada!");
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    System.out.println(" ");
                    System.out.print("Digite o ID da tarefa para atualizar: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine();  // Consumir nova linha
                    System.out.print("Digite o novo título da tarefa: ");
                    String novoTitulo = scanner.nextLine();
                    System.out.print("Digite a nova descrição da tarefa: ");
                    String novaDescricao = scanner.nextLine();
                    tarefaServico.atualizarTarefa(new Tarefa(idAtualizar, novoTitulo, novaDescricao));
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println(" ");
                    System.out.print("Digite o ID da tarefa para deletar: ");
                    int idDeletar = scanner.nextInt();
                    tarefaServico.deletarTarefa(idDeletar);
                    System.out.println(" ");
                    break;
                case 5:
                    List<Tarefa> tarefas = tarefaServico.listarTodasTarefas();
                    tarefas.forEach(t -> {
                        System.out.println(" ");
                        System.out.println("------------------------------");
                        System.out.println("ID da Tarefa: " + t.getId());
                        System.out.println("Título da Tarefa: " + t.getTitulo());
                        System.out.println("Descrição da Tarefa: " + t.getDescricao());
                        System.out.println("------------------------------");
                    });
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println(" ");
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.println(" ");
            }
        }
    }
}
