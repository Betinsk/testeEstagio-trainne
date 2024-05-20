package domain;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import enuns.Funcao;

public class Secretario extends Funcionario{

	
    public Secretario(String nome, double salarioBase, LocalDate contratacao, Funcao status) {
		super(nome, 7000, contratacao, status);
	}
    
    @Override
    public double calcularSalarioMensal(int mes, int ano) {
        int anosDeServico = Period.between(getContratacao(), LocalDate.of(ano, mes, 1)).getYears();
        double beneficio = 1000 * anosDeServico;
        return getSalarioBase() + beneficio + (0.20 * getSalarioBase());
    }

    @Override
    public double calcularSalarioMensalSemBeneficio(int mes, int ano) {
        int anosDeServico = Period.between(getContratacao(), LocalDate.of(ano, mes, 1)).getYears();
        double beneficio = 1000 * anosDeServico;
        return getSalarioBase() + beneficio;
    }

    
    @Override
    public double calcularBeneficioMensal(int mes, int ano) {
        int anosDeServico = Period.between(getContratacao(), LocalDate.of(ano, mes, 1)).getYears();
        double salario = getSalarioBase() + 1000 * anosDeServico;
        double porcentagemSalario = 0.20 * salario;
        return porcentagemSalario;
    }

	@Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                ", contratacao=" + getContratacao().format(formatter) +
                ", status=" + getStatus() +
                '}';
    }
}
