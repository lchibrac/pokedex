import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Probabilite {
	
	public static int random(int min,int max){
		double r = Math.random();
		double r2 = r*(max - min);
		double r3 = r2 + min;
		
		DecimalFormat df = new DecimalFormat("#");
		df.setRoundingMode(RoundingMode.HALF_EVEN);
		
		String i = df.format(r3).toString();
		int res = Integer.valueOf(i);
		return res;
	}
	
	public static boolean attaquePasse(PokemonEnCombat cible, PokemonEnCombat lanceur, Attaque attaque){
		int p = random(0,100);
		int a = attaque._precision;
		double ga = PokemonEnCombat.getAccuracy(lanceur, cible);
		return (p <= a*ga);
	}
	
	public static boolean effet(AttaqueDegat a){
		int p = random(0,100);
		return p <= a._effet;
	}
	
	public static double degats(AttaqueDegat a, PokemonEnCombat lanceur, PokemonEnCombat cible){
		
		double num = 2*lanceur._niveau+10;
		System.out.println(num);
		double den = 250*lanceur._stats[2+(2*a._categorie)];
		System.out.println(den);
		double num2 = (num*lanceur._stats[1+(2*a._categorie)]);
		System.out.println(num2);
		double modifier = cible.getSensibilites()[a._t._nb]*(random(85, 100)/100);
		System.out.println(modifier);
		return(((((num2*a._puissance)/den)+2)*modifier));
	}
	
	public static void main(String[] argv){
		int x;
		for(int i = 0 ; i < 20 ; ++i){
			x = random(0, 100);
			System.out.println(x);
		}
	}
	
}
