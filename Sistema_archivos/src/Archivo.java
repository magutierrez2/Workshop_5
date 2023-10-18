class Archivo implements IsistemaArchivos {
    private String nombre;

    public Archivo(String nombre) {
        this.nombre = nombre;
    }
    public void mostrar () {
        System.out.println("Archivo: "+nombre);
    }
}
