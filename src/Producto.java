import java.lang.String;

public class Producto {
    private int codigo;
    private char nombre;
    private char cantidad;

    private char descripcion ;



    public Producto(int codigo, String nombre, String cantidad, String descripcion) {
    }

    public char getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(char descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    public char getCantidad() {
        return cantidad;
    }

    public void setCantidad(char cantidad) {
        this.cantidad = cantidad;
    }

    public void setNombre(String nuevonombre) {
    }
}
