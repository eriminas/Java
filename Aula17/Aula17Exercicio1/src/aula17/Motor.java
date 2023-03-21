package aula17;
public class Motor implements ControleCarro {
    public boolean Ligado;
    public int gasolina;

    @Override
    public void Ligar() {
        boolean temGasolina = TemGasolina();
        if (temGasolina) //a mesma coisa que if(temGasolina == true)
        {
            this.Ligado = true;
            System.out.println("O motor foi ligado.");
        } else {
            System.out.println("Não temos gasolina para ligar o motor.");
        }
    }

    @Override
    public boolean TemGasolina() {
        if (this.gasolina > 0) {
            return true;
        } else {
            return false;
        }
    }
}
