package school.sptech;

public class ExercicioMetodos {

    Boolean verificarMaioridade(Integer idade) {
        if (idade >= 18) {
            return true;
        }
        return false;
    }

    Double calcularMedia(Double valor1, Double valor2, Double valor3) {
        Double media = (valor1 + valor2 + valor3) / 3;
        return media;
    }

    Integer maiorNumero(Integer valor1, Integer valor2, Integer valor3) {
        Integer maiorNumero = valor1;
        if (maiorNumero < valor2) maiorNumero = valor2;
        if (maiorNumero < valor3) maiorNumero = valor3;
        return maiorNumero;
    }

    Integer calcularFatorial(Integer valor){
        if (valor.equals(0)) {
            return 1;
        }

        Integer fatorial = valor;
        for (int i = 1; i < valor; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

    Boolean verificarPrimo(Integer valor) {
        Boolean primo = false;

        if (valor <= 1) {
            return false;
        }
        Integer contador = 0;

        for (int i = 1; i <= valor; i++) {
            if (valor % i == 0) {
                contador++;
            }
        }

        if (!contador.equals(2)) return false;
        return true;
    }

    Integer calcularPotencia(Integer base, Integer expoente) {
        if (expoente.equals(0)) {
            return 1;
        }

        Integer potencia = base;
        for (int i = 1; i < expoente; i++) {
            potencia *= base;
        }

        return potencia;
    }

    Integer calcularTrocoEmBalas(Double valorCompra, Double valorRecebido) {

        if (valorRecebido < valorCompra) return 0;

        Double valorBala = 0.25;
        Double valorTroco = valorRecebido - valorCompra;

        if (valorTroco < valorBala) return 0;

        Integer contador = 1;
        while (valorTroco > valorBala) {
            valorTroco-=valorBala;
            contador++;
        }

        return contador;
    }

    Boolean verificarPalindromo(String palavra) {

        String palavraTratada = palavra.toLowerCase().replaceAll(" ", "");

        for (int i = 0; i < palavraTratada.length(); i++) {
            Character character = palavraTratada.charAt(i);
            if (!character.equals(palavraTratada.charAt(palavraTratada.length() - i - 1))) {
                return false;
            }
        }
        return true;
    }
}
