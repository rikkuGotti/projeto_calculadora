package calculadora;

/**
 * Testes da classe {@link Calculadora}.
 * <p>
 * Cada teste exibe as entradas utilizadas, o resultado esperado e o
 * resultado obtido, informando se o teste passou ou falhou.
 *
 * @author Aluno
 * @version 2.0
 */
public class TesteCalculadora {

    /** Quantidade total de testes executados. */
    private static int totalTestes = 0;

    /** Quantidade de testes que passaram. */
    private static int testesAprovados = 0;

    /**
     * Executa um teste e imprime entradas, resultado esperado e obtido.
     *
     * @param nome      descrição do teste
     * @param a         primeiro operando
     * @param b         segundo operando
     * @param operacao  operação a ser testada
     * @param esperado  resultado esperado
     */
    private static void testar(String nome, int a, int b, String operacao, String esperado) {
        String obtido = new Calculadora().calc(a, b, operacao);
        boolean passou = esperado.equals(obtido);

        totalTestes++;
        if (passou) {
            testesAprovados++;
        }

        System.out.println("Teste: " + nome);
        System.out.println("  Entradas: a=" + a + ", b=" + b + ", op=\"" + operacao + "\"");
        System.out.println("  Esperado: " + esperado);
        System.out.println("  Obtido:   " + obtido);
        System.out.println("  Resultado: " + (passou ? "PASSOU" : "FALHOU"));
        System.out.println();
    }

    /**
     * Executa todos os testes e encerra com código 1 se algum falhar.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        testar("Soma", 10, 5, "+", "15");
        testar("Subtração", 10, 5, "-", "5");
        testar("Multiplicação", 10, 5, "*", "50");
        testar("Divisão", 10, 4, "/", "2.5");
        testar("Divisão por zero", 10, 0, "/", Calculadora.MSG_DIVISAO_POR_ZERO);
        testar("Operação inválida", 10, 5, "%", Calculadora.MSG_OPERACAO_INVALIDA);
        testar("Operação nula", 10, 5, null, Calculadora.MSG_OPERACAO_INVALIDA);

        System.out.println("Resumo: " + testesAprovados + " de " + totalTestes + " testes passaram.");
        if (testesAprovados != totalTestes) {
            System.exit(1);
        }
    }
}
