package Listes;

public class GestionDesStats {
	
	public static class Nature{
		public Nature(String fname, String ename, int plus, int moins){
			_fname = new String(fname);
			_ename = new String(ename);
				_plus = plus;
				_moins = moins;
		}
		
		public String _fname;
		public String _ename;
		public int _plus;
		public int _moins;
		
		public String toString(){
			return new String(_fname +" / "+_ename);
		}
		
		public static Nature assure = new Nature("Assure","Bold",2,1);
		public static Nature bizarre = new Nature("Bizarre","Quirky",0,0);
		public static Nature brave = new Nature("Brave","Brave",1,5);
		public static Nature calme = new Nature("Calme","Calm",4,1);
		public static Nature discret = new Nature("Discret","Quiet",3,5);
		public static Nature docile = new Nature("Docile","Docile",0,0);
		public static Nature doux = new Nature("Doux","Mild",3,2);
		public static Nature foufou = new Nature("Foufou","Rash",3,4);
		public static Nature gentil = new Nature("Gentil","Gentle",4,2);
		public static Nature hardi = new Nature("Hardi","Hardy",0,0);
		public static Nature jovial = new Nature("Jovial","Jolly",5,3);
		public static Nature lache = new Nature("Lache","Lax",2,4);
		public static Nature malin = new Nature("Malin","Impish",2,3);
		public static Nature malpoli = new Nature("Malpoli","Sassy",4,5);
		public static Nature mauvais = new Nature("Mauvais","Naugty",1,4);
		public static Nature modeste = new Nature("Modeste","Modest",3,1);
		public static Nature naif = new Nature("Naif","Naive",5,4);
		public static Nature presse = new Nature("Presse","Hasty",5,2);
		public static Nature prudent = new Nature("Prudent","Careful",4,3);
		public static Nature pudique = new Nature("Pudique","Bashful",0,0);
		public static Nature relax = new Nature("Relax","Relaxed",2,5);
		public static Nature rigide = new Nature("Rigide","Adamant",1,3);
		public static Nature serieux = new Nature("Serieux","Serious",0,0);
		public static Nature solo = new Nature("Solo","Lonely",1,2);
		public static Nature timide = new Nature("Timide","Timid",5,1);
		
		public static Nature[] allNatures = new Nature[] {assure,bizarre,brave,calme,discret,docile,doux,foufou,gentil,hardi,jovial,lache,malin,malpoli,mauvais,modeste,naif,presse,prudent,pudique,relax,rigide,serieux,solo,timide};
		
	}
	
	public int nature;	
	public int[] evs = new int[] {0,0,0,0,0,0};
	public int[] ivs = new  int[] {0,0,0,0,0,0};
	
	public static int ent(int x){
		return x/1;
	}
	
	public static int statCalculator(int baseStat, int ev, int iv, Nature nat,int niveau, int numero){
		int res = 0;
		res = (ent(2*baseStat + iv + (ev/4))*niveau)/100;
		if(numero > 0){
			res += 5;
			if(nat._plus == numero){
				res *= 1.1;
			}
			if(nat._moins == numero){
				res *= 0.9;
			}
		}
		else{
			res += niveau + 10;
		}
		return res;
	}
	
	public static void main(String[] argv){
		int x = statCalculator(50, 0, 31, Nature.serieux, 50, 0);
		System.out.println(x);
	}

}
