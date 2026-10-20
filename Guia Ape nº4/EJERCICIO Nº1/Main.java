public class Main {
    public static void main(String[] args) {
        Estudiante[] est = {
            new Estudiante("Ana", 8, 7, 9),
            new Estudiante("Luis", 6, 5, 7),
            new Estudiante("Maria", 4, 3, 5),
            new Estudiante("Pedro", 10, 9, 8),
            new Estudiante("Sofia", 5, 6, 6)
        };
        int aprobados = 0;
        for (Estudiante e : est) {
            String estado;
            if (e.promedio >= 7) {
                estado = "Aprobado";
                aprobados++;
            } else if (e.promedio >= 5) {
                estado = "Supletorio";
            } else {
                estado = "Reprobado";
            }
            System.out.printf("%s : %.2f %s%n", e.nombre, e.promedio, estado);
        }
        System.out.println("Estudiantes aprobados: " + aprobados);
    }
}
