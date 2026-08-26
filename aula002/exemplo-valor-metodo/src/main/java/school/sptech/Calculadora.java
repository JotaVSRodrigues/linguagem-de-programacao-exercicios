package school.sptech;

public class Calculadora {
    public Integer somarVetor(Integer[] vetor) {
        Integer sum = 0;
        for (Integer integer : vetor) {
            sum+=integer;
        }
        return sum;
    }

    public void calcularMedia(Integer[] vetor) {
        Double media = (double) somarVetor(vetor) / vetor.length;
        System.out.println("A média é: " + media);
    }
}
