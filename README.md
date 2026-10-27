# projeto_calculadora

## Descrição do projeto

Módulo de cálculos básicos em Java para a startup fictícia **FinançApp**, um aplicativo de controle de finanças pessoais. A classe `Calculadora` será usada em funcionalidades como orçamento mensal, divisão de despesas e projeção de economia.

## Objetivo da atividade

Praticar qualidade de software: testes unitários, tratamento de erros, refatoração, documentação técnica (JavaDoc) e versionamento com Git/GitHub.

## Tecnologias utilizadas

- Java (JDK 17+)
- JavaDoc para a documentação técnica
- Git e GitHub para versionamento

## Estrutura do projeto

```
projeto_calculadora/
├── calculadora/
│   ├── Calculadora.java
│   └── TesteCalculadora.java
├── docs/                 # JavaDoc gerado (abra docs/index.html)
├── resultado_testes.txt  # saída da execução dos testes
└── README.md
```

## Explicação das operações

O método principal é `calc(int a, int b, String operacao)`, que retorna o resultado como texto.

| Operação | Símbolo | Exemplo | Retorno |
|---|---|---|---|
| Soma | `+` | `calc(10, 5, "+")` | `15` |
| Subtração | `-` | `calc(10, 5, "-")` | `5` |
| Multiplicação | `*` | `calc(10, 5, "*")` | `50` |
| Divisão | `/` | `calc(10, 4, "/")` | `2.5` |
| Divisão por zero | `/` | `calc(10, 0, "/")` | `Erro: divisão por zero` |
| Operação inválida | qualquer outra (ou `null`) | `calc(10, 5, "%")` | `Operação inválida` |

Nenhuma entrada inválida interrompe o programa: os erros são devolvidos como mensagens.

## Como compilar e executar

```bash
mkdir out
javac -encoding UTF-8 -d out calculadora/*.java
java -cp out calculadora.TesteCalculadora
```

Para gerar o JavaDoc:

```bash
javadoc -encoding UTF-8 -docencoding UTF-8 -private -author -version -d docs calculadora/*.java
```

## Refatoração (branch `Refatoracao`)

- Extração do método `dividir`, que trata a divisão por zero.
- `if/else` aninhados trocados por `if` simples em sequência.
- Melhoria de nomes de variáveis e adição de JavaDoc e comentários.

Após a refatoração, os 6 testes foram executados novamente e todos passaram.

## Prints da execução dos testes

> Insira aqui o print do terminal executando `TesteCalculadora`.
> (A saída em texto está em `resultado_testes.txt`.)

![Execução dos testes](prints/testes.png)

## Prints da documentação JavaDoc

> Insira aqui o print de `docs/index.html` aberto no navegador.

![JavaDoc](prints/javadoc.png)

## Link do repositório

> https://github.com/SEU_USUARIO/projeto_calculadora

## Autor

Aluno — atividade individual.
