public class Reptil extends Animal {
    //atributos
    private String tipoEscamas;
    private boolean esVenenoso;
    private int frecuenciaMuda; //en dias

    //constructor
    public Reptil(String nombre, int edad, double peso, double altura, String tipoEscamas, boolean esVenenoso, int frecuenciaMuda) {
        super(nombre, edad, peso, altura);
        this.tipoEscamas = tipoEscamas;
        this.esVenenoso = esVenenoso;
        this.frecuenciaMuda = frecuenciaMuda;
    }

    //métodos getters y setters
    public String getTipoEscamas() {
        return tipoEscamas;
    }

    public void setTipoEscamas(String tipoEscamas) {
        this.tipoEscamas = tipoEscamas;
    }

    public boolean isesVenenoso() {
        return esVenenoso;
    }

    public void setesVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }
    public int getFrecuenciaMuda() {
        return frecuenciaMuda;
    }
    public void setFrecuenciaMuda(int frecuenciaMuda) {
        this.frecuenciaMuda = frecuenciaMuda;
    }
    

    //métodos específicos de Reptil
    //método para que el reptil se desplace
    public void mudarPiel() {
        System.out.println(getNombre() + " está mudando su piel.");
    }

}
