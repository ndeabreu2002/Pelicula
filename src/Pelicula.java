//Nelson De Abreu

public class Pelicula {
    private String nombre;
    private String director;
    private String genero;
    private int duracion; // En minutos
    private int año;
    private double calificacion;

    public Pelicula(String nombre, String director, String genero, int duracion, int año, double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.año = año;
        this.calificacion = calificacion;
    }

    public void imprimirResultados() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Director: " + director);
        System.out.println("Género: " + genero);
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Año: " + año);
        System.out.println("Calificación: " + calificacion);
    }

    public double obtenerCalificacion() {
        return calificacion;
    }

    public boolean esPeliculaEpica() {
        return duracion > 180;
    }

    public String calcularValoracionSegunAlgoritmo() {
        if (calificacion >= 0 && calificacion < 2) {
            return "Muy Mala";
        } else if (calificacion >= 2 && calificacion <= 5) {
            return "Mala";
        } else if (calificacion > 5 && calificacion <= 7) {
            return "Regular";
        } else if (calificacion > 7 && calificacion <= 8) {
            return "Buena";
        } else if (calificacion > 8 && calificacion <= 10) {
            return "Excelente";
        } else {
            return "Calificación no válida";
        }
    }

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Película1", "Director1", "Acción", 200, 2020, 7.5);
        Pelicula miPelicula1= new Pelicula("Película2", "Director2", "Terror", 160, 1976, 4.8);
        
        
        miPelicula.imprimirResultados();
        System.out.println("¿Es una película épica? " + miPelicula.esPeliculaEpica());
        System.out.println("Valoración: " + miPelicula.calcularValoracionSegunAlgoritmo());

        miPelicula1.imprimirResultados();
        System.out.println("¿Es una película épica? " + miPelicula1.esPeliculaEpica());
        System.out.println("Valoración: " + miPelicula1.calcularValoracionSegunAlgoritmo());



    }
    
}