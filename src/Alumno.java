public class Alumno {


    private int id;
    private String nombre;
    private String tituloFP;
    private int edad;


    public Alumno(int id, String nombre, String tituloFP, int edad) {

        //  Aqui se guarda los valores recibidos
        this.id = id;
        this.nombre = nombre;
        this.tituloFP = tituloFP;
        this.edad = edad;
    }

    /**
     * Devuelve el id del alumno
     */
    public int getId() {
        return id;
    }

    /**
     * Devuelve el nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el título de FP del alumno
     */
    public String getTituloFP() {
        return tituloFP;
    }

    /**
     * Devuelve la edad del alumno
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Devuelve la información del alumno en forma de texto
     */

    //Devuelvo toda la información indicando que es cada cosa
    public String toString() {
        return "ID: " + id +
                " Nombre: " + nombre +
                " Titulo: " + tituloFP +
                " Edad: " + edad;
    }

}