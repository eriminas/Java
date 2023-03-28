package aula21;
public class Atividade2 {
    public static void main(String[] args) {
        PessoaFisica fisica = new PessoaFisica();
        fisica.setNome("Joao");
        fisica.setCpf(12345678901L);

        PessoaJuridica juridica = new PessoaJuridica();
        juridica.setNome("SeTecnologia");
        juridica.setCnpj(1000100012345678L);

        Pessoa[] pessoas = new Pessoa[2];
        pessoas[0] = fisica;
        pessoas[1] = juridica;        

        for (int i = 0; i < pessoas.length; ++i) {//            
            System.out.println(pessoas[i].getNome());
        }
        
        
        
//        for (Pessoa pe : pessoas) {
//            System.out.println(pe.getNome());
//        }

            // Abaixo apresentamos um outra forma de instanciar os objetos:
//        PessoaFisica fisica = new PessoaFisica();
//        fisica.setNome("Cristiano");
//        fisica.setCpf(12345678901L);
//
//        PessoaJuridica juridica = new PessoaJuridica();
//        juridica.setNome("Rafael");
//        juridica.setCnpj(1000100012345678L);
//
//        Pessoa pessoa1 = fisica;
//        Pessoa pessoa2 = juridica;
//
//        System.out.println("Pessoa 1");
//        System.out.println(pessoa1.getNome());
//
//        System.out.println("Pessoa 2");
//        System.out.println(pessoa2.getNome());
        }
    }
