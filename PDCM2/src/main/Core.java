package main;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;

public class Core {

	public static String getManifest(String urlYT) throws IOException{
		String id = urlYT.substring(urlYT.indexOf("?v=")+3, urlYT.length());
		String urlInfo= "http://www.youtube.com/get_video_info?&video_id=" + id;
		String manifestRAW = donwloadManifestRAW(urlInfo);
		getURLManifest(manifestRAW);
		return urlInfo;
	}
	
	public static String ordenarManifest(String urlBad){
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

	private static String donwloadManifestRAW(String url) throws IOException{
		URL urlD = new URL(url);
        URLConnection yc = urlD.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    yc.getInputStream()));
        String inputLine;
        String manifestRAW = "";
        while ((inputLine = in.readLine()) != null) {
        	manifestRAW = manifestRAW + inputLine;
        }
        in.close();
        System.out.println(manifestRAW);
        
        return manifestRAW;
	}
	
	private static String getURLManifest(String manifestRAW) throws UnsupportedEncodingException{
		String manifest = "";
		
		manifest = URLDecoder.decode(manifestRAW, "UTF-8");
		manifest = URLDecoder.decode(manifest, "UTF-8");
		
		/*
		int desde =manifest.indexOf("http://manifest")+15;
		int from =manifest.indexOf("http://manifest");
		int hasta = manifest.indexOf("&iurl", from);
		*/
		
		manifest.substring(manifest.indexOf("http://manifest")+15, manifest.length());
		
		System.out.println("\n" + manifest);
		return manifest;	
	}
}
