package school.sptech;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        Double numeroA = 10.0;
        Double numeroB = 5.0;

        System.out.println("Adicao: " + (numeroA + numeroB));
        System.out.println("Subtracao: " + (numeroA - numeroB));
        System.out.println("Divisao: " + (numeroA / numeroB));
        System.out.println("Multiplicacao: " + (numeroA * numeroB));
        System.out.println("Resto: " + (numeroA % numeroB));

        // NAO TEMOS ** PARA POTENCIACAO NO JAVA
        System.out.println("Potencicao: " + (Math.pow(numeroA, numeroB)));

        Integer n1 = 5;
        Integer n2 = 10;
        Double doubleVersion = Double.valueOf(n1) / n2;

        System.out.println("Double Version: " + doubleVersion);
        System.out.println("Resultado: " + (double) n1 / n2);
    }
}
