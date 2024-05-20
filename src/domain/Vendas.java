package domain;

import java.time.LocalDate;
import java.util.List;

public class Vendas {
	
	private LocalDate mesVendas;
	private double valorVendas;
	
	public Vendas() {}

	public Vendas(LocalDate mesVendas, double valorVendas) {
		super();
		this.mesVendas = mesVendas;
		this.valorVendas = valorVendas;
	}

	  // Método para calcular 30% de cada valor de venda e somar
    public double calcularPercentualVendas(List<Vendas> vendas) {
        double total = 0.0;           
                double percentual = getValorVendas() * 0.30;
                total += percentual;
        System.out.print(total);
        return total;
        
    }
	
	
	public LocalDate getMesVendas() {
		return mesVendas;
	}

	public void setMesVendas(LocalDate mesVendas) {
		this.mesVendas = mesVendas;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	@Override
	public String toString() {
		return "Vendas [mesVendas=" + mesVendas + ", valorVendas=" + valorVendas + "]";
	}
	
	
}
