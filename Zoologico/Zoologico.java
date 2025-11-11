public class Zoologico {
    public static void main(String[] args) {
        // Crear Perro y Gato
        Perro perro1 = new Perro("Rex", 3, 20.5, 0.6, 60, "Labrador");
        Gato gato1 = new Gato("mishi", 2, 5.0, 0.3, 65, 8);

        // Usar métodos de Perro
        perro1.comer();
        perro1.hacerSonido();
        perro1.amamantar();
        perro1.jugar();
        System.out.println("Raza del perro: " + perro1.getRaza());

        // Usar métodos de Gato
        gato1.comer();
        gato1.hacerSonido();
        gato1.amamantar();
        gato1.ronronear();
        System.out.println("Habilidad de caza del gato: " + gato1.getHabilidadCaza());

        //crear gecko
        Gecko gecko1 = new Gecko("Gecko", 1, 0.2, 0.1, "relieve",false, 21, true);
        //usar métodos de gecko
        gecko1.comer();
        gecko1.hacerSonido();
        gecko1.mudarPiel();
        gecko1.perderCola();

        //crear camaleon
        Camaleon camaleon1 = new Camaleon("Rango", 2, 0.3, 0.15, "liso", false, 30, true);
        //usar métodos de camaleon
        camaleon1.comer();
        camaleon1.hacerSonido();
        camaleon1.camuflarse();


    }
}
