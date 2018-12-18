# Padrões de projeto em java para estudo
*Maioria dos codigos fornecidos pelo Professor Fábio Bezerra para matéria Lab. de Produção de Software*
# Singleton
Criar uma unica instancia de um objeto e facilitar acesso a essa instancia. Utilizado principalmente para arquivos de configuração ou conexão com banco de dados

*O padrão Singleton permite criar objetos únicos para os quais há apenas uma instância. Este padrão oferece um ponto de acesso global, assim como uma variável global, porém sem as desvantagens das variáveis globais.* 

* O padrão Singleton define um ponto único de acesso global sendo inclusive muito mais de gerenciar a criação e utilização da instância.*

Leituras Adicionais:
[DevMedia](https://www.devmedia.com.br/padrao-de-projeto-singleton-em-java/26392)

# Factory Method
Encapsular a escolha da classe concreta a ser utilizada na criação de objetos de um determinado tipo

**Segundo o GOF (Group Of Four) o padrão Factory Method é**: *“Um padrão que define uma interface para criar um objeto, mas permite às classes decidirem qual classe instanciar. O Factory Method permite a uma classe deferir a instanciação para subclasses”.*

Leituras Adicionais:
[DevMedia](https://www.devmedia.com.br/padrao-de-projeto-factory-method-em-java/26348)

# Abstract Factory
Encapsular a escolha das classes concretas a serem utilizadas na criação dos objetos de diversas famílias

A idéia é que a aplicação não chame diretamente as classes concretas, e que a adição ou remoção de um tipo de interface dê o menor trabalho possível, portanto vamos criar uma classe abstrata para que a classe cliente que necessitar de um metodo de pagamento, por exemplo, não saiba se o cartão é de “VisoViaCielo” ou “VisoViaRede”, ela tem de saber apenas que é um Visa.
Crédito:[DevMedia](https://www.devmedia.com.br/padrao-abstract-factory/23030)

# Builder

Separar o processo de construção de um objeto de sua representação e permitir a sua criação passo-a-passo,geralmente por se tratar de um objeto complexo. Diferentes representações de objetos podem ser criadas com passo a passo distintos.
*“Separar a construção de um objeto complexo de sua representação de modo que o mesmo processo de construção possa criar diferentes representações.”*
Crédito e leitura adicional:[Marcos Brizeno](https://brizeno.wordpress.com/category/padroes-de-projeto/builder/)
