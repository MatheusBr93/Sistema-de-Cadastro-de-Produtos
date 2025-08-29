package service;

import model.Produto;
import java.util.ArrayList;

public class ProdutoService {
    private ArrayList<Produto> produtos = new ArrayList<>();
    private int nextId = 1;

    public void adicionarProduto(String nome, double preco, int quantidade) {
        Produto produto = new Produto(nextId++, nome, preco, quantidade);
        produtos.add(produto);
        System.out.println(" Produto cadastrado com sucesso!");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto p : produtos) {
                System.out.println(p);
            }
        }
    }

    public void atualizarProduto(int id, String novoNome, double novoPreco, int novaQtd) {
        for (Produto p : produtos) {
            if (p.getId() == id) {
                p.setNome(novoNome);
                p.setPreco(novoPreco);
                p.setQuantidade(novaQtd);
                System.out.println(" Produto atualizado com sucesso!");
                return;
            }
        }
        System.out.println("⚠ Produto não encontrado!");
    }

    public void removerProduto(int id) {
        produtos.removeIf(p -> p.getId() == id);
        System.out.println(" Produto removido com sucesso!");
    }
}
