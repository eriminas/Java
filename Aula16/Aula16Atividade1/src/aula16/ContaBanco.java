package aula16;
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Metodos Personalizados
    public void estadoAtual() {
        System.out.println("-----------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());

    }

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);

        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Ops!! Tem dinheiro na conta");
        } else if (this.getSaldo() < 0) {
            System.out.println("Ops!! Tem dívida na conta");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!!");
        }
    }

    public void depositar(float v) {
        if (this.status == true) {
            this.setSaldo(this.getSaldo() + v);
        } else {
            System.out.println("Ops!! Impossível despositar");
        }

    }

    public void sacar(float v) {
        if (this.status == true) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível Sacar!!");
        }
    }

    public void pagarMensal() {
        float v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }

        if (this.getStatus() == true) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Impossível pagar");
        }
    }

    //Métodos Especiais
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }

}
