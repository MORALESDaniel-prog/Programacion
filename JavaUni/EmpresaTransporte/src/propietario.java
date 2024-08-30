public class propietario {
    public String nombre;
    public String cedula;
    public String email;
    public String edad;
    public String celular;

    public propietario (String nombre, String cedula, String email, String edad, String celular) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.edad = edad;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getEdad() {
        return edad;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
