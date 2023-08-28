package br.com.resource.apartamento.negocio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.resource.apartamentos.modelo.Apartamento;

public class Condominio {
	public static void processaArquivo() throws FileNotFoundException {
		File arquivo = new File("apartamentos.csv");
		Scanner sc = new Scanner(arquivo);
		List<Apartamento> apartamentos = new ArrayList<Apartamento>();
		
		sc.nextLine();
		while (sc.hasNextLine()) {
			String linha = sc.nextLine();
			String[] arrLinha = linha.split(","); 
			Apartamento apts = new Apartamento(arrLinha);
			apartamentos.add(apts);
		}
		carregaMetodos(apartamentos);
	}
	public static void carregaMetodos(List<Apartamento> apartamentos) {
		naoPagaram(apartamentos);
		valorTotal(apartamentos);
		valorNaoArrecadado(apartamentos);
	}
	public static void naoPagaram(List<Apartamento> apartamento) {  //tarefa 01 - selecionar 1 mostra 0
		System.out.println("Os apartamentos que não pagaram. ");
		apartamento.stream().filter(item -> item.getValor().equals("0.0"))
		.forEach(x -> System.out.println(x.getApartamento()));
		System.out.println("|-------------------------------------|");
	}
	public static void valorTotal(List<Apartamento> apartamentos) { // Retorne no console o valor total arrecadado 
		double valorTotal = 0;
		for (Apartamento apartamento : apartamentos) {
			double valor = Double.parseDouble(apartamento.getValor());
			valorTotal += valor;
		}
		System.out.println("O valor total arrecadado. "+ valorTotal);
		System.out.println("|--------------------------------------|");
	}
	public static void valorNaoArrecadado(List<Apartamento> apartamentos) { // valor total não arrecadado 
		double valorTotal = 0;
		for (Apartamento apartamento : apartamentos) {
			double valor = Double.parseDouble(apartamento.getValor());
			if(valor != 890.34) {
				valorTotal += valor;
			}
		}
		System.out.println("O valor total não arrecadado. "+ valorTotal);
		
	}
}
	

