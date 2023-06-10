import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class test {
	
	 private LojaGame lojaGame;
	 



	 @BeforeEach
	    public void setUp() {
	        lojaGame = new LojaGame();
	        lojaGame.addGame(new Games("Mortal Kombat", "Ação", null, null));
	        lojaGame.addGame(new Games("Super Mario", "Aventura", null, null));
	        lojaGame.addGame(new Games("God of War", "Ação", null, null));
	    }
	
	 @Test
	    public void testAddGame() {
	        lojaGame.addGame(new Games("Mortal Kombat", "Ação", null, null));
	        List<Games> jogos = lojaGame.getGames();
	        Assertions.assertEquals(1, jogos.size());

	        Games jogo = jogos.get(0);
	        Assertions.assertEquals("Mortal Kombat", jogo.getNome());
	        Assertions.assertEquals("Ação", jogo.getGenero());
	    }
	    @Test
	    public void testBuscarJogoPorNome() {
	        List<Games> jogosEncontrados = lojaGame.buscarJogoPorNome("Super Mario");
	        Assertions.assertEquals(1, jogosEncontrados.size());

	        Games jogoEncontrado = jogosEncontrados.get(0);
	        Assertions.assertEquals("Super Mario", jogoEncontrado.getNome());
	        Assertions.assertEquals("Aventura", jogoEncontrado.getGenero());
	    }
	    
	    @Test
	    public void testBuscarJogoPorGenero() {
	        List<Games> jogosPorGenero = lojaGame.buscarJogoPorGenero("Aventura");
	        Assertions.assertEquals(1, jogosPorGenero.size());

	        Games jogoEncontrado = jogosPorGenero.get(0);
	        Assertions.assertEquals("Super Mario", jogoEncontrado.getNome());
	    }
	    @Test
	    public void testRemoverJogo() {
	        boolean jogoRemovido = lojaGame.removerJogo("Super Mario");
	        Assertions.assertTrue(jogoRemovido);

	        List<Games> jogosEncontrados = lojaGame.buscarJogoPorNome("Super Mario");
	        Assertions.assertEquals(0, jogosEncontrados.size());
	    }
	    


}
