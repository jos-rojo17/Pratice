package Holamundo.demo.modelo;

public class SaludoResponse {
    private String nombre;
    private String mensaje;

    public SaludoResponse(String nombre, String mensaje) {
        this.nombre = nombre;
        this.mensaje = mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMensaje() {
        return mensaje;
    }
}
