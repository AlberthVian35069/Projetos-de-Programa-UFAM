public class IniciadoJedi {
    String nome;
    String especie;
    int anoNascimento;
    
    IniciadoJedi() {
        this("", "", 0);
    }

    IniciadoJedi(String nome, String especie, int anoNascimento) {
        this.nome = nome;
        this.especie = especie;
        this.anoNascimento = anoNascimento;
    }

    String getDescricao() {
        return String.format("%s (especie=%s, nascimento=%s)", nome, especie, getAnoNascimento());
    }

    String getAnoNascimento() {
        if (anoNascimento < 0) {
            return String.format("%d ABY", -anoNascimento);
        } else {
            return String.format("%d DBY", anoNascimento);
        }
    }
}

