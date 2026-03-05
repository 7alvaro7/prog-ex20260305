public class CentroFP {


    private Alumno[] alumnos;
    private final int MAX_ALUMNOS = 20;


    public CentroFP() {
        alumnos = new Alumno[MAX_ALUMNOS];
    }


    /**
     * Busca un alumno dentro del array usando el id
     *
     * @param id identificador para buscar al alumno
     * @return devuelve al alumno si lo encuentra o null si no lo encuentra
     */

    public Alumno buscarAlumno(int id) {

        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].getId() == id) {

                return alumnos[i]; // devolvemos el alumno
            }
        }

        return null;
    }



        /**
         * Buscamos la primera posicion libre
         *
         * @return Donde esta la primera posicion libre o -1 si esta ocupado
         */

        private int buscarPrimerHuecoLibre() {
            for (int i = 0; i < alumnos.length; i++) {

                if (alumnos[i] == null) {
                    return i;
                }
            }

            return -1;
        }
    /**
     * Añadimos alumnos en el centro
     *
     * @param alumno , Alumno que se quiere registrar
     * @return true si se pudo registrar, false si no se pudo
     */

    public boolean registrarAlumno(Alumno alumno) {
        if (buscarAlumno(alumno.getId()) != null) {
            return false;
        }

        int posicion = buscarPrimerHuecoLibre();
        if (posicion == -1) {
            return false;// si no hay hueco en el array
        }

        alumnos[posicion] = alumno; // guardo el alumno

        return true;
    }
    /**
     * Mostramos todos los alumnos registrados recorriendo el array y solo mostrando los que no son igual a null , es decir los que estan registrados
     */
    public void mostrarAlumnos() {
        for (int i = 0; i < alumnos.length; i++) {

            if (alumnos[i] != null) { //solo muestro si hay alumno es decir si es distinto de null
                System.out.println(alumnos[i]);
            }
        }
    }

}