package aula22;
public class Funcionario {
    private String nome;
    private Integer horas;
    private Double valorPorHora;   

    public Funcionario(String name, Integer hours, Double valuePerHour) {
        this.nome = name;
        this.horas = hours;
        this.valorPorHora = valuePerHour;
    }   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getHoras() {
        return horas;
    }
    public void setHoras(Integer horas) {
        this.horas = horas;
    }
    public Double getValorPorHora() {
        return valorPorHora;
    }
    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
    public double pagamento() {
        return horas * valorPorHora;
    }
}
