import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

public class testJuego {
    @Test
    public void testSuma(){

        Dado d = new Dado();
        Dado d1 = new Dado();
        Juego j = new Juego(d,d1);
        int n1 = d.lanzarDado();
        int n2 = d1.lanzarDado();

        int esperado = n1+n2;
        Assertions.assertEquals(esperado, j.sumaDados(n1,n2));

    }
    @Test
    public void testVic(){
        Juego j = new Juego(new Dado(),new Dado());
        int n = 7;
        String esperado = "GANASTE";
        Assertions.assertTrue(esperado.equals(j.resultado(n)));

    }
}
