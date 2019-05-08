package br.com.etechoracio.megasena;

public class Megasena {

	private final static String URL = "http://www1.caixa.gov.br/_newincludes/home_2011/resultado_megasena.asp";
	private final static String MARCA_INICIAL_RETORNO_NAO_UTIL = "<div id='concurso_resultado'>";
	private final static String MARCA_FINAL_RETORNO_NAO_UTIL = "</div>";

	private String obterDezenas(String html) {
        Integer parteInicial = html.indexOf(MARCA_INICIAL_RETORNO_NAO_UTIL) + MARCA_INICIAL_RETORNO_NAO_UTIL.length();
        Integer parteFinal = html.indexOf(MARCA_FINAL_RETORNO_NAO_UTIL);
        String[] resultado = html.substring(parteInicial, parteFinal).replaceAll(" ", "").split("-");
		
        StringBuilder sb = new StringBuilder("Resultados: ");
		for (String string : resultado) {
			sb.append(string).append(" ");
		}
		return sb.toString();
    }


	
	
	
}
