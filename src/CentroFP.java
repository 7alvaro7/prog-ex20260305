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


}