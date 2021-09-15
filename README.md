# API de Validação de Senhas

Essa API tem por objetivo validar uma senha baseada em regras de caracteres.

Segue abaixo as regras de uma senha válida:

1. Nove ou mais caracteres
2. Ao menos 1 dígito
3. Ao menos 1 letra minúscula
4. Ao menos 1 letra maiúscula
5. Ao menos 1 caractere especial
6. Considere como especial os seguintes caracteres: !@#$%^&*()-+
7. Não possuir caracteres repetidos dentro do conjunto

Exemplos:

```javascript
IsValid("") // false  
IsValid("aa") // false  
IsValid("ab") // false  
IsValid("AAAbbbCc") // false  
IsValid("AbTp9!foo") // false  
IsValid("AbTp9!foA") // false
IsValid("AbTp9 fok") // false
IsValid("AbTp9!fok") // true
```
## Pré-requisitos
1. É necessário ter instalado o Java na versão 11 [Java SE Development Kit 11 Downloads](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html). Ao entrar no link, é necessário escolher o Sistema Operacional que será instalado para a execussão.

2. É necessário ter instalado o Maven (de preferência na versão mais recente). [Maven](https://maven.apache.org/download.cgi)

## Execução do Projeto

Clonar o projeto:

```bash
gh repo clone edkiriyama/validation-password
```
Entrar no diretório do projeto:

```bash

```

Executar o JAR do Projeto:
```bash
java -jar target\password-0.0.1-SNAPSHOT.jar
```

## Detalhes da Solução

1. Foi utilizado a linguagem de programação Java. 
2. Para criação da API Web foi utilizado o SPRING como Framework padrão MVC que facilita a criação da API.
3. Para os teste unitários, foi utilizado o JUnit, pois estes frameworks são os mais utilizados para execussão dos testes nesta linguagem.
4. A solução foi baseada em um serviço de Validação de Senha, porém todos as validações foram realizadas em métodos separados para segmentar as responsabilidades, fazendo com que cada método tivesse somente 1 objetivo.

## Premissas


