📦 Sistema de Cadastro de Produtos

Projeto simples em Java que implementa um sistema de cadastro de produtos no console, com operações de CRUD (Criar, Ler, Atualizar e Deletar).

🚀 Funcionalidades

✅ Cadastrar produtos (nome, preço, quantidade)

✅ Listar todos os produtos cadastrados

✅ Atualizar informações de um produto existente

✅ Remover produtos do cadastro

✅ IDs automáticos para cada produto

🛠️ Tecnologias utilizadas

Java 17+

Paradigma de Programação Orientada a Objetos (POO)

Collections (ArrayList)

IntelliJ IDEA (IDE utilizada no desenvolvimento)

📂 Estrutura do Projeto

src/
 ├── main/
 │    └── Main.java
 
 ├── model/
 
 │    └── Produto.java
 
 └── service/
      └── ProdutoService.java
      
 model/ → classes de entidades (Produto)

service/ → regras de negócio (ProdutoService)

main/ → ponto de entrada do programa (Main)

▶️ Como executar o projeto

Clone o repositório: git clone https://github.com/MatheusBr93/Sistema-de-Cadastro-de-Produtos.git

Abra o projeto no IntelliJ IDEA (ou outra IDE de sua preferência).

Execute a classe Main.java.

O menu aparecerá no console:
=== MENU ===

1 - Cadastrar produto

2 - Listar produtos

3 - Atualizar produto

4 - Remover produto

0 - Sair

📌 Melhorias Futuras

Salvar os produtos em arquivo (.txt ou .csv).

Adicionar relatório de produtos com estoque baixo.

Criar uma interface gráfica (JavaFX ou Swing).

Evoluir para API REST com Spring Boot.

👨‍💻 Autor

Desenvolvido por Matheus do Nascimento Rodrigues ✨
