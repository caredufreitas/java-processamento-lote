package br.com.resource.oop.negocio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.resource.oop.modelo.Funcionario;

public class Processamento {
	public static void processaArquivo() throws FileNotFoundException {
		File arquivo = new File("Ck_semvalor.csv");
		Scanner sc = new Scanner(arquivo);
		List<Funcionario> funcionarios = new ArrayList<>();

		while(sc.hasNextLine()) {//boilerplate
			
			String[] arrLinha = sc.nextLine().split(";");
			
			if (arrLinha.length == 26) {
				
				Funcionario func = new Funcionario(arrLinha);
				funcionarios.add(func);
			}
		}		
		chamaAcao(funcionarios);
	}
	private static void chamaAcao(List<Funcionario> funcionarios) {
		alocadosPaulista(funcionarios);
		funcionarias(funcionarios);
		gerente(funcionarios);
		masculino(funcionarios);
	}
	private static void alocadosPaulista(List<Funcionario> funcionarios) {
		int cont = 0;
		for (Funcionario funcionario : funcionarios) {
			if(funcionario.getLocalTrabalho().equals("RES. PAULISTA")) {
				System.out.println(cont+ "- Empregados da PAULISTA: "+ funcionario.getNomeEmpregado());
			}
			cont++;
		}
		System.out.println("|------------------------------------------------------------------------|");
	}
	private static void funcionarias(List<Funcionario> funcionarios) {
		int sexoF = 0;
		for (Funcionario funcionario : funcionarios) {
			if(funcionario.getSexo().equals("Feminino")) {
				sexoF++;
			}
		}
		System.out.println("Total de Funcionárias: "+ sexoF);
		System.out.println("|------------------------------------------------------------------------|");
	}
	private static void gerente(List<Funcionario> funcionarios) {
		int cont = 0;
		for (Funcionario funcionario : funcionarios) {
			if(funcionario.getNomeGerente().equals("ETIENNE HENRIQUE JENSEN FILHO")) {
				System.out.println(cont +"- Empregados do GERENTE ETIENE: "+ funcionario.getNomeEmpregado());
			} 
			cont++;
		}
		System.out.println("|------------------------------------------------------------------------|");
	}
	private static void masculino(List<Funcionario> funcionarios) {
		int cont = 0;
		for (Funcionario funcionario : funcionarios) {
			if ((funcionario.getSexo().equals("Masculino")) && (funcionario.getAlocacao().equals("BANCO ITAU"))) {
				System.out.println(cont +"- Nome funcionário sexo MASCULINO e trabalha no Banco ITAU: "+ funcionario.getNomeEmpregado());
			}
			cont++;
		}
	}
}
