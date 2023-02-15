Transportadora
===============	


##  Menu inicial com três opções
    ### Importar arquivo de encomendas
    ### Exibir a lista de encomendas Normais
    ### Exibir a lista de encomendas Expressas

### Importar arquivo de encomendas
    Solicitar o nome de um arquivo de dados e alimentar os vetores de encomendas (cada vetor deve ter 1000 posições e ser capaz de armazenar objetos de seu tipo de encomenda correspondente).  
    Deve ser possível importar vários arquivos, sem que os dados de um arquivo apaguem os dados que já estão no vetor.  

### Exibir a lista de encomendas (normais ou expressas)
    Um item por linha com os seguintes dados:  
        Nro pedido; peso; valor do frete

#### Classes  
    Transportadora
    Encomendas
    Encomendas expressas

#### Interfaces
    ImportarArquivo
        métodos:  
            1. carregarConfiguracoes(String arqConfig)
            2. importarDados(String arqDadosEntrada)