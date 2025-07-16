
import java.awt.Point;
import java.util.*;

public class SnakeJogador {
    private Snake jogo;
    private static final int GRID_WIDTH = 30;
    private static final int GRID_HEIGHT = 20;

    private static final char[][] preferredDirections = {
  {'D','C','C','C','C','C','C','C','C','C','C','C','C','C','C','C','C','C','C','C','C','C','C','C','C','C','C','C','C','C'},
  {'B','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E'},
  {'B','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E'},
  {'B','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E'},
  {'B','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E'},
  {'B','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E'},
  {'B','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E'},
  {'B','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E'},
  {'B','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E'},
  {'B','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E'},
  {'B','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E'},
  {'B','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E'},
  {'B','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E'},
  {'B','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E'},
  {'B','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E'},
  {'B','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E'},
  {'B','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E'},
  {'B','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E'},
  {'B','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E'},
  {'B','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E','E'}
};

    private Point comidaAnterior = null;
    private int ticksSemComer = 0;
    private static final int LIMITE_LOOP = 100;

    public SnakeJogador(Snake jogo) {
        this.jogo = jogo;
    }

    public char getDirecao() {
        LinkedList<Point> corpo = new LinkedList<>(jogo.getSegmentos());
        Point cabeca = corpo.getFirst();
        Point cauda = corpo.getLast();
        Point comida = jogo.getComida();

        if (comidaAnterior != null && comidaAnterior.equals(comida)) {
            ticksSemComer++;
        } else {
            ticksSemComer = 0;
        }
        comidaAnterior = comida;

        char[] prioridades = getPrioridadeParaComida(cabeca, comida);

        for (char direcao : prioridades) {
            Point destino = getNextPoint(cabeca, direcao);
            if (!isSafe(destino)) continue;

            LinkedList<Point> simulado = new LinkedList<>(corpo);
            simulado.addFirst(destino);
            simulado.removeLast();

            if (bfs(destino, simulado, cauda)) {
                return direcao;
            }
        }

        char seta = preferredDirections[cabeca.y][cabeca.x];
        Point destinoSeta = getNextPoint(cabeca, seta);
        if (isSafe(destinoSeta)) {
            LinkedList<Point> simulado = new LinkedList<>(corpo);
            simulado.addFirst(destinoSeta);
            simulado.removeLast();
            if (bfs(destinoSeta, simulado, simulado.getLast())) {
                return seta;
            }
        }

        // Modo fuga: procurar direção com mais espaço
        if (ticksSemComer >= LIMITE_LOOP) {
            char melhor = 'N';
            int maxLivres = -1;
            for (char dir : new char[]{'C','D','B','E'}) {
                Point destino = getNextPoint(cabeca, dir);
                if (!isSafe(destino)) continue;
                int livres = contarLivres(destino, corpo);
                if (livres > maxLivres) {
                    maxLivres = livres;
                    melhor = dir;
                }
            }
            if (melhor != 'N') return melhor;
        }

        for (char d : new char[]{'C','D','B','E'}) {
            Point p = getNextPoint(cabeca, d);
            if (isSafe(p)) return d;
        }

        return 'N';
    }

    private int contarLivres(Point p, List<Point> corpo) {
        int livres = 0;
        for (char dir : new char[]{'C','D','B','E'}) {
            Point viz = getNextPoint(p, dir);
            if (isDentro(viz) && jogo.isCelulaLivre(viz.x, viz.y) && !corpo.contains(viz)) {
                livres++;
            }
        }
        return livres;
    }

    private char[] getPrioridadeParaComida(Point c, Point f) {
        int dx = f.x - c.x;
        int dy = f.y - c.y;
        ArrayList<Character> list = new ArrayList<>();
        if (dx > 0) list.add('D'); else if (dx < 0) list.add('E');
        if (dy > 0) list.add('B'); else if (dy < 0) list.add('C');
        for (char d : new char[]{'C','D','B','E'})
            if (!list.contains(d)) list.add(d);
        char[] out = new char[4];
        for (int i = 0; i < 4; i++) out[i] = list.get(i);
        return out;
    }

    private Point getNextPoint(Point atual, char direcao) {
        switch (direcao) {
            case 'C': return new Point(atual.x, atual.y - 1);
            case 'B': return new Point(atual.x, atual.y + 1);
            case 'D': return new Point(atual.x + 1, atual.y);
            case 'E': return new Point(atual.x - 1, atual.y);
            default: return atual;
        }
    }

    private boolean isSafe(Point p) {
        return p.x >= 0 && p.x < GRID_WIDTH &&
               p.y >= 0 && p.y < GRID_HEIGHT &&
               jogo.isCelulaLivre(p.x, p.y);
    }

    private boolean bfs(Point inicio, LinkedList<Point> corpo, Point alvo) {
        Queue<Point> fila = new LinkedList<>();
        Set<Point> visitados = new HashSet<>();
        fila.add(inicio);
        visitados.add(inicio);

        Set<Point> bloqueios = new HashSet<>(corpo);
        bloqueios.remove(alvo);

        while (!fila.isEmpty()) {
            Point atual = fila.poll();
            if (atual.equals(alvo)) return true;

            for (char dir : new char[]{'C','D','B','E'}) {
                Point vizinho = getNextPoint(atual, dir);
                if (!isDentro(vizinho) || bloqueios.contains(vizinho) || visitados.contains(vizinho)) continue;
                fila.add(vizinho);
                visitados.add(vizinho);
            }
        }
        return false;
    }

    private boolean isDentro(Point p) {
        return p.x >= 0 && p.x < GRID_WIDTH && p.y >= 0 && p.y < GRID_HEIGHT;
    }
}
