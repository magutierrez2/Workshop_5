
import java.util.ArrayList;
import java.util.List;

public class Carpeta implements IsistemaArchivos {
    private String nombre;
    private List<IsistemaArchivos> elementos = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }
    public void agregarElemento(IsistemaArchivos elemento) {
        elementos.add(elemento);
    }
    public void mostrar() {
        System.out.println("Carpeta: " + nombre);

        for (IsistemaArchivos elemento : elementos) {
            elemento.mostrar();
        }
    }
}

