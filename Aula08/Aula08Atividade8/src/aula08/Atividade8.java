package aula08;
import java.util.Scanner;
public class Atividade8 {
    public static void main(String[] args) {
        double massa, altura, imc;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua massa: ");
        massa = entrada.nextDouble();
        System.out.println("Digite sua altura: ");
        altura = entrada.nextDouble();
        imc = massa/(Math.pow(altura, 2));
        System.out.println("O seu imc eh: ");
        System.out.printf("%.2f%n", imc);
        if ((imc >= 16)&&(imc < 17)) {
            System.out.println("Magreza Moderada");            
        } else {
            if ((imc >= 17)&&(imc < 18.5)) {
                System.out.println("Magreza Leve");                
            } else {
                if ((imc >= 18.5)&&(imc < 25)) {
                    System.out.println("Saudável!Você está no peso ideal");                    
                } else {
                    if ((imc >= 25)&&(imc < 30)) {
                        System.out.println("Sobrepeso!");                        
                    } else {
                        if ((imc >= 30)&&(imc < 35)) {
                            System.out.println("Cuidado! Obesidade grau I");
                        } else {
                            if ((imc >= 35)&&(imc < 40)) {
                                System.out.println("Cuidado! Obesidade grau II");
                            } else {
                                System.out.println("Cuidado! Obesidade grau III");
                            }
                        }
                    }
                }
            }
        }   
    }    
}
