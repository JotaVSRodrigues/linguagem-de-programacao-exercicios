package school.sptech.ex5;

public class Pokemon {
    String nome;
    String tipo;
    Integer vida;
    Integer ataque;
    Integer experiencia;

    void receberAtaque(Integer danoRecebido) {
        if (danoRecebido == null || danoRecebido < 0) return;
        if (danoRecebido > vida) {
            vida = 0;
            return;
        }
        vida -= danoRecebido;
    }

    void recuperarVida(Integer vidaRecuperada) {
        if (vidaRecuperada == null || vidaRecuperada < 0) return;

        if (vidaRecuperada + vida > 100) {
            vida = 100;
            return;
        }
        vida += vidaRecuperada;
    }

    void ganharExperiencia(Integer experienciaRecebida) {
        if (experienciaRecebida == null || experienciaRecebida < 0) return;

        experiencia += experienciaRecebida;
    }

    Integer calcularNivel() {
        Integer nivel = experiencia / 100;
        return nivel;
    }

    Integer calcularPoderDeCombate() {
        return ataque + (10 * calcularNivel()) + vida;
    }

    void batalhar(Integer[] ataques, Integer[] curas) {
        for (int i = 0; i < ataques.length; i++) {
            receberAtaque(ataques[i]);
            if (vida.equals(0)) return;
            recuperarVida(curas[i]);

        }
    }
}
