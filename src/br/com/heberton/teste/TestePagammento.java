package br.com.heberton.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.heberton.dados.StaticBD;
import br.com.heberton.dominio.Pagamento;

public class TestePagammento {

	public static void main(String[] args) {

		List<Pagamento> pagamentos = StaticBD.getPagamentos();
		
		System.out.println("Lista de Pagamentos: ");
		
		pagamentos.forEach(System.out::println);
		
		System.out.println("\nPagamentos para hoje: ");
		
		double totalHoje = StaticBD.getPagamentos()
				.stream().filter(p -> p.getDataVencimento().equals(LocalDate.now()))
				.mapToDouble(Pagamento::getValor).sum();
		
		System.out.println("Total para hoje: "+totalHoje);
		
	}

}
