public class Usuario{
    public String nombre;
    public int edad;
    public double peso;

    public Usuario(String nombre, int edad, double peso){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public int getEdad(){
        return edad;
    }
    public double getPeso(){
        return peso;
    }

    public String getNombre(){
        return nombre;
    }
}
