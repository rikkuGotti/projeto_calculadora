package calculadora;

/**
 * Módulo de cálculos básicos do aplicativo FinançApp.
 * <p>
 * Realiza soma, subtração, multiplicação e divisão de números inteiros,
 * sendo usado em funcionalidades como orçamento mensal, divisão de despesas
 * e projeção de economia. Nenhuma entrada inválida interrompe a execução:
 * os erros são devolvidos como mensagens de texto.
 *
 * @author Aluno
 * @version 2.0
 */
public class Calculadora {

    /** Mensagem devolvida quando a operação informada não é suportada. */
    public static final String MSG_OPERACAO_INVALIDA = "Operação inválida";

    /** Mensagem devolvida quando há tentativa de divisão por zero. */
    public static final String MSG_DIVISAO_POR_ZERO = "Erro: divisão por zero";

    /**
     * Executa uma operação matemática básica entre dois números inteiros.
     *
     * @param a        primeiro operando
     * @param b        segundo operando
     * @param operacao símbolo da operação: "+", "-", "*" ou "/"
     * @return o resultado como texto, ou uma mensagem de erro caso a operação
     *         seja inválida (inclusive nula) ou ocorra divisão por zero
     */
    public String calc(int a, int b, String operacao) {
        if (operacao == null) {
            return MSG_OPERACAO_INVALIDA;
        }

        switch (operacao) {
            case "+":
                return String.valueOf(somar(a, b));
            case "-":
                return String.valueOf(subtrair(a, b));
            case "*":
                return String.valueOf(multiplicar(a, b));
            case "/":
                return dividir(a, b);
            default:
                return MSG_OPERACAO_INVALIDA;
        }
    }

    /**
     * Soma dois números.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return a soma de {@code a} e {@code b}
     */
    private int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai o segundo número do primeiro.
     *
     * @param a minuendo
     * @param b subtraendo
     * @return a diferença {@code a - b}
     */
    private int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números.
     *
     * @param a primeiro fator
     * @param b segundo fator
     * @return o produto de {@code a} e {@code b}
     */
    private int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide o primeiro número pelo segundo, com resultado decimal.
     * A divisão por zero é tratada aqui, evitando falhas na execução.
     *
     * @param dividendo número a ser dividido
     * @param divisor   número divisor
     * @return o quociente como texto, ou {@link #MSG_DIVISAO_POR_ZERO}
     *         se o divisor for zero
     */
    private String dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            return MSG_DIVISAO_POR_ZERO;
        }
        return String.valueOf((double) dividendo / divisor);
    }

    /**
     * Ponto de entrada com um exemplo rápido de uso da calculadora.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("10 + 5 = " + calculadora.calc(10, 5, "+"));
        System.out.println("10 / 0 = " + calculadora.calc(10, 0, "/"));
        System.out.println("10 % 5 = " + calculadora.calc(10, 5, "%"));
    }
}
