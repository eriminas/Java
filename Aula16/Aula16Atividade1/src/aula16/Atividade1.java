package aula16;
public class Atividade1 {
    public static void main(String[] args) {
        ContaBanco b1 = new ContaBanco();
        b1.setNumConta(0001);
        b1.setDono("José Erinaldo da Fonseca");
        b1.abrirConta("CC");
        b1.depositar(300);
        b1.estadoAtual();
        
        ContaBanco b2 = new ContaBanco();
        b2.setNumConta(0002);
        b2.setDono("Gilsa da Fonseca");
        b2.abrirConta("CP");
        b2.depositar(400);
        b2.estadoAtual();
    }    
}
