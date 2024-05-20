package domain;

import java.time.LocalDate;
import java.util.List;

import enuns.Funcao;

public class Funcionario {

	private String nome;
	private double salarioBase;
	private LocalDate contratacao;
	private Funcao status;
	
	public Funcionario() {
	}
	
	public Funcionario(String nome, double salarioBase,  LocalDate contratacao, Funcao status) {
		super();
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.contratacao = contratacao;
		this.status = status;
	}
	
	//Um método que receba uma lista de funcionários, mês e ano e retorne o valor total
	//pago (salário e benefício) a esses funcionários no mês.
	public static void calcularPagamentoTotal(List<Funcionario> funcionarios) {
		 LocalDate hoje = LocalDate.now();

	        for (Funcionario funcionario : funcionarios) {
	            LocalDate dataInicio = funcionario.getContratacao();
	            LocalDate dataAtual = dataInicio;

	            System.out.println("Pagamentos para " + funcionario.getNome() + ":");

	            while (!dataAtual.isAfter(hoje)) {
	                double salarioMensal = funcionario.calcularSalarioMensal(dataAtual.getMonthValue(), dataAtual.getYear());
	                System.out.printf("Mês/Ano: %02d/%d - Salário: R$ %.2f%n", dataAtual.getMonthValue(), dataAtual.getYear(), salarioMensal);
	                dataAtual = dataAtual.plusMonths(1);
	            }

	            System.out.println();
	        }
    }
	
	
	public static void calcularPagamentoTotalSemBeneficio(List<Funcionario> funcionarios) {
		 LocalDate hoje = LocalDate.now();

	        for (Funcionario funcionario : funcionarios) {
	            LocalDate dataInicio = funcionario.getContratacao();
	            LocalDate dataAtual = dataInicio;

	            System.out.println("Pagamentos para " + funcionario.getNome() + ":");

	            while (!dataAtual.isAfter(hoje)) {
	                double salarioMensal = funcionario.calcularSalarioMensalSemBeneficio(dataAtual.getMonthValue(), dataAtual.getYear());
	                System.out.printf("Mês/Ano: %02d/%d - Salário: R$ %.2f%n", dataAtual.getMonthValue(), dataAtual.getYear(), salarioMensal);
	                dataAtual = dataAtual.plusMonths(1);
	            }

	            System.out.println();
	        }
   }
	
			//● Um método que receba uma lista somente com os funcionários que recebem
			//benefícios, mês e ano e retorne o total pago em benefícios no mês.
			  public void calcularTotalBeneficiosNoMes(List<Funcionario> funcionarios) {
			        	double totalBeneficios = 0;
					 LocalDate hoje = LocalDate.now();
		
			        for (Funcionario funcionario : funcionarios) {
			            LocalDate dataContratacao = funcionario.getContratacao();
			            LocalDate dataAtual = dataContratacao;
		
			            int mes = dataContratacao.getMonthValue();
			            int ano = dataContratacao.getYear();
			            
			            while (!dataAtual.isAfter(hoje)) {
			                double salarioMensal = funcionario.calcularBeneficioMensal(dataAtual.getMonthValue(), dataAtual.getYear());
			                System.out.printf("Mês/Ano: %02d/%d - Beneficio pago para: "+ funcionario.getNome() +
			               " R$ %.2f%n", dataAtual.getMonthValue(), dataAtual.getYear(), salarioMensal);
			                
			                dataAtual = dataAtual.plusMonths(1);
			
			            }
			            totalBeneficios += funcionario.calcularBeneficioMensal(mes, ano);
			        }
		
			    }
			  
			  
			  public static void maiorSalarioNoMes(List<Funcionario> funcionarios) {
				  
					 LocalDate hoje = LocalDate.now();
				  
			        Funcionario funcionarioComMaiorSalario = null;
			        double maiorSalario = 0; // Define um valor mínimo inicial

			        for (Funcionario funcionario : funcionarios) {
			        	 LocalDate dataContratacao = funcionario.getContratacao();
				          LocalDate dataAtual = dataContratacao;
			
				            int mes = dataContratacao.getMonthValue();
				            int ano = dataContratacao.getYear();
				            
				            System.out.println("Pagamentos para " + funcionario.getNome() + ":");

				            
				            while (!dataAtual.isAfter(hoje)) {
				                double salarioMensal = funcionario.calcularSalarioMensal(dataAtual.getMonthValue(), dataAtual.getYear());
				               
				                System.out.println(salarioMensal);
				                
				                if(salarioMensal > maiorSalario) {
				                	maiorSalario = salarioMensal;
				                	System.out.println("MAIOR SALARIO "+ maiorSalario);
				                }
				                
				                System.out.printf("Mês/Ano: %02d/%d - Salário: R$ %.2f%n", dataAtual.getMonthValue(), dataAtual.getYear(), salarioMensal);

				                dataAtual = dataAtual.plusMonths(1);

				            	
				            }
				            }
			           

			    }
			  
	
		
		//Um método que receba uma lista de funcionários, mês e ano e retorne o valor total
		//pago (salário e benefício) a esses funcionários no mês.
		 public  double calcularSalarioMensal(int mes, int ano) {
			return 0;
		}
		 
		 //Um método que receba uma lista de funcionários, mês e ano e retorne o total pago
		// somente em salários no mês.
		 public double calcularSalarioMensalSemBeneficio(int mes, int ano) {
				return 0;
			}
		 
			//● Um método que receba uma lista somente com os funcionários que recebem
			//benefícios, mês e ano e retorne o total pago em benefícios no mês.
		    public double calcularBeneficioMensal(int mes, int ano) {
				return 0;
			}
	
		public String getNome() {
			return nome;
		}
	
		public void setNome(String nome) {
			this.nome = nome;
		}
	
		public Funcao getStatus() {
			return status;
		}
	
		public void setStatus(Funcao status) {
			this.status = status;
		}
	
		public LocalDate getContratacao() {
			return contratacao;
		}
	
		public void setContratacao(LocalDate contratacao) {
			this.contratacao = contratacao;
		}
		
		public double getSalarioBase() {
			return salarioBase;
		}
	
		public void setSalarioBase(double salarioBase) {
			this.salarioBase = salarioBase;
		}

}
