import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArvoreTest {

    @Test
    public void deveDecorarAArvore() {
        ArvoreDeNatal arvore = new Enfeites(new Arvore());

        assertEquals(arvore.decorar(), "Arvore de natal com enfeites");
    }

    @Test
    public void deveDecorarAArvoreComDuasCoisas(){
        ArvoreDeNatal arvore = new Enfeites(new LuzesDeNatal(new Arvore()));

        assertEquals(arvore.decorar(), "Arvore de natal com luzes de natal com enfeites");

    }
}