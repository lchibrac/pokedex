import java.io.*;
import java.text.Normalizer;

public class ReadLine {
	public static String stripAccents(String input) {
		  return Normalizer.normalize(input, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
	}
	public static int firstlength ( char[] s){
		int i = 0;
		char c = "/".toCharArray()[0];
		while ( s[i] != c){
			i = i + 1;
		}
		++i;
		while ( s[i] != c){
			i = i + 1;
		}
		--i;
		return i; 
	}
	public static void main(String[] args){
		String fichier ="pokemonEgg";
		
		//lecture du fichier texte	
		try{
			InputStream ips=new FileInputStream(fichier); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			while ((ligne=br.readLine())!=null){
				System.out.println(ligne.toLowerCase());
			}
			br.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
	}
}
