import java.util.LinkedList;
import java.util.List;

public class LojaGame {
    private List<Games> games = new LinkedList<>();

    public List<Games> getGames() {
		return games;
	}

	public void setGames(List<Games> games) {
		this.games = games;
	}

	public void addGame(Games jogo) {
        games.add(jogo);
    }

    public List<Games> buscarJogoPorNome(String nome) {
        List<Games> encontrados = new LinkedList<>();

        for (Games jogo : games) {
            if (jogo.getNome().equalsIgnoreCase(nome)) {
                encontrados.add(jogo);
            }
        }

        return encontrados;
    }

    public List<Games> buscarJogoPorGenero(String genero) {
        List<Games> encontrados = new LinkedList<>();

        for (Games jogo : games) {
            if (jogo.getGenero().equalsIgnoreCase(genero)) {
                encontrados.add(jogo);
            }
        }

        return encontrados;
    }

    public boolean removerJogo(String nome) {
        for (Games jogo : games) {
            if (jogo.getNome().equalsIgnoreCase(nome)) {
                games.remove(jogo);
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        LojaGame objtGames = new LojaGame();
        objtGames.addGame(new Games("Mortal Kombat", "Ação", null, null));
        objtGames.addGame(new Games("Super Mario", "Aventura", null, null));
        objtGames.addGame(new Games("God of War", "Ação", null, null));

        List<Games> jogosEncontrados = objtGames.buscarJogoPorNome("Super Mario");
        for (Games jogo : jogosEncontrados) {
            System.out.println("Nome: " + jogo.getNome());
            System.out.println("Gênero: " + jogo.getGenero());
        }

        List<Games> jogosPorGenero = objtGames.buscarJogoPorGenero("Aventura");
        for (Games jogo : jogosPorGenero) {
            System.out.println("Nome: " + jogo.getNome());
        }

        List<Games> jogosGodOfWar = objtGames.buscarJogoPorNome("God of War");
        for (Games jogo : jogosGodOfWar) {
            System.out.println("Nome: " + jogo.getNome());
            System.out.println("Gênero: " + jogo.getGenero());
        }

        boolean jogoRemovido = objtGames.removerJogo("Super Mario");
        if (jogoRemovido) {
            System.out.println("O jogo removido com sucesso.");
        } else {
            System.out.println("O jogo não foi encontrado.");
        }
        
        for (Games games : objtGames.games) {
			System.out.println(games.getNome());
		}
    }
}
	
	

