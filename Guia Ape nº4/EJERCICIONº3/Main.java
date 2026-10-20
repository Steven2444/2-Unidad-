public class Main {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Firulais", "Perro", 3, 25.5);
        Mascota m2 = new Mascota("Michi", "Gato", 2, 4.2);
        Mascota m3 = new Mascota("Rocky", "Perro", 5, 18.0);

        Mascota[] lista = {m1, m2, m3};
        for (Mascota m : lista) {
            String aviso = m.peso > 20 ? " Revisar peso" : "";
            System.out.println(m.nombre + " : " + m.especie + " : " + m.peso + aviso);
        }

        Mascota m4 = m1;
        m4.edad += 1;
        System.out.println("Edad de m1: " + m1.edad);
        
}
