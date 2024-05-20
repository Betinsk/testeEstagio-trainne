package domain;

import java.time.LocalDate;
import java.time.Period;
import enuns.Funcao;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salarioBase, LocalDate contratacao, Funcao status) {
		super(nome, 20000, contratacao, status);
	}

    @Override
    public double calcularSalarioMensal(int mes, int ano) {
        int anosDeServico = Period.between(getContratacao(), LocalDate.of(ano, mes, 1)).getYears();
        double beneficio = 3000 * anosDeServico;
        return getSalarioBase() + beneficio;
    }
	
    @Override
    public double calcularSalarioMensalSemBeneficio(int mes, int ano) {
        int anosDeServico = Period.between(getContratacao(), LocalDate.of(ano, mes, 1)).getYears();
        double beneficio = 3000 * anosDeServico;
        return getSalarioBase() + beneficio;
    }

    @Override
    public double calcularBeneficioMensal(int mes, int ano) {
        return 0; // Gerentes não têm benefícios
    }
    
}
