package service;
import java.math.BigDecimal;
import modelo.Desempenho;
import modelo.Funcionario;

class ReajusteService {        
    void concederReajuste(Funcionario func, Desempenho desempenho) {
        if (desempenho == Desempenho.A_DESEJAR){
            BigDecimal reajuste = func.getSalario().multiply(new BigDecimal("0.03"));
            func.reajustarSalario(reajuste);             
        }else if (desempenho == Desempenho.BOM) {
            BigDecimal reajuste = func.getSalario().multiply(new BigDecimal("0.15"));
            func.reajustarSalario(reajuste);             
        }else{
            BigDecimal reajuste = func.getSalario().multiply(new BigDecimal("0.20"));
            func.reajustarSalario(reajuste);         
        }
    }
}

