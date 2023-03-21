package aula17;
public class Exercicio2 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.cadastrar();                
        p1.end = new Endereco();
        p1.end.rua = "Avenida Paulista";
        p1.end.numero = 14;
        p1.end.bairro = "Bela Vista";
        p1.end.cidade = "Sao Paulo";
        p1.end.estado = "SP";        
        p1.apresentar();
    }
}






