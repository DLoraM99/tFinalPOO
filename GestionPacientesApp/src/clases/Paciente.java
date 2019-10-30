package clases;

public class Paciente extends Persona{
    private Float peso;
    private Float talla;
    private String condicion;
    private String estado;
    private String nombDoctor;

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getTalla() {
        return talla;
    }

    public void setTalla(Float talla) {
        this.talla = talla;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombDoctor() {
        return nombDoctor;
    }

    public void setNombDoctor(String nombDoctor) {
        this.nombDoctor = nombDoctor;
    }
}
