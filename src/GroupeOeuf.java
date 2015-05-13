
public class GroupeOeuf {
	public GroupeOeuf(String nom , Pokemon[] groupe){
		_nom = new String(nom);
		for ( int i = 0 ; i < groupe.length ; ++i ){
			_groupe[i] = groupe[i].clone();
		}
	}
	
	public String _nom;
	public Pokemon[] _groupe;
}
