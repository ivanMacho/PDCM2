package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Core {
	
	public static String getURLDASH(String urlBad){
		String URLGood = "";
		
		ArrayList<String> indice = new ArrayList<String>();
		indice = getIndice();
		
		String[] a = urlBad.substring(urlBad.indexOf("dash/")+5, urlBad.length()).split("/") ;
		ArrayList<String> elementos = new ArrayList<String>(Arrays.asList(a));
		
		URLGood = urlBad.substring(0, urlBad.indexOf("dash/")+4);


		for(String elementoIndice: indice){
			for(String elemento: elementos){
				if(elementoIndice.equals(elemento)){
					URLGood = URLGood + "/" + elemento + "/" + elementos.get(elementos.indexOf(elemento)+1);
				}
			}
		}
		return URLGood;
	}
	
	private static ArrayList<String> getIndice(){
		ArrayList<String> indice = new ArrayList<String>();
		indice.add("ms");
		indice.add("hfr");
		indice.add("playback_host");
		indice.add("source");
		indice.add("itag");
		indice.add("mt");
		indice.add("signature");
		indice.add("requiressl");
		indice.add("key");
		indice.add("ip");
		indice.add("ipbits");
		indice.add("initcwndbps");
		indice.add("sparams");
		indice.add("expire");
		indice.add("pl");
		indice.add("as");
		indice.add("id");
		indice.add("upn");
		indice.add("mn");
		indice.add("mm");
		indice.add("mv");
		
		return indice;
		
	}

}
