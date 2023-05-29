public class Principal {
    public static void main(String[] args) {
        Dado d1 = new Dado();
        Dado d2 = new Dado();
        Juego j = new Juego(d1,d2);
        int resultadoSuma = inicioJuego(j);
        resuladoFinal(resultadoSuma,j);
    }

    private static void resuladoFinal(int resultadoSuma, Juego j) {
        System.out.println(j.resultado(resultadoSuma));
    }

    private static int inicioJuego(Juego j) {
        int dado1 = j.getD1().lanzarDado();
        int dado2 = j.getD2().lanzarDado();
        System.out.println("Dado 1: "+dado1);
        System.out.println("Dado 2: "+dado2);

        int suma = j.sumaDados(dado1,dado2);
        return suma;

    }
}
