public class ClaseHija_Retiro extends ClasePadre_Abstracta {

    public void Transacciones() {
        System.out.print("  Cuanto desea retirar? ");
        Retiro();

        if (retiro <= getSaldo()) {

            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("Retiraste: " + retiro);
            System.out.println("Tu saldo actual es: " + getSaldo());

        } else {
            System.out.println("Saldo insuficiente");
        }

    }

}
