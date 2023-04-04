package aula18;
import java.util.Scanner;
public class Conta implements ControleConta{
    private int numero;
    private String proprietario;
    private double balanco;
    
    Scanner entrada = new Scanner(System.in);

    public Conta(int numero, String proprietario) {
        this.numero = numero;
        this.proprietario = proprietario;
    }    
    public Conta(int numero, String proprietario, double depositoInicial) {
        this.numero = numero;
        this.proprietario = proprietario;        
        this.depositar();
    }
    public int getNumber() {
        return numero;
    }
    public String getProprietario() {
        return proprietario;
    }
    public void setProprietario(String holder) {
        this.proprietario = holder;
    }
    public double getBalance() {
        return balanco;
    }  
    public void depositar() {        
        double deposito = entrada.nextDouble();         
        balanco = balanco + deposito;
        
    } 
    public void sacar() {
       double saque = entrada.nextDouble();       
       balanco = balanco - saque - 5.0;
    }   
    public String toString() {
        return "Conta "
                + numero
                + ", Proprietario: "
                + proprietario
                + ", Balanco: $ "
                + String.format("%.2f", balanco);
    }     
}
