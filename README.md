# Generation-Blog-Pessoal
# Projeto Blog Pessoal é um projeto guiado com as seguintes características:

1º parte do Projeto:
1)	O Banco de dados da aplicação será o db_blogpessoal.
2)	Na Camada Model será criada a Classe Postagem com os seus respectivos atributos.
3)	A Classe Postagem criará a Tabela tb_postagens no Banco de dados db_blogpessoal.
4)	Na Camada Repository será criada a Interface PostagemRepository (com a capacidade de se comunicar com o banco de dados MySQL).
5)	Na Camada de Controller será criada a Classe PostagemController. 
6)	Na Camada Controller será criado um endpoint:
●	getAll() com a capacidade de listar todas as Postagens.

2º parte do Projeto:\
Adicionado as seguintes características:
1) Na Interface PostagemRepository adicionamos o Método de busca específica:
- findAllByTituloContainingIgnoreCase() com a função de trazer todas as  Postagens cujo título possua a palavra pesquisada.
2) Na Classe PostagemController vamos adicionar os seguintes Métodos:
- getById() com a função de trazer uma única Postagem identificada pelo id.
- getByTitulo() com a função de trazer todas Postagens cujo titulo possua a palavra pesquisada.
- post() com a função de gravar (persistir) uma nova Postagem no banco de dados.
- put() com a função de atualizar os dados de uma Postagem.
- delete() com a função de apagar uma Postagem no banco de dados.
