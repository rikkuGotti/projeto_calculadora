package calculadora;

public class TesteCalculadora {

    static int total = 0;
    static int aprovados = 0;

    static void testar(String nome, int a, int b, String op, String esperado) {
        Calculadora calc = new Calculadora();
        String obtido = calc.calc(a, b, op);
        boolean ok = esperado.equals(obtido);
        total++;
        if (ok) {
            aprovados++;
        }
        System.out.println("Teste: " + nome);
        System.out.println("  Entradas: a=" + a + ", b=" + b + ", op=\"" + op + "\"");
        System.out.println("  Esperado: " + esperado);
        System.out.println("  Obtido:   " + obtido);
        System.out.println("  Resultado: " + (ok ? "PASSOU" : "FALHOU"));
        System.out.println();
    }

    public static void main(String[] args) {
        testar("Soma", 10, 5, "+", "15");
        testar("Subtração", 10, 5, "-", "5");
        testar("Multiplicação", 10, 5, "*", "50");
        testar("Divisão", 10, 4, "/", "2.5");
        testar("Divisão por zero", 10, 0, "/", "Erro: divisão por zero");
        testar("Operação inválida", 10, 5, "%", "Operação inválida");
        testar("Operação nula", 10, 5, null, "Operação inválida");

        System.out.println("Resumo: " + aprovados + " de " + total + " testes passaram.");
        if (aprovados != total) {
            System.exit(1);
        }
    }
}
