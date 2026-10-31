package calculadora;

/**
 * Testes da classe Calculadora.
 *
 * @author Aluno
 * @version 3.0
 */
public class TesteCalculadora {

    /**
     * Compara o resultado esperado com o obtido e mostra na tela.
     *
     * @param nome     nome do teste
     * @param a        primeiro número
     * @param b        segundo número
     * @param op       operação
     * @param esperado resultado esperado
     */
    static void testar(String nome, int a, int b, String op, String esperado) {
        String obtido = new Calculadora().calc(a, b, op);
        System.out.println("Teste: " + nome);
        System.out.println("  Entradas: a=" + a + ", b=" + b + ", op=" + op);
        System.out.println("  Esperado: " + esperado);
        System.out.println("  Obtido:   " + obtido);
        System.out.println("  " + (esperado.equals(obtido) ? "PASSOU" : "FALHOU"));
        System.out.println();
    }

    /**
     * Roda todos os testes.
     *
     * @param args não usado
     */
    public static void main(String[] args) {
        testar("Soma", 10, 5, "+", "15");
        testar("Subtração", 10, 5, "-", "5");
        testar("Multiplicação", 10, 5, "*", "50");
        testar("Divisão", 10, 4, "/", "2.5");
        testar("Divisão por zero", 10, 0, "/", "Erro: divisão por zero");
        testar("Operação inválida", 10, 5, "%", "Operação inválida");
    }
}
