package main;
import service.ProdutoService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProdutoService produtoService = new ProdutoService();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Atualizar produto");
            System.out.println("4 - Remover produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade: ");
                    int qtd = scanner.nextInt();
                    produtoService.adicionarProduto(nome, preco, qtd);
                    break;
                case 2:
                    produtoService.listarProdutos();
                    break;
                case 3:
                    System.out.print("ID do produto: ");
                    int idUpdate = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo preço: ");
                    double novoPreco = scanner.nextDouble();
                    System.out.print("Nova quantidade: ");
                    int novaQtd = scanner.nextInt();
                    produtoService.atualizarProduto(idUpdate, novoNome, novoPreco, novaQtd);
                    break;
                case 4:
                    System.out.print("ID do produto: ");
                    int idRemove = scanner.nextInt();
                    produtoService.removerProduto(idRemove);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println(" Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
