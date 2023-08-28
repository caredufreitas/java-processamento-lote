package br.com.resource.desafio.executa;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Executa {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Inicio processamento. ");
		
		List<String> arquivoMercado = Files.readAllLines(Paths.get("DadosMercado.csv"));
		List<String> arquivoOperacoes = Files.readAllLines(Paths.get("Operacoes.csv"));
		Map<String, BigDecimal> resultado = new HashMap<String, BigDecimal>();
		
		/*arquivo operacoes*/
		for (String lnOperacao : arquivoOperacoes.subList(1, arquivoOperacoes.size())) {
			
			String[] clOperacao = lnOperacao.split(";"); 
			
			LocalDate dtInicio = LocalDate.parse(clOperacao[1], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
			LocalDate dtFim = LocalDate.parse(clOperacao[2], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
			long diferenteDias = ChronoUnit.DAYS.between(dtInicio, dtFim);
			
			String nmSubProduto = clOperacao[9];
			
			BigDecimal qtd = new BigDecimal(Double.parseDouble(clOperacao[12].replace(',', '.')));
			
			int idPrecoOp = Integer.parseInt(clOperacao[13]);
		
			/*arquivo mercado*/
			for (String clMercado : arquivoMercado.subList(1, arquivoMercado.size())) {
				
				String[] clDadoMercado = clMercado.split(";");
				
				int idPrecoMerc = Integer.parseInt(clDadoMercado[0]);
				
				int nuPrazo = Integer.parseInt(clDadoMercado[1]);
				
				BigDecimal valor = new BigDecimal(Double.parseDouble(clDadoMercado[2].replace(',', '.')));
		
				/*regras de negocio, relacao de chave primariras*/
				if(idPrecoOp == idPrecoMerc && diferenteDias == nuPrazo) {
					
					BigDecimal result = valor.multiply(qtd);
					
					if (resultado.containsKey(nmSubProduto)) {
					
						BigDecimal soma = resultado.get(nmSubProduto).add(result);
						resultado.put(nmSubProduto, soma);
					
					}else {
						
						resultado.put(nmSubProduto, result);
					}
					
					break;
				}
			}
		}
		
		resultado.forEach((k, v) ->System.out.println(k+ "/"+ v.doubleValue()));
		
		System.out.println("Fim processamento. ");

	}

}
