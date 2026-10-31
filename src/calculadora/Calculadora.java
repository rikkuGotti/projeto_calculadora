package calculadora;

public class Calculadora {

    public String calc(int a, int b, String op) {
        if (op == null) {
            return "Operação inválida";
        }
        if (op.equals("+")) {
            return String.valueOf(a + b);
        } else {
            if (op.equals("-")) {
                return String.valueOf(a - b);
            } else {
                if (op.equals("*")) {
                    return String.valueOf(a * b);
                } else {
                    if (op.equals("/")) {
                        if (b == 0) {
                            return "Erro: divisão por zero";
                        } else {
                            double r = (double) a / b;
                            return String.valueOf(r);
                        }
                    } else {
                        return "Operação inválida";
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println("10 + 5 = " + c.calc(10, 5, "+"));
        System.out.println("10 / 0 = " + c.calc(10, 0, "/"));
        System.out.println("10 % 5 = " + c.calc(10, 5, "%"));
    }
}
