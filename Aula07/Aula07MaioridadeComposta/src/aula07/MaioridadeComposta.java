package aula07;
import java.util.Scanner;
public class MaioridadeComposta {
    public static void main(String[] args) {
       int ano_atual, ano_nasc, idade;
       Scanner entrada = new Scanner(System.in);
       System.out.println("Digite o ano atual: ");
       ano_atual = entrada.nextInt();        
       System.out.println("Digite seu ano de nascimento");
       ano_nasc = entrada.nextInt();
       
       idade = ano_atual - ano_nasc;
       
       if(idade >= 18){
           System.out.println("Voce possui a maioridade");
           System.out.println("VOCE PODE VOTAR");
       }else{
           System.out.println("Voce não possui maioridade");
           System.out.println("VOCE NAO PODE VOTAR");               
       }}}


