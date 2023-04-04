package aula16;
import java.util.Scanner;

public class Produtos {
    protected int codigo;
    protected int quantidade;
    protected double total;    

    public void calculo() {
        if (codigo == 1) {
            total = quantidade * 7.0;
        } else if (codigo == 2) {
            total = quantidade * 9.0;
        } else if (codigo == 3) {
            total = quantidade * 11.0;
        } else if (codigo == 4) {
            total = quantidade * 5.0;
        } else {
            total = quantidade * 4.0;
        }
        System.out.println("O valor total eh: " + total);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    
    

}
