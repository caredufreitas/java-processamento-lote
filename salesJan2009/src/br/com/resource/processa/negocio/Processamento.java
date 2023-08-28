package br.com.resource.processa.negocio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import br.com.resource.salesJan2009.modelos.Venda;

public class Processamento {
	public static void processaArquivo() throws FileNotFoundException {
		File arquivo = new File("SalesJan2009.csv");
		Scanner sc = new Scanner(arquivo);
		List<Venda> vendas = new ArrayList<Venda>();

		sc.hasNextLine();
		while (sc.hasNextLine()) {
			String[] arrLinha = sc.nextLine().split(",");
			// price coluna 2 - product coluna - 1 - paymentType - coluna - 3
			Venda vds = new Venda(arrLinha[2], arrLinha[1], arrLinha[3]);
			vendas.add(vds);
		}
		carregaMetodos(vendas);
	}

	public static void carregaMetodos(List<Venda> vendas) {
		totalDeVendas(vendas);
		vendasProduct1(vendas);
		qtdVendasVisa(vendas);
		tiposPagamentoProduct2(vendas);
	}

	public static void totalDeVendas(List<Venda> vendas) {// valor total de vendas
		int[] arrPrice = new int[1000];
		int cont = 0;
		int somaTotal = 0;
		try {
			for (Venda venda : vendas) {
				String v = venda.getPrice();
				String[] arrVenda = v.replace('"', '0').split("Price");
				for (int i = 0; i < arrVenda.length; i++) {
					arrPrice[cont] += Integer.parseInt(arrVenda[0]);
					somaTotal += arrPrice[i];
					cont++;
				}
			}
			System.out.println("A soma total de Vendas: " + somaTotal);
			System.out.println("|---------------------------------------------|");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void vendasProduct1(List<Venda> vendas) { // valor total de vendas do produto Product1
		int[] arrPrice = new int[1000];
		int cont = 0;
		int totalVendas = 0;
		try {
			for (Venda venda : vendas) {
				String v = venda.getPrice();
				String[] arrVenda = v.replace('"', '0').split("Price");

				for (int i = 0; i < arrVenda.length; i++) {
					if (venda.getProduct().equals("Product1")) {
						arrPrice[cont] = Integer.parseInt(arrVenda[0]);
						totalVendas += arrPrice[i];
					}
					cont++;
				}
			}
			System.out.println("Total de vendas Product1: " + totalVendas);
			System.out.println("|---------------------------------------------|");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void qtdVendasVisa(List<Venda> vendas) {// quantidade de vendas do Payment_Type “Visa
		int cont = 0;
		for (Venda venda : vendas) {
			if (venda.getPaymentType().equals("Visa")) {
				cont++;
			}
		}
		System.out.println("Quantidade de venda do tipo Visa: " + cont);
		System.out.println("|--------------------------------------------------|");
	}

	public static void tiposPagamentoProduct2(List<Venda> vendas) { // tipos de pagamento Product2- sem reptição
		Set<String> payments = new TreeSet<String>();
		try {
			for (Venda venda : vendas) {
				if (venda.getProduct().equals("Product2")) {
					String typePayments = venda.getPaymentType();
					payments.add(typePayments);
				}
			}
			for (String p : payments) {
				System.out.println(p);
			}
		} catch (Exception e) {
			System.out.println("Tipos de pagamentos Product2: "+ e.getMessage());
		}
	}
}
