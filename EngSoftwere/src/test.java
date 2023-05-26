import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void test() {
		LojaGame objtGames = new LojaGame();
		objtGames.addGame(new Games("Mortal Kombat", "Ação", null, null));
		
		assertEquals(2,objtGames.getGames().size());
	}

}
