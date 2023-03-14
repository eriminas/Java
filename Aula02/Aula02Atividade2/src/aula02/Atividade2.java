package aula02;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Atividade2 {
    public static void main(String[] args) {
       Toolkit tk = Toolkit.getDefaultToolkit();
       Dimension d = tk.getScreenSize();
       System.out.println("A resolucao da sua maquina eh: " +d.width + " x " +d.height);
    }    
}
