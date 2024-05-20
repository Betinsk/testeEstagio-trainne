import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.Funcionario;
import domain.Gerente;
import domain.Secretario;
import domain.Vendedor;
import enuns.Funcao;


public class Main {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
	   
        Map<String, Double> vendasAna = new HashMap<>();
	        vendasAna.put("12/2021", 5200.0);
	        vendasAna.put("01/2022", 4000.0);
	        vendasAna.put("02/2022", 4200.0);
	        vendasAna.put("03/2022", 5850.0);
	        vendasAna.put("04/2022", 7000.0);

	        Map<String, Double> vendasJoao = new HashMap<>();
	        vendasJoao.put("12/2021", 3400.0);
	        vendasJoao.put("01/2022", 7700.0);
	        vendasJoao.put("02/2022", 5000.0);
	        vendasJoao.put("03/2022", 5900.0);
	        vendasJoao.put("04/2022", 6500.0);
	        
		
	        List<Funcionario> funcionarios = new ArrayList<>();
	        
	      funcionarios.add(new Secretario("Jorge Carvalho", 0,LocalDate.of(2018, 1, 1), Funcao.SECRETARIO));
	      funcionarios.add(new Secretario("Maria Souza", 0,  LocalDate.of(2015,1, 1), Funcao.SECRETARIO));
	      funcionarios.add(new Vendedor("Ana Silva", 0,LocalDate.of(2021,12, 1), Funcao.VENDEDOR, vendasAna));
	      funcionarios.add(new Vendedor("João Mendes", 0, LocalDate.of(2021,12, 1), Funcao.VENDEDOR, vendasJoao));
	       funcionarios.add(new Gerente("Juliana Alves", 0, LocalDate.of(2017,7, 1), Funcao.GERENTE));
	       funcionarios.add(new Gerente("Bento Albino", 0,LocalDate.of(2014,3, 1), Funcao.GERENTE)); 
	        
        
      // func.calcularPagamentoTotal(funcionarios);
       //System.out.println();
      // func.calcularPagamentoTotalSemBeneficio(funcionarios);

    //.out.println(func.calcularPagamento(funcionarios));
    //  func.calcularTotalBeneficiosNoMes(funcionarios);

	       func.maiorSalarioNoMes(funcionarios);
	
	}
	}


