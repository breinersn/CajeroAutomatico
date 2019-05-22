
package operaciones;

/**
 *
 * @author ubuntu
 */
public class ClaseDeposito extends Operaciones {
    
    @Override
    public void Transacciones(){
        System.out.print("Cuanto dinero desea Depositar: ");
        Deposito();
        
        transacciones = getSaldo();
        
        setSaldo(transacciones + deposito);
        
        System.out.println("-----------------------------------");
        System.out.println("Depositaste "+ deposito);
        System.out.println("Tu saldo actual es de "+ getSaldo());
        System.out.println("-----------------------------------");
    }
    
}
