package domain;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;

import enuns.Funcao;

public class Vendedor extends Funcionario {

    private Map<String, Double> vendas;

    public Vendedor(String nome, double salarioBase, LocalDate contratacao, Funcao status,  Map<String, Double> vendas) {
 		super(nome, 12000, contratacao, status);
 		this.vendas = vendas;
 	}

    @Override
    public double calcularSalarioMensal(int mes, int ano) {
        int anosDeServico = Period.between(getContratacao(), LocalDate.of(ano, mes, 1)).getYears();
        double beneficio = 1800 * anosDeServico;
        double totalVendas = vendas.getOrDefault(String.format("%02d/%d", mes, ano), 0.0);
        return getSalarioBase() + beneficio + (0.30 * totalVendas);
    }
    
    @Override
    public double calcularSalarioMensalSemBeneficio(int mes, int ano) {
        int anosDeServico = Period.between(getContratacao(), LocalDate.of(ano, mes, 1)).getYears();
        double beneficio = 1800 * anosDeServico;
        return getSalarioBase() + beneficio;
    }
    
    @Override
    public double calcularBeneficioMensal(int mes, int ano) {
        double totalVendas = vendas.getOrDefault(String.format("%02d/%d", mes, ano), 0.0);
        return 0.30 * totalVendas;
    }
}

	

