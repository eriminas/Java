package aula18;
public class Triangulo implements FiguraGeometrica {
    private int base;
    private int altura;
    private int ladoA;
    private int ladoB;
    private int ladoC;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }
    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }
   
    public void getNomeFigura() {
        String nome;
        nome = "Triangulo";
        System.out.println("O nome da figura eh: " + nome);
    }  
    public void getArea() {
        int area = 0;
        area = (base * altura) / 2;  
        System.out.println("A area eh: " + area);
    }
    public void getPerimetro() {
        int perimetro = 0;
        perimetro = ladoA + ladoB + ladoC; 
        System.out.println("O perimetro eh: " + perimetro);
    }    
}
