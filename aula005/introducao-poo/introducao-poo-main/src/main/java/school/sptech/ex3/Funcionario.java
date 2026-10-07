package school.sptech.ex3;

public class Funcionario {
    String nome;
    String cargo;
    Double salario;

    void reajustarSalario(Integer percentual) {
        Double porcentagem = Double.valueOf(percentual) / 100;
        Double valorAcrescimo = salario * porcentagem;
        salario = salario + valorAcrescimo;
    }

    Double calcularValorHora() {
    // tem que retornar o valor da hora
        Double valorHora = salario / 220;
        return valorHora;
    }

    Double calcularHoraExtra(Integer horasExtras, Integer percentualNoturna) {

        Double valorHora = calcularValorHora();
        Double valorHorasExtras = valorHora + (valorHora * (Double.valueOf(percentualNoturna)) / 100);
        return valorHorasExtras * horasExtras;
    }

    Double calcularBonificacaoAnual() {
        Double porcentagemBonificacao = 0.0;

        if (salario <= 2500.0) {
            porcentagemBonificacao = 0.15;
        } else if (salario <= 6000.0) {
            porcentagemBonificacao = 0.10;
        } else {
            porcentagemBonificacao = 0.05;
        }

        return salario * porcentagemBonificacao;
    }
}
