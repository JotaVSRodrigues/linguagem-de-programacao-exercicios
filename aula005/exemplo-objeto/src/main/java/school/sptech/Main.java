package school.sptech;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // uma nova instancia do Bilhete Unico
        BilheteUnico b01 = new BilheteUnico();
        b01.titular = "Joao";
        b01.codigo = "0001";
        b01.cor = "Branco";
        b01.isIdoso = false;
        b01.isEstudante = true;
        b01.isPCD = false;
        b01.saldo = 0.0;

        b01.recarregar(10.0);

        b01.passar();
        b01.printar();
    }
}