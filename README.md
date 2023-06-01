# Generation-Blog-Pessoal
![image](https://github.com/DrikaDev/Generation-Blog-Pessoal/assets/102387476/ac691388-dc5c-49c0-9571-5c650d866637)

# Projeto Blog Pessoal é um projeto guiado com as seguintes características:

👉🏻 1º parte do Projeto:\
Criação do banco de dados da aplicação: db_blogpessoal.

1) Na Camada Model, criação da Classe Postagem com os seus respectivos atributos.
2) Na Classe Postagem, criação da Tabela tb_postagens no Banco de dados db_blogpessoal.
3) Na Camada Repository, criação da Interface PostagemRepository (com a capacidade de se comunicar com o banco de dados MySQL).
4) Na Camada de Controller, criação da Classe PostagemController. 
5) Na Camada Controller, criação de um endpoint: getAll() com a capacidade de listar todas as Postagens.

👉🏻 2º parte do Projeto:\
Adicionado as seguintes características:
1) Na Interface PostagemRepository adiciodo o Método de busca específica:
- findAllByTituloContainingIgnoreCase() com a função de trazer todas as Postagens cujo título possua a palavra pesquisada.
2) Na Classe PostagemController adicionado os seguintes Métodos:
- getById() com a função de trazer uma única Postagem identificada pelo id.
- getByTitulo() com a função de trazer todas Postagens cujo titulo possua a palavra pesquisada.
- post() com a função de gravar (persistir) uma nova Postagem no banco de dados.
- put() com a função de atualizar os dados de uma Postagem.
- delete() com a função de apagar uma Postagem no banco de dados.

👉🏻 3º parte do Projeto:\
Adicionado o recurso Tema com as seguintes características:

1) Na Camada Model, criação da Classe Tema com os seus respectivos atributos.
2) Na Classe Tema, criação da Tabela tb_temas no Banco de dados db_blogpessoal.
3) Na Camada Repository, criação da Interface TemaRepository (com a capacidade de se comunicar com o banco de dados MySQL).
4) Na Interface TemaRepository, adicionado o Método de busca específica:
- findAllByDescricaoContainingIgnoreCase() com a função de trazer todes os Temas cuja descrição possua a palavra pesquisada.
5) Na Camada Controller, criação da Classe TemaController. 
6) Na Classe TemaController, criação dos seguintes endpoints:
- getAll() com a capacidade de listar todes os Temas.
- getById() com a função de trazer um único Tema identificado pelo id.
- getByDescricao() com a função de trazer todes os Temas cuja descrição possua a palavra pesquisada.
- post() com a função de gravar (persistir) um novo Tema no Banco de dados.
- put() com a função de atualizar os dados de um Tema.
- delete() com a função de apagar um Tema no banco de dados.

👉🏻 4º parte do Projeto:\
Inserção das Dependências necessárias para a Spring Security:

1) Inclusão das dependências de segurança no Pom.xml.
2) Na Camada Model, criação da Classe UsuárioLogin, necessária para a Spring Security, com os atributos necessários, os Métodos Get e Set.
3) Na Camada Repository, criação da Interface do UsuarioRepository e crição do Método de Busca Específica necessário para a Spring Security.
4) Criação da Camada Security com as Classes necessárias para a Spring Security. 
5) Criação da Camada Service com as Classe de Serviço necessária para a Spring Security.  
6) Na Camada Controller, criação da segunda Classe Controller e criação dos Métodos do CRUD.

👉🏻 5º parte do Projeto:\
Implementação dos testes utilizando o JUnit no back-end no Recurso Usuario.

1) Atualização da dependência spring-test no arquivo pom.xml para não utilizar as versões antigas do JUnit.
2) Criação da source folder resources em src/test.
3) Criação do arquivo application.properties em src/test/resources.
4) Configuração do banco de dados de teste no arquivo acima.
5) Criação do teste para a classe Controller Usuario.
6) Execute todos os testes no JUnit.

👉🏻 6º parte do Projeto:\
Implementação do Swagger e efetuar o Deploy na nuvem do Backend:

1) Criação da Documentação da API com o Spring Docs;
2) Testar toda a API com o Insomnia;
3) Preparar a API para o Deploy;
4) Enviar as atualizações do projeto para o repositório remoto;
5) Efetuar o Deploy no Render
