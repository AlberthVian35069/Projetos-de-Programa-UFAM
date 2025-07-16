public class Memoria {
    String marca;
    String tipo;
    double tamanho;
    double velocidade;
    int numPentes;

    public Memoria() {
        this("Desconhecida", "Deconhecida", 0.0, 0.0, 0);
    }

    public Memoria(String marca, String tipo, double tamanho, double velocidade, int numPentes) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.velocidade = velocidade;
        this.numPentes = numPentes;
    }

    double getTamanhoTotal() {
        return tamanho * numPentes;
    }

    double getVelocidadeParalela() {
        return velocidade * numPentes;
    }

    String getDescricao() {
        return String.format(
            "Memoria: marca=%s, tipo=%s, tamanho=%.1fGB, velocidade=%.1fGHz, numPentes=%d, tamanhoTotal=%.1fGB, velocidadeParalela=%.1fGHz.",
            marca, tipo, tamanho, velocidade, numPentes, getTamanhoTotal(), getVelocidadeParalela()
        );
    }
}
