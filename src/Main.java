public class Main {

    public static void main(String[] args) {
        CentroFP centro = new CentroFP();

        // Creo los alumnos
        Alumno a1 = new Alumno(1, "Carlos", "DAM", 20);
        Alumno a2 = new Alumno(2, "Lucia", "DAW", 21);
        Alumno a3 = new Alumno(3, "Miguel", "ASIR", 22);

        // Registro los alumnos
        centro.registrarAlumno(a1);
        centro.registrarAlumno(a2);
        centro.registrarAlumno(a3);

        System.out.println("Lista de alumnos:");
        centro.mostrarAlumnos();


        System.out.println("Total alumnos: " + centro.contarAlumnos());

        Alumno encontrado = centro.buscarAlumno(2);

        if (encontrado != null) {
            System.out.println("Alumno encontrado: " + encontrado);
        }

        Alumno noEncontrado = centro.buscarAlumno(10);

        if (noEncontrado == null) {
            System.out.println("Alumno no existente");
        }
    }
}