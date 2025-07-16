import java.util.ArrayList;

public class SessaoJedi {
    String nome;
    TreinadorJedi treinador;
    ArrayList<IniciadoJedi> iniciados;

    SessaoJedi(String nome, TreinadorJedi treinador) {
        this.nome = nome;
        this.treinador = treinador;
        this.iniciados = new ArrayList<>();
    }

    public void addIniciado(IniciadoJedi iniciado) {
        for (IniciadoJedi i : iniciados) {
            if (i.nome.equals(iniciado.nome)) {
                return; 
            }
        }
        iniciados.add(iniciado);
    }

    public IniciadoJedi getIniciado(String nome) {
        for (IniciadoJedi i : iniciados) {
            if (i.nome.equals(nome)) {
                return i;
            }
        }
        return null; 
    }

   public double getMediaAnoNascimento() {
        if (iniciados.isEmpty()) {
        	return 0.0;
        }else {
        double soma = 0.0;
        for (IniciadoJedi i : iniciados) {
            soma += i.anoNascimento;
        }
        return soma / iniciados.size();
        }
    }

    public String getDescricao() {
        StringBuilder str = new StringBuilder();
        str.append("--> SESSÃO ").append(nome)
          .append(" (Treinador: ").append(treinador.getDescricao()).append(")\n");

        int contador = 1;
        for (IniciadoJedi i : iniciados) {
            str.append(" - Iniciado ").append(contador++)
              .append(": ").append(i.getDescricao()).append("\n");
        }

        return str.toString();
    }
}
