package calculadora;

/**
 * Calculadora simples com as quatro operações básicas.
 *
 * @author Enrico Pimentel Gotti Encarnação
 * @version 3.0
 */
public class Calculadora {

    /**
     * Faz uma operação entre dois números inteiros.
     *
     * @param a  primeiro número
     * @param b  segundo número
     * @param op operação: "+", "-", "*" ou "/"
     * @return o resultado em texto, ou uma mensagem de erro
     */
    public String calc(int a, int b, String op) {
        if ("+".equals(op)) {
            return "" + (a + b);
        }
        if ("-".equals(op)) {
            return "" + (a - b);
        }
        if ("*".equals(op)) {
            return "" + (a * b);
        }
        if ("/".equals(op)) {
            return dividir(a, b);
        }
        return "Operação inválida";
    }

    /**
     * Divide a por b, sem deixar dividir por zero.
     *
     * @param a dividendo
     * @param b divisor
     * @return o resultado em texto, ou mensagem de erro se b for zero
     */
    private String dividir(int a, int b) {
        if (b == 0) {
            return "Erro: divisão por zero";
        }
        return "" + ((double) a / b);
    }
}
