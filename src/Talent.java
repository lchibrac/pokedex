
public class Talent {
	public Talent (String[] tab){
        _fr = new String(tab[0]);
        _en = new String(tab[1]);
        _description = tab[2];
    }
    
    public String toString(){
    	if ( this.equals(zero))
    		return "";
    	else
    		return this._fr + " / " + this._en + " : " + this._description;
    }
    
    public Talent clone(){
    	String[] clone = new String[3];
    	clone[0] = new String(_fr);
    	clone[1] = new String(_en);
    	clone[2] = new String(_description);
    	return new Talent(clone);
    }
    
    
    //Talents
    public static Talent absenteisme = new Talent (new String[] {"Absent�isme","Truant","Le Pok�mon n'attaque qu'un tour sur deux."});
    public static Talent absorbeau = new Talent ( new String[] {"Absorb Eau","Water Absorb","Les attaques de type eau re�ues par le Pok�mon r�g�n�rent 1/4 de ses PV."} );
    public static Talent absorbvolt = new Talent ( new String[] {"Absorb Volt","Volt Absorb","Les attaques de type �lectrique re�ues par le Pok�mon r�g�n�rent 1/4 de ses PV."} );
    public static Talent agitation = new Talent ( new String[] {"Agitation","Hustle","Augmente l'attaque de 50% mais baisse la pr�cision de 20%.  Augmente de 50% les chances de rencontrer un Pok�mon sauvage de haut niveau."} );
    public static Talent airlock = new Talent ( new String[] {"Air L-ock","Air Lock","Annule les effets du climat."} );
    public static Talent antibruit = new Talent ( new String[] {"Anti-Bruit","Soundproof","Annule les effets dus � une attaque sonore."} );
    public static Talent armumagma = new Talent ( new String[] {"Armumagma","Magma Armor","Immunise contre le gel. Divise par deux le nombre de pas n�cessaire � l'�closion d'un oeuf."} );
    public static Talent armurbaston = new Talent ( new String[] {"Armurbaston","Battle Armor","Annule les chances de coups critiques du Pok�mon ennemi."} );
    public static Talent attention = new Talent ( new String[] {"Attention","Inner Focus","Immunise contre la peur."} );
    public static Talent benet = new Talent ( new String[] {"Ben�t","Oblivious","Immunise contre le charme. � partir de la 6�me g�n�ration, ce talent immunise aussi contre la provocation."} );
    public static Talent boomfinal = new Talent ( new String[] {"Boom Final","Aftermath","Enl�ve 1/4 des PV totaux du Pok�mon ennemi mettant K. O. par contact."} );
    public static Talent brasier = new Talent ( new String[] {"Brasier","Blaze","Augmente la puissance des attaques de type Feu de 50% lorsque le Pok�mon a moins d'1/3 de ses PV totaux."} );
    public static Talent cacophonie = new Talent ( new String[] {"Cacophonie","Cacophony","Annule les effets dus � une attaque sonore."} );
    public static Talent calque = new Talent ( new String[] {"Calque","Trace","Copie le talent du Pok�mon adverse."} );
    public static Talent chanceux = new Talent ( new String[] {"Chanceux","Super Luck","Double les chance de porter un coup critique."});
    public static Talent chlorophylle = new Talent ( new String[] {"Chlorophylle","Chlorophyll","Augmente la vitesse au soleil."} );
    public static Talent cielgris = new Talent ( new String[] {"Ciel Gris","Cloud Nine","Annule les effets du climat."} );
    public static Talent coloforce = new Talent ( new String[] {"Coloforce","Huge Power","Double l'attaque du Pok�mon."} );
    public static Talent coquearmure = new Talent ( new String[] {"Coque Armure","Shell Armor","Annule les chances de coups critiques du Pok�mon ennemi."} );
    public static Talent corpsardent = new Talent ( new String[] {"Corps Ardent","Flame Body","30% de chance de provoquer une br�lure sur le Pok�mon adverse ayant attaqu�. Divise par deux le nombre de pas n�cessaire � l'�closion d'un oeuf."} );
    public static Talent corpssain = new Talent ( new String[] {"Corps Sain","Clear Body","Emp�che la diminution de statistiques par le Pok�mon adverse."} );
    public static Talent crachin = new Talent ( new String[] {"Crachin","Drizzle","Fait tomber la pluie tant que le Pok�mon est en jeu."} );
    public static Talent cran = new Talent ( new String[] {"Cran","Guts","Augmente de 50% l'attaque du Pok�mon s'il subit un changement de statut."} );
    public static Talent cuvette = new Talent ( new String[] {"Cuvette","Rain Dish","R�g�n�re 1/16�me des PV par temps de pluie."} );
    public static Talent deguisement = new Talent ( new String[] {"D�guisement","Color Change","Change le type du Pok�mon en celui de la derni�re attaque subie."} );
    public static Talent ecaillespeciale = new Talent ( new String[] {"�caille Sp�ciale","Marvel Scale","Augmente la d�fense de 50% lorsque le Pok�mon subit un changement de statut."} );
    public static Talent echauffement = new Talent ( new String[] {"�chauffement","Limber","Immunise contre la paralysie."} );
    public static Talent ecranfumee = new Talent ( new String[] {"�cran Fum�e","White Smoke","Emp�che la diminution de statistiques par le Pok�mon adverse. R�duit de 50% les chances d'�tre attaqu� par un Pok�mon sauvage."} );
    public static Talent ecranpoudre = new Talent ( new String[] {"�cran Poudre","Shield Dust","Emp�che les effets secondaires des attaques subies."} );
    public static Talent engrais = new Talent ( new String[] {"Engrais","Overgrow","Augmente la puissance des attaques de type Plante de 50% lorsque le Pok�mon a moins d'1/3 de ses PV totaux."} );
    public static Talent espritvital = new Talent ( new String[] {"Esprit Vital","Vital Spirit","Emp�che le Pok�mon d'�tre endormi. Augmente de 50% les chances de rencontrer un Pok�mon sauvage de haut niveau."} );
    public static Talent essaim = new Talent ( new String[] {"Essaim","Swarm","Augmente la puissance des attaques de type Insecte de 50% lorsque le Pok�mon a moins d'1/3 de ses PV totaux. Augmente les chances d'entendre le cri d'un Pok�mon sauvage."} );
    public static Talent fermete = new Talent ( new String[] {"Fermet�","Sturdy","Immunise contre les attaques OHKO. � partir de la 5�me g�n�ration, ce talent fait aussi conserver 1 PV au Pok�mon m�me apr�s une attaque qui aurait du le terrasser, s'il a tous ses PV."} );
    public static Talent forcepure = new Talent ( new String[] {"Force Pure","Pure Power","Double l'attaque du Pok�mon."} );
    public static Talent fuite = new Talent ( new String[] {"Fuite","Run Away","Assure la fuite contre les Pok�mon sauvages."} );
    public static Talent gardemystik = new Talent ( new String[] {"Garde Mystik","Wonder Guard","Ne subit que les d�g�ts d'attaques super efficaces."} );
    public static Talent glissade = new Talent ( new String[] {"Glissade","Swift Swim","Double la vitesse par temps de pluie."} );
    public static Talent glue = new Talent ( new String[] {"Glue","Sticky Hold","Emp�che la perte de l'objet tenu. Facilite la capture des Pok�mon p�ch�s."} );
    public static Talent hypercutter = new Talent ( new String[] {"Hyper Cutter","Hyper Cutter","Emp�che la diminution d'attaque du Pok�mon."} );
    public static Talent ignifuvoile = new Talent ( new String[] {"Ignifu-Voile","Water Veil","Immunise contre la br�lure."} );
    public static Talent insomnia = new Talent ( new String[] {"Insomnia","Insomnia","Emp�che le Pok�mon d'�tre endormi."} );
    public static Talent intimidation = new Talent ( new String[] {"Intimidation","Intimidate","Diminue d'un niveau l'attaque du Pok�mon adverse. R�duit de 50% les chances d'�tre attaqu� par un Pok�mon sauvage de bas niveau."} );
    public static Talent isograisse = new Talent ( new String[] {"Isograisse","Thick Fat","Les d�g�ts provoqu�s par les attaques des types Feu ou Glace sont divis�s par 2."} );
    public static Talent jolisourire = new Talent ( new String[] {"Joli Sourire","Cute Charm","A 30% de chance de provoquer l'attirance du Pok�mon adverse ayant attaqu�. Augmente de 50% les chances d'�tre attaqu� par un Pok�mon sauvage du sexe oppos�."} );
    public static Talent levitation = new Talent ( new String[] {"L�vitation","Levitate","Immunise contre les attaques de type Sol."} );
    public static Talent lumiattirance = new Talent ( new String[] {"Lumiattirance","Illuminate","Augmente les chances de rencontrer des Pok�mon sauvages. RS"} );
    public static Talent magnepiege = new Talent ( new String[] {"Magn�pi�ge","Magnet Pull","Emp�che la fuite et le changement des Pok�mon de type Acier. Augmente de 50% les chances de rencontrer un Pok�mon sauvage de type acier."} );
    public static Talent marqueombre = new Talent ( new String[] {"Marque Ombre","Shadow Tag","Emp�che la fuite des Pok�mon sauvage et le changement du Pok�mon adverse."} );
    public static Talent matinal = new Talent ( new String[] {"Matinal","Early Bird","R�duit le nombre de tours de sommeil du Pok�mon."} );
    public static Talent medicnature = new Talent ( new String[] {"M�dic Nature","Natural Cure","Le Pok�mon est soign� de toute alt�ration d'�tat lorsqu'il est chang� ou en fin de combat."} );
    public static Talent meteo = new Talent ( new String[] {"M�t�o","Forecast","Change le type et la forme du Pok�mon selon le climat."} );
    public static Talent minus = new Talent ( new String[] {"Minus","Minus","Augmente l'attaque sp�ciale de 50% en match double, si le partenaire � le talent Plus."} );
    public static Talent moiteur = new Talent ( new String[] {"Moiteur","Damp","�mp�che l'utilisation d'attaques auto-destructrices par le Pok�mon adverse."} );
    public static Talent mue = new Talent ( new String[] {"Mue","Shed Skin","� chaque tour, le Pok�mon a 33% de chance d'�tre soign� d'une alt�ration d'�tat."} );
    public static Talent oeilcompose = new Talent ( new String[] {"oeil Compos�","Compoundeye","Double la pr�cision du Pok�mon. Augmente les chances de rencontrer un Pok�mon sauvage tenant un objet."} );
    public static Talent paratonnerre = new Talent ( new String[] {"Paratonnerre","Lightningrod","Attire toutes les attaques de type �lectrique. � partir de la 5�me g�n�ration, ce talent augmente aussi l'attaque sp�ciale du Pok�mon recevant l'attaque. Augmente les chances de recevoir un appel sur le Pok�Nav."} );
    public static Talent peaudure = new Talent ( new String[] {"Peau Dure","Rough Skin","Fait perdre 1/16� des PV du Pok�mon adverse ayant lanc� une attaque de contact."} );
    public static Talent piege = new Talent ( new String[] {"Pi�ge","Arena Trap","Emp�che la fuite et le changement du Pok�mon adverse, s'il est au sol. Augmente de 50% les chances d'�tre attaqu� par un Pok�mon sauvage."} );
    public static Talent plus = new Talent ( new String[] {"Plus","Plus","Augmente l'attaque sp�ciale de 50% en match double, si le partenaire � le talent Minus."} );
    public static Talent pointpoison = new Talent ( new String[] {"Point Poison","Poison Point","30% de chance de provoquer l'empoisonnement du Pok�mon adverse ayant lanc� une attaque de contact."} );
    public static Talent posespore = new Talent ( new String[] {"Pose Spore","Effect Spore","30% de chance de provoquer l'empoisonnement, le sommeil ou la paralysie du Pok�mon adverse ayant lanc� une attaque de contact."} );
    public static Talent pression = new Talent ( new String[] {"Pression","Pressure","Double l'utilisation de PP des attaques offensives du Pok�mon adverse. Augmente de 50% les chances d'�tre attaqu� par un Pok�mon sauvage."} );
    public static Talent puanteur = new Talent ( new String[] {"Puanteur","Stench","Les attaques physiques ont 10% d'apeurer la cible. Uniquement � partir de la 5�me g�n�ration. Diminue les chances de rencontrer des Pok�mon sauvages."} );
    public static Talent ramassage = new Talent ( new String[] {"Ramassage","Pickup","Donne une chance au Pok�mon de ramasser un objet apr�s un combat."} );
    public static Talent regardvif = new Talent ( new String[] {"Regard Vif","Keen Eye","Emp�che la perte de pr�cision. R�duit de 50% les chances d'�tre attaqu� par un Pok�mon sauvage de bas niveau."} );
    public static Talent sablevolant = new Talent ( new String[] {"Sable Volant","Sand Stream","D�clenche une temp�te de sable tant que le Pok�mon est en jeu."} );
    public static Talent secheresse = new Talent ( new String[] {"S�cheresse","Drought","Cr�e un temps ensoleill� tant que le Pok�mon est en jeu."} );
    public static Talent serenite = new Talent ( new String[] {"S�r�nit�","Serene Grace","Double les chances de r�ussite des effets secondaires des attaques."} );
    public static Talent statik = new Talent ( new String[] {"Statik","Static","30% de chance de provoquer la paralysie du Pok�mon adverse ayant lanc� une attaque de contact. Augmente de 50% les chances de rencontrer un Pok�mon sauvage de type �lectrique."} );
    public static Talent suintement = new Talent ( new String[] {"Suintement","Liquid Ooze","Les attaques absorbantes du Pok�mon adverse lui font perdre des PV."} );
    public static Talent synchro = new Talent ( new String[] {"Synchro","Synchronize","Toute alt�ration d'�tat subie est transmise au Pok�mon adverse. Augmente les chances de rencontrer un Pok�mon sauvage ayant la m�me nature."} );
    public static Talent tempoperso = new Talent ( new String[] {"Tempo Perso","Own Tempo","Immunise contre la confusion."} );
    public static Talent tetederoc = new Talent ( new String[] {"T�te de Roc","Rock Head","Le Pok�mon ne subit pas de d�g�ts de contrecoup."} );
    public static Talent torche = new Talent ( new String[] {"Torche","Flash Fire","Annule les d�g�ts des attaques de type Feu subies et augmente de 50% la puissance des attaques de type Feu lanc�es."} );
    public static Talent torrent = new Talent ( new String[] {"Torrent","Torrent","Augmente la puissance des attaques de type Eau de 50% lorsque le Pok�mon a moins d'1/3 de ses PV totaux."} );
    public static Talent turbo = new Talent ( new String[] {"Turbo","Speed Boost","La vitesse du Pok�mon augmente � chaque tour."} );
    public static Talent vaccin = new Talent ( new String[] {"Vaccin","Immunity","Immunise contre l'empoisonnement."} );
    public static Talent ventouse = new Talent ( new String[] {"Ventouse","Suction Cups","Emp�che d'�tre chang� de force par une attaque adverse. Augmente les chances qu'un Pok�mon p�ch� morde � l'hame�on."} );
    public static Talent voilesable = new Talent ( new String[] {"Voile Sable","Sand Veil","Augmente l'esquive de 20% lors d'une temp�te de sable et immunise contre ses d�g�ts. R�duit de 50% les chances d'�tre attaqu� par un Pok�mon sauvage lors d'une temp�te de sable."} );
    public static Talent adaptabilite = new Talent ( new String[] {"Adaptabilit�","Adaptability","STAB : Si ce Pok�mon utilise une attaque de son type, la puissance de l'attaque est multipli�e par 2 au lieu de 1. 5."} );
    public static Talent alerteneige = new Talent ( new String[] {"Alerte Neige","Snow Warning","Le Pok�mon d�clenche une gr�le lorsqu'il est envoy� au combat."} );
    public static Talent annulegarde = new Talent ( new String[] {"Annule Garde","No Guard","Toutes les attaques du Pok�mon et de son adversaire ont une pr�cision de 100%. Augmente les chances de rencontrer un Pok�mon sauvage."} );
    public static Talent anticipation = new Talent ( new String[] {"Anticipation","Anticipation","Alerte et prot�ge lorsque le Pok�mon adverse poss�de certaines attaques."} );
    public static Talent brisemoule = new Talent ( new String[] {"Brise Moule","Mold Breaker","Peut toucher un Pok�mon adverse malgr� son talent."} );
    public static Talent cherchemiel = new Talent ( new String[] {"Cherche Miel","Honey Gather","Le Pok�mon peut trouver du Miel apr�s un combat."} );
    public static Talent colerique = new Talent ( new String[] {"Col�rique","Anger Point","L'attaque du Pok�mon est fortement augment�e lorsqu'il subit un coup critique."} );
    public static Talent corpsgel = new Talent ( new String[] {"Corps Gel","Ice Body","R�g�n�re 1/16�me des PV par temps de gr�le. Immunise les Pok�mon n'ayant pas le type glace contre la gr�le."} );
    public static Talent debutcalme = new Talent ( new String[] {"D�but Calme","Slow Start","Divise par deux l'attaque et la vitesse du Pok�mon pendant 5 tours."} );
    public static Talent delestage = new Talent ( new String[] {"D�lestage","Unburden","Augmente la vitesse lorsqu'un objet tenu est utilis�, lanc� ou perdu."} );
    public static Talent donfloral = new Talent ( new String[] {"Don Floral","Flower Gift","Augmente l'attaque et la d�fense sp�ciale de 50% par temps ensoleill�."} );
    public static Talent feuillegarde = new Talent ( new String[] {"Feuille Garde","Leaf Guard","Soigne les alt�rations d'�tat par temps ensoleill�."} );
    public static Talent filtre = new Talent ( new String[] {"Filtre","Filter","Retire 1/4 des d�g�ts subits lors d'une attaque super efficace."} );
    public static Talent forcesoleil = new Talent ( new String[] {"Force Soleil","Solar Power","Augmente l'attaque sp�ciale de 50% par temps ensoleill�, mais diminue les PV de 1/8�me par tour."} );
    public static Talent fouille = new Talent ( new String[] {"Fouille","Frisk","Permet de connaitre l'objet tenu d'un Pok�mon adverse."} );
    public static Talent frein = new Talent ( new String[] {"Frein","Stall","Le Pok�mon attaque toujours en second pour deux attaques de m�me priorit�."} );
    public static Talent gardemagik = new Talent ( new String[] {"Garde Magik","Magic Guard","Le Pok�mon ne subit de d�g�ts que lors d'attaques directes."} );
    public static Talent gloutonnerie = new Talent ( new String[] {"Gloutonnerie","Gluttony","Le Pok�mon utilise la baie port�e lorsque les PV descendent en dessous de 50%."} );
    public static Talent hydratation = new Talent ( new String[] {"Hydratation","Hydration","Soigne les alt�rations d'�tat par temps de pluie."} );
    public static Talent ignifuge = new Talent ( new String[] {"Ignifuge","Heatproof","Divise par 2 les d�g�ts des attaques de type feu et les effets de br�lure subis par le Pok�mon."} );
    public static Talent impassible = new Talent ( new String[] {"Impassible","Steadfast","Augmente d'un niveau la vitesse du Pok�mon lorsqu'il est apeur�."} );
    public static Talent inconscient = new Talent ( new String[] {"Inconscient","Unaware","Ignore les am�liorations de statistiques du Pok�mon adverse, � l'exception de sa Vitesse."} );
    public static Talent lavabo = new Talent ( new String[] {"Lavabo","Storm Drain","Attire toutes les attaques de type eau. � partir de la 5�me g�n�ration, ce talent augmente aussi l'attaque sp�ciale du Pok�mon recevant l'attaque."} );
    public static Talent lentiteintee = new Talent ( new String[] {"Lentiteint�e","Tinted Lens","Double les d�g�ts des attaques peu efficaces port�es au Pok�mon adverse."} );
    public static Talent maladresse = new Talent ( new String[] {"Maladresse","Klutz","Emp�che l'utilisation et/ou ignore l'effet des objets tenus en combat."} );
    public static Talent mauvaisreve = new Talent ( new String[] {"Mauvais R�ve","Bad Dreams","Fait perdre 1/8�me de ses PV au Pok�mon adverse s'il est endormi."} );
    public static Talent motorise = new Talent ( new String[] {"Motoris�","Motor Drive","Immunise le Pok�mon contre les attaques de type �lectrique et augmente la vitesse du Pok�mon d'un niveau par attaque �lectrique subie."} );
    public static Talent multicoups = new Talent ( new String[] {"Multi-Coups","Skill Link","Utilise toujours le nombre de coups maximum d'une attaque."}  );
    public static Talent multitype = new Talent ( new String[] {"Multitype","Multitype","Le type et la forme du Pok�mon changent en fonction de la plaque qu'il porte."} );
    public static Talent normalise = new Talent ( new String[] {"Normalise","Normalize","Toutes les attaques du Pok�mon sont consid�r�es comme �tant de type Normal."} );
    public static Talent peauseche = new Talent ( new String[] {"Peau S�che","Dry Skin","Les attaques de type eau soignent le Pok�mon, qui regagne 1/4 de ses PV totaux.  Par temps de pluie, il gagne 1/8�me de ses PV par tour.  Les attaques de type feu infligent 25% de d�g�ts en plus.  Par temps ensoleill�, il perd 1/8�me de ses PV par tour."} );
    public static Talent piedconfus = new Talent ( new String[] {"Pied Confus","Tangled Feet","Augmente l'esquive de 20% lorsque le Pok�mon est confus."} );
    public static Talent piedveloce = new Talent ( new String[] {"Pied V�loce","Quick Feet","Augmente la vitesse de 50% lorsque le Pok�mon subit une alt�ration d'�tat."} );
    public static Talent poingdefer = new Talent ( new String[] {"Poing de Fer","Iron Fist","Augmente de 20% la puissance des attaques de Poing."} );
    public static Talent prediction = new Talent ( new String[] {"Pr�diction","Forewarn","Alerte le Pok�mon de l'attaque la plus puissante du Pok�mon adverse."} );
    public static Talent querelleur = new Talent ( new String[] {"Querelleur","Scrappy","Permet de toucher les Pok�mon de type Spectre avec des attaques de type Normal ou Combat."} );
    public static Talent rideauneige = new Talent ( new String[] {"Rideau Neige","Snow Cloak","Augmente l'esquive de 20% par temps de gr�le. Immunise les Pok�mon n'ayant pas le type glace contre la gr�le."} );
    public static Talent rivalite = new Talent ( new String[] {"Rivalit�","Rivalry","Augmente l'attaque et l'attaque sp�ciale de 25% si le Pok�mon adverse est de m�me sexe. Les diminue s'il est de sexe oppos�."} );
    public static Talent simple = new Talent ( new String[] {"Simple","Simple","Double les effets des modifications de statistiques, positives ou n�gatives."} );
    public static Talent sniper = new Talent ( new String[] {"Sniper","Sniper","Triple la puissance des coups critiques."} );
    public static Talent soinpoison = new Talent ( new String[] {"Soin Poison","Poison Heal","Le Pok�mon r�cup�re 1/8� de ses PV par tour lors d'un empoisonnement. Le Pok�mon empoisonn� perd tout de m�me ses PV lorsque son dresseur se d�place. Cette perte de PV n'a plus lieu � partir de la 5�me g�n�ration."} );
    public static Talent solideroc = new Talent ( new String[] {"Solide Roc","Solid Rock","Retire 1/4 des d�g�ts subits si le Pok�mon re�oit une attaque super efficace."} );
    public static Talent technicien = new Talent ( new String[] {"Technicien","Technician","Augmente de 50% la puissance des attaques dont la puissance est inf�rieure ou �gale � 60."} );
    public static Talent telecharge = new Talent ( new String[] {"T�l�charge","Download","Augmente l'attaque ou l'attaque sp�ciale du Pok�mon, selon la statistique de d�fense la plus faible du Pok�mon adverse."} );
    public static Talent temeraire = new Talent ( new String[] {"T�m�raire","Reckless","Augmente de 20% la puissance des attaques infligeant des d�g�ts de recul."} );
    public static Talent acharne = new Talent ( new String[] {"Acharn�","Defiant","Monte l'Attaque du Pok�mon de deux niveau si l'une de ses statistiques est baiss�e par l'adversaire."} );
    public static Talent analyste = new Talent ( new String[] {"Analyste","Analytic","Si le Pok�mon frappe en dernier durant le tour, la puissance de son attaque est augment�e de 30%."} );
    public static Talent armurouillee = new Talent ( new String[] {"Armurouill�e","Weak Armor","Le Pok�mon touch� par une attaque physique voit sa d�fense diminuer d'un niveau et sa vitesse augmenter d'un niveau."}  );
    public static Talent baignesable = new Talent ( new String[] {"Baigne Sable","Sand Rush","Double la Vitesse du Pok�mon lors d'une temp�te de sable. Immunise contre les d�g�ts de la temp�te."} );
    public static Talent coeurdecoq = new Talent ( new String[] {"Coeur de Coq","Big Pecks","Emp�che la d�fense du Pok�mon d'�tre baiss�e par les attaques adverses."} );
    public static Talent coeurnoble = new Talent ( new String[] {"Coeur Noble","Justified","Si le Pok�mon est touch� par une attaque de type t�n�bres, son attaque augmente d'un niveau."} );
    public static Talent coeursoin = new Talent ( new String[] {"Coeur Soin","Healer","� la fin de chaque tour, le Pok�mon a 30% de chance de gu�rir ses alli�s d'une alt�ration d'�tat en combat double ou triple."} );
    public static Talent contestation = new Talent ( new String[] {"Contestation","Contrary","Inverse les effets des attaques modifiant les statistiques."} );
    public static Talent corpsmaudit = new Talent ( new String[] {"Corps Maudit","Cursed Body","Toute attaque port�e par l'adversaire a 30% de chance de s'entraver."} );
    public static Talent defaitiste = new Talent ( new String[] {"D�faitiste","Defeatist","Divise par deux l'attaque et l'attaque sp�ciale du Pok�mon s'il a moins de la moiti� de ses PV totaux."} );
    public static Talent envelocape = new Talent ( new String[] {"Envelocape","Overcoat","Immunise contre les d�g�ts caus�s par la gr�le et les temp�tes de sable."} );
    public static Talent epinedefer = new Talent ( new String[] {"�pine de Fer","Iron Barbs","Retire 1/8�me de ses PV � l'adversaire lorsque celui-ci porte une attaque physique."} );
    public static Talent farceur = new Talent ( new String[] {"Farceur","Prankster","Augmente la priorit� des attaques de statut d'un niveau."} );
    public static Talent forcesable = new Talent ( new String[] {"Force Sable","Sand Force","Lors d'une temp�te de sable, la puissance des attaques de type acier, roche et sol augmente de 30 %."} );
    public static Talent gardeamie = new Talent ( new String[] {"Garde Amie","Friend Guard","R�duire de 25% les d�g�ts inflig�s aux alli�s en combat double ou triple."} );
    public static Talent heavymetal = new Talent ( new String[] {"Heavy Metal","Heavy Metal","Double la masse du Pok�mon."} );
    public static Talent herbivore = new Talent ( new String[] {"Herbivore","Sap Sipper","Si le Pok�mon est touch� par une attaque de type plante, son attaque augmente d'un niveau."} );
    public static Talent illusion = new Talent ( new String[] {"Illusion","Illusion","Lorsqu'il entre en combat, le Pok�mon prend l'apparence du dernier Pok�mon de l'�quipe."} );
    public static Talent imposteur = new Talent ( new String[] {"Imposteur","Imposter","Le Pok�mon entrant en combat prend automatiquement l'apparence du Pok�mon adverse."} );
    public static Talent impudence = new Talent ( new String[] {"Impudence","Moxie","Monte l'attaque du Pok�mon d'un niveau lorsqu'il met un adversaire K. O."} );
    public static Talent infiltration = new Talent ( new String[] {"Infiltration","Infiltrator","Emp�che les attaques de protection adverses tels que Protection ou Mur Lumi�re de fonctionner. N'influe pas sur D�tection et Abri."} );
    public static Talent lightmetal = new Talent ( new String[] {"Light Metal","Light Metal","Divise par deux la masse du Pok�mon."} );
    public static Talent lunatique = new Talent ( new String[] {"Lunatique","Moody","Al�atoirement, � la fin de chaque tour, une statistique du Pok�mon augmente de deux niveaux, et une autre baisse d'un niveau (pr�cision et esquive comprises)."} );
    public static Talent miroirmagik = new Talent ( new String[] {"Miroir Magik","Magic Bounce","Retourne les attaques de statut contre l'adversaire."} );
    public static Talent modetranse = new Talent ( new String[] {"Mode Transe","Zen Mode","Le Pok�mon change de forme et modifie la r�partition de ses statistiques lorsque ses PV sont inf�rieurs � 50%."} );
    public static Talent momie = new Talent ( new String[] {"Momie","Mummy","Si le Pok�mon subit une attaque de contact, le talent de l'adversaire devient Momie. Ce talent est sans effet en elle-m�me."} );
    public static Talent multiecaille = new Talent ( new String[] {"Multi�caille","Multiscale","Si le Pok�mon poss�de 100% de ses PV, alors les d�g�ts inflig�s par l'adversaire sont divis�s par deux."} );
    public static Talent peaumiracle = new Talent ( new String[] {"Peau Miracle","Wonder Skin","50% de chance de faire �chouer les attaques de statut port�es par l'adversaire."} );
    public static Talent phobique = new Talent ( new String[] {"Phobique","Rattled","Si le Pok�mon est touch� par une attaque de type insecte, spectre ou t�n�bres, sa vitesse augmente d'un niveau."} );
    public static Talent pickpocket = new Talent ( new String[] {"Pickpocket","Pickpocket","Si le Pok�mon subit une attaque physique, il r�cup�re l'objet tenu par son adversaire."} );
    public static Talent ragebrulure = new Talent ( new String[] {"Rage Br�lure","Flare Boost","Augmente l'attaque sp�ciale du Pok�mon de 50% en cas de br�lure."} );
    public static Talent ragepoison = new Talent ( new String[] {"Rage Poison","Toxic Boost","Augmente l'attaque du Pok�mon de 50% en cas d'empoisonnement."} );
    public static Talent recolte = new Talent ( new String[] {"R�colte","Harvest","Une baie consomm�e par le Pok�mon a 50% de chances d'�tre r�cup�r�e � la fin de chaque tour."} );
    public static Talent regeforce = new Talent ( new String[] {"R�g�-Force","Regenerator","Restaure 1/3 des PV totaux si le Pok�mon est retir� du combat."} );
    public static Talent sanslimite = new Talent ( new String[] {"Sans Limite","Sheer Force","Augmente de 30% la puissance des attaques pouvant avoir un effet secondaire. L'effet secondaire est annul�."} );
    public static Talent telepathe = new Talent ( new String[] {"T�l�pathe","Telepathy","Anticipe et �vite les attaques des alli�s en combat double ou triple."} );
    public static Talent tension = new Talent ( new String[] {"Tension","Unnerve","Emp�che l'adversaire de consommer sa baie."} );
    public static Talent teravoltage = new Talent ( new String[] {"T�ra-Voltage","Teravolt","Peut toucher un Pok�mon adverse malgr� son talent."} );
    public static Talent toxitouche = new Talent ( new String[] {"Toxitouche","Poison Touch","Peut empoisonner l'adversaire apr�s lui avoir port� une attaque physique."} );
    public static Talent turbobrasier = new Talent ( new String[] {"TurboBrasier","Turboblaze","Peut toucher un Pok�mon adverse malgr� son talent."} );
    public static Talent victorieux = new Talent ( new String[] {"Victorieux","Victory Star","Monte de 10% la pr�cision des alli�s en combat double ou triple."} );
    public static Talent ailesbourrasque = new Talent ( new String[] {"Ailes Bourrasque","Gale Wings","Augmente la priorit� des capacit�s de type vol."} );
    public static Talent amourfilial = new Talent ( new String[] {"Amour Filial","Parental Bond","Permet au lanceur de porter deux coups par tour au lieu d'un."} );
    public static Talent aromavoile = new Talent ( new String[] {"Aroma-Voile","Aroma Veil","Prot�ge les Pok�mon alli�s des capacit�s ayant un effet sur l'�tat mental tels que Attraction ou Tourmente."} );
    public static Talent aurafeerique = new Talent ( new String[] {"Aura F��rique","Fairy Aura","Augmente la puissance des attaques de type f�e des Pok�mon pr�sents sur le terrain."} );
    public static Talent aurainversee = new Talent ( new String[] {"Aura Invers�e","Aura Break","Inverse les effets des talents Aura."} );
    public static Talent auratenebreuse = new Talent ( new String[] {"Aura T�n�breuse","Dark Aura","Augmente la puissance des attaques de type t�n�bres des Pok�mon pr�sents sur le terrain."} );
    public static Talent bajoues = new Talent ( new String[] {"Bajoues","Cheek Pouch","Lorsque le Pok�mon mange une Baie, il obtient ses effets et regagne des PV en plus."} );
    public static Talent battant = new Talent ( new String[] {"Battant","Competitive","Augmente l'Attaque Sp�ciale par deux niveaux lorsque n'importe quelle stat est baiss�e par un Pok�mon adverse."} );
    public static Talent declictactique = new Talent ( new String[] {"D�clic Tactique","Stance Change","Change la forme du Pok�mon selon le combat."} );
    public static Talent floravoile = new Talent ( new String[] {"Flora-Voile","Flower Veil","Emp�che la diminution des statistiques des alli�s de type plante par les Pok�mon adverses."} );
    public static Talent glucovoile = new Talent ( new String[] {"Gluco-Voile","Sweet Veil","Emp�che les Pok�mon alli�s de s'endormir."} );
    public static Talent griffedure = new Talent ( new String[] {"Griffe Dure","Tough Claws","Augmente d'un tiers la puissance des attaques directes."} );
    public static Talent magicien = new Talent ( new String[] {"Magicien","Magician","Vole l'objet d'une cible apr�s l'avoir touch� avec une attaque directe."} );
    public static Talent megablaster = new Talent ( new String[] {"M�ga Blaster","Mega Launcher","Un Pok�mon dot� de ce talent verra la puissance de ses capacit�s d'aura augment�e."} );
    public static Talent pareballes = new Talent ( new String[] {"Pare-Balles","Bulletproof","Prot�ge contre les capacit�s balles et bombes, par exemple Balle Graine ou Canon Graine."} );
    public static Talent peauceleste = new Talent ( new String[] {"Peau C�leste","Aerilate","Transforme les capacit�s de type normal en type vol."} );
    public static Talent peaufeerique = new Talent ( new String[] {"Peau F��rique","Pixilate","Transforme les capacit�s de type normal en type f�e."} );
    public static Talent peaugelee = new Talent ( new String[] {"Peau Gel�e","Refrigerate","Transforme les capacit�s de type normal en type glace."} );
    public static Talent poisseux = new Talent ( new String[] {"Poisseux","Gooey","Baisse la Vitesse des Pok�mon qui touchent ce Pok�mon avec une attaque directe."} );
    public static Talent prognathe = new Talent ( new String[] {"Prognathe","Strong Jaw","Augmente la puissance des attaques � base de morsures."} );
    public static Talent proteen = new Talent ( new String[] {"Prot�en","Protean","Change le type du Pok�mon en celui de toute capacit� qu'il utilise."} );
    public static Talent symbiose = new Talent ( new String[] {"Symbiose","Symbiosis","Passe un objet tenu � un Pok�mon alli� lorsque l'alli� utilise son objet."} );
    public static Talent toisonepaisse = new Talent ( new String[] {"Toison �paisse","Fur Coat","Divise par deux les d�g�ts re�us lors d'une attaque physique."} );
    public static Talent toisonherbue = new Talent ( new String[] {"Toison Herbue","Grass Pelt","Augmente la D�fense lorsque Champ Herbu est en vigueur."} );
    public static Talent zero = new Talent( new String[] {".",".","."});
    public static Talent[] listeTalents = new Talent[] {absenteisme,absorbeau,absorbvolt,agitation,airlock,antibruit,armumagma,armurbaston,attention,benet,boomfinal,brasier,cacophonie,calque,chanceux,chlorophylle,cielgris,coloforce,coquearmure,corpsardent,corpssain,crachin,cran,cuvette,deguisement,ecaillespeciale,echauffement,ecranfumee,ecranpoudre,engrais,espritvital,essaim,fermete,forcepure,fuite,gardemystik,glissade,glue,hypercutter,ignifuvoile,insomnia,intimidation,isograisse,jolisourire,levitation,lumiattirance,magnepiege,marqueombre,matinal,medicnature,meteo,minus,moiteur,mue,oeilcompose,paratonnerre,peaudure,piege,plus,pointpoison,posespore,pression,puanteur,ramassage,regardvif,sablevolant,secheresse,serenite,statik,suintement,synchro,tempoperso,tetederoc,torche,torrent,turbo,vaccin,ventouse,voilesable,adaptabilite,alerteneige,annulegarde,anticipation,brisemoule,cherchemiel,colerique,corpsgel,debutcalme,delestage,donfloral,feuillegarde,filtre,forcesoleil,fouille,frein,gardemagik,gloutonnerie,hydratation,ignifuge,impassible,inconscient,lavabo,lentiteintee,maladresse,mauvaisreve,motorise,multicoups,multitype,normalise,peauseche,piedconfus,piedveloce,poingdefer,prediction,querelleur,rideauneige,rivalite,simple,sniper,soinpoison,solideroc,technicien,telecharge,temeraire,acharne,analyste,armurouillee,baignesable,coeurdecoq,coeurnoble,coeursoin,contestation,corpsmaudit,defaitiste,envelocape,epinedefer,farceur,forcesable,gardeamie,heavymetal,herbivore,illusion,imposteur,impudence,infiltration,lightmetal,lunatique,miroirmagik,modetranse,momie,multiecaille,peaumiracle,phobique,pickpocket,ragebrulure,ragepoison,recolte,regeforce,sanslimite,telepathe,tension,teravoltage,toxitouche,turbobrasier,victorieux,ailesbourrasque,amourfilial,aromavoile,aurafeerique,aurainversee,auratenebreuse,bajoues,battant,declictactique,floravoile,glucovoile,griffedure,magicien,megablaster,pareballes,peauceleste,peaufeerique,peaugelee,poisseux,prognathe,proteen,symbiose,toisonepaisse,toisonherbue,zero};

    public String _fr;
    public String _en;
    public String _description;
    
    public static void main (String[] args){
        Talent absenteisme = new Talent (new String[] {"Absent�isme","Truant","Le Pok�mon n'attaque qu'un tour sur deux."});
        System.out.println(absenteisme.toString());
        
    }

}
