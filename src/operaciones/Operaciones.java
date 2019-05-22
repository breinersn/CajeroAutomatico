package operaciones;

import java.util.Scanner;

/**
 *
 * @author ubuntu
 */
public abstract class Operaciones {

    protected int transacciones, retiro, deposito;
    private static int saldo;

    Scanner entrada = new Scanner(System.in);

    public void Operaciones() {

        int bandera = 0;
        int seleccion = 0;

        do {
            System.out.println("");
            System.out.println("Seleccione una Operacion");
            System.out.println("    1. Consulta de saldo");
            System.out.println("    2. Retiro de saldo");
            System.out.println("    3. Deposito de saldo");
            System.out.println("    4. Salir");

            seleccion = entrada.nextInt();

            if (seleccion >= 1 && seleccion <= 4) {

                switch (seleccion) {
                    case 1:
                        Transacciones();
                        break;

                    case 2:
                        Operaciones mensajero = new ClaseRetiro();
                        mensajero.Transacciones();
                        break;

                    case 3:
                        Operaciones mensajero2 = new ClaseDeposito();
                        mensajero2.Transacciones();
                        break;

                    case 4:
                        System.out.println("----------------------");
                        System.out.println("Gracias vuelva pronto.");
                        System.out.println("----------------------");
                        bandera = 1;
                        break;

                }

            } else {
                System.out.println("------------------");
                System.out.println("Opcion incorrecta.");
                System.out.println("------------------");
            }

        } while (bandera == 0);
    }

    public void Retiro() {
        retiro = entrada.nextInt();
    }

    public void Deposito() {
        deposito = entrada.nextInt();
    }

    public abstract void Transacciones();

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        Operaciones.saldo = saldo;
    }

}
