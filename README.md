# Desafio Técnico – Programação

Este repositório contém as soluções para o desafio técnico proposto, dividido em cinco questões abordando lógica de programação, leitura de dados e manipulação de strings.

## Tecnologias utilizadas

* **Linguagem**: Java 11+
* **IDE**: Eclipse IDE
* **Gerenciador de dependências**: Maven
* **Bibliotecas**:

  * `org.json` para leitura e manipulação de arquivos JSON

## Estrutura das questões

* **Questão 1** – Soma de números naturais com laço `while`
* **Questão 2** – Verificação de número na sequência de Fibonacci
* **Questão 3** – Leitura de faturamento diário a partir de um arquivo `JSON`

  * Retorna o menor valor de faturamento diário
  * Retorna o maior valor de faturamento diário
  * Retorna o número de dias com faturamento acima da média (ignorando dias com faturamento zero)
* **Questão 4** – Cálculo de percentual de faturamento por estado em relação ao total mensal
* **Questão 5** – Inversão de uma `String` sem utilizar métodos prontos como `reverse`

---

## Como rodar o projeto

### 2. Importe o projeto no Eclipse como projeto Maven:

* Vá em `File > Import > Existing Maven Projects`
* Selecione o diretório clonado
* Aguarde o Eclipse baixar as dependências

### 3. Execute as classes principais:

Cada questão está separada em um pacote. Vá até o pacote correspondente (`Questao_1`, `Questao_2`, etc.) e execute o método `main`.

> **Observação:**
> Para a Questão 3, certifique-se de que o arquivo `data.json` esteja na raiz do projeto ou no mesmo diretório da classe que faz a leitura.

---

## Exemplo de `data.json` para a Questão 3

```json
{
  "faturamento": [
    { "dia": 1, "valor": 22174.1664 },
    { "dia": 2, "valor": 24537.6698 },
    { "dia": 3, "valor": 26139.6134 },
    { "dia": 4, "valor": 0.0 },
    { "dia": 5, "valor": 0.0 },
    { "dia": 6, "valor": 26742.6612 }
    // ... continue com os outros dias
  ]
}
```

---
