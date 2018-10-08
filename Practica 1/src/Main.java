public class Main {

    public static int CantidadEstudiante(Estudiante[] a){
        return a.length;
    }
    public static float EdadPromedio(Estudiante[] a){
        int totaledades = 0;
        for (int i = 0; i < a.length; i++){
            totaledades+=a[i].getEdad();

        }
        float prom = totaledades/a.length;
        return prom;
    }
    public static int EdadMax(Estudiante[] a){
        int edadmaxima = 0;
        for (int i = 0; i < a.length; i++){
            if (edadmaxima < a[i].getEdad())
                edadmaxima = a[i].getEdad();
        }
        return edadmaxima;

    }

    public static int EdadMinima(Estudiante[] a){

        int edadminima = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++){
            if (a[i].getEdad() < edadminima)
                edadminima = a[i].getEdad();
        }
        return edadminima;
    }



    public void ImprimirEstudiantes(Estudiante[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println("Estudiante: " + a[i].getNombre() + " Edad: " + a[i].getEdad() );
        }
    }

    public static void main(String[] Args){

        Estudiante[] estudiantes = {
                new Estudiante("Juan", 24),
                new Estudiante("Erica", 20),
                new Estudiante("Emilio", 23),
                new Estudiante("karina", 24),
                new Estudiante("Eduardo", 24),
                new Estudiante("Tomas", 25)
        };

    }

}
