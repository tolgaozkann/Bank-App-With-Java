
package Classes;

/**
 *
 * @author ozkan
 */
public interface ITransactions {
    
    
    void deposit(double amount);
    
    void withdraw(double amount);
    
    public boolean sendMoney(int id, int amount);
    
    
    
}
