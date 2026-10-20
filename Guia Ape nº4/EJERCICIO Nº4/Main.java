public class Main {
    public static void main(String[] args) {
        Cuenta[] cuentas = {
            new Cuenta("Carlos", 200),
            new Cuenta("Elena", 350)
        };
        for (Cuenta c : cuentas) {
            int meses = 0;
            while (c.saldo < 500) {
                c.saldo += 50;
                meses++;
                System.out.println("Mes " + meses + " - " + c.titular + " : " + c.saldo);
            }
            System.out.println(c.titular + " necesitó " + meses + " meses.");
        }
    }
}
