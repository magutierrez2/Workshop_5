public class Main {
    public static void main(String[] args) {
        //creacion de los archivos
        IsistemaArchivos foto =new Archivo("foto.JPG");
        IsistemaArchivos fondoPantalla =new Archivo("fondoPantalla.JPG");
        IsistemaArchivos cancion =new Archivo("cancion.MP3");

        //creacion de carpetas
        IsistemaArchivos carpetaImagenes = new Carpeta("carpetaImagenes");
        IsistemaArchivos carpetaCanciones = new Carpeta("carpetaCanciones");

        //agregar archivos a las carpetas
        ((Carpeta) carpetaImagenes).agregarElemento(foto);
        ((Carpeta) carpetaImagenes).agregarElemento(fondoPantalla);
        ((Carpeta) carpetaCanciones).agregarElemento(cancion );

        //agregamos una carpeta dentro de otra carpeta

        IsistemaArchivos carpetaPersonal = new Carpeta("CarpetaPersonal");
        ((Carpeta) carpetaPersonal).agregarElemento(carpetaImagenes);
        ((Carpeta) carpetaPersonal).agregarElemento(carpetaCanciones);


        IsistemaArchivos todasLasCarpetas = new Carpeta("todasLasCarpetas");
        ((Carpeta)todasLasCarpetas).agregarElemento(carpetaPersonal);

        carpetaImagenes.mostrar();
        todasLasCarpetas.mostrar();
        foto.mostrar();

    }
}