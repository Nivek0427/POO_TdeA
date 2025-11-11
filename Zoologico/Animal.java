public class Animal{

    //atributos
    private String nombre;
    private int edad;
    private double peso;
    private double altura;

    //constructor
    public Animal(String nombre, int edad, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }
    
    //métodos getters y setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    //metodos 
    //método para comer
    public void comer(){
        System.out.println(nombre + " está comiendo.");
    }
    //metodo para que el animal haga un sonido
    public void hacerSonido(){
        System.out.println(nombre + " está haciendo un sonido.");
    }   



}