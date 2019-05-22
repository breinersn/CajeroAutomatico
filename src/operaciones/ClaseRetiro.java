
package operaciones;

/**
 *
 * @author ubuntu
 */
public class ClaseRetiro extends Operaciones {
    
    @Override
    public void Transacciones(){
        System.out.println("Cuento dinero desea retirar: ");
        Retiro();
        
        if (retiro <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("-------------------------------");
            System.out.println("Usted retiro: "+ retiro);
            System.out.println("Su saldo actual es: "+getSaldo());
            System.out.println("-------------------------------");
            
        } else {
            System.out.println("-------------------------");
            System.out.println("Su saldo es insuficiente.");
            System.out.println("-------------------------");
        }
    }
}
