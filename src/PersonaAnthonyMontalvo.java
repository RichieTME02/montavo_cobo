import java.util.Objects;
import java.util.Objects;

public class PersonaAnthonyMontalvo {
    private String cedula;
    private String nombre;
    private int edad;
    private String genero;
    private String region;

    // Constructor por defecto
    public PersonaAnthonyMontalvo() {
        this.cedula = "1750107425";
        this.nombre = "Anthony Montalvo";
        this.edad = 19;
        this.genero = "MASCULINO";
        this.region = "Sierra";
    }

    // Constructor con parámetros
    public PersonaAnthonyMontalvo(String cedula, String nombre, int edad, String genero, String region) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.region = region;
    }


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonaAnthonyMontalvo that = (PersonaAnthonyMontalvo) o;
        return Objects.equals(cedula, that.cedula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cedula);
    }

    @Override
    public String toString() {
        return "Cédula: " + cedula + ", Nombre: " + nombre + ", Edad: " + edad + ", Género: " + genero + ", Región: " + region;
    }

}
