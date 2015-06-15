
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
    public static Talent absenteisme = new Talent (new String[] {"Absenteisme","Truant","Le Pokemon n'attaque qu'un tour sur deux."});
    public static Talent absorbeau = new Talent ( new String[] {"Absorb Eau","Water Absorb","Les attaques de type eau recues par le Pokemon regenerent 1/4 de ses PV."} );
    public static Talent absorbvolt = new Talent ( new String[] {"Absorb Volt","Volt Absorb","Les attaques de type electrique recues par le Pokemon regenerent 1/4 de ses PV."} );
    public static Talent agitation = new Talent ( new String[] {"Agitation","Hustle","Augmente l'attaque de 50% mais baisse la precision de 20%.  Augmente de 50% les chances de rencontrer un Pokemon sauvage de haut niveau."} );
    public static Talent airlock = new Talent ( new String[] {"Air Lock","Air Lock","Annule les effets du climat."} );
    public static Talent antibruit = new Talent ( new String[] {"Anti-Bruit","Soundproof","Annule les effets dus a une attaque sonore."} );
    public static Talent armumagma = new Talent ( new String[] {"Armumagma","Magma Armor","Immunise contre le gel. Divise par deux le nombre de pas necessaire a l'eclosion d'un oeuf."} );
    public static Talent armurbaston = new Talent ( new String[] {"Armurbaston","Battle Armor","Annule les chances de coups critiques du Pokemon ennemi."} );
    public static Talent attention = new Talent ( new String[] {"Attention","Inner Focus","Immunise contre la peur."} );
    public static Talent benet = new Talent ( new String[] {"Benet","Oblivious","Immunise contre le charme. A partir de la 6eme generation, ce talent immunise aussi contre la provocation."} );
    public static Talent boomfinal = new Talent ( new String[] {"Boom Final","Aftermath","Enleve 1/4 des PV totaux du Pokemon ennemi mettant K. O. par contact."} );
    public static Talent brasier = new Talent ( new String[] {"Brasier","Blaze","Augmente la puissance des attaques de type Feu de 50% lorsque le Pokemon a moins d'1/3 de ses PV totaux."} );
    public static Talent cacophonie = new Talent ( new String[] {"Cacophonie","Cacophony","Annule les effets dus a une attaque sonore."} );
    public static Talent calque = new Talent ( new String[] {"Calque","Trace","Copie le talent du Pokemon adverse."} );
    public static Talent chanceux = new Talent ( new String[] {"Chanceux","Super Luck","Double les chance de porter un coup critique."});
    public static Talent chlorophylle = new Talent ( new String[] {"Chlorophylle","Chlorophyll","Augmente la vitesse au soleil."} );
    public static Talent cielgris = new Talent ( new String[] {"Ciel Gris","Cloud Nine","Annule les effets du climat."} );
    public static Talent coloforce = new Talent ( new String[] {"Coloforce","Huge Power","Double l'attaque du Pokemon."} );
    public static Talent coquearmure = new Talent ( new String[] {"Coque Armure","Shell Armor","Annule les chances de coups critiques du Pokemon ennemi."} );
    public static Talent corpsardent = new Talent ( new String[] {"Corps Ardent","Flame Body","30% de chance de provoquer une brulure sur le Pokemon adverse ayant attaque. Divise par deux le nombre de pas necessaire a l'eclosion d'un oeuf."} );
    public static Talent corpssain = new Talent ( new String[] {"Corps Sain","Clear Body","Empeche la diminution de statistiques par le Pokemon adverse."} );
    public static Talent crachin = new Talent ( new String[] {"Crachin","Drizzle","Fait tomber la pluie tant que le Pokemon est en jeu."} );
    public static Talent cran = new Talent ( new String[] {"Cran","Guts","Augmente de 50% l'attaque du Pokemon s'il subit un changement de statut."} );
    public static Talent cuvette = new Talent ( new String[] {"Cuvette","Rain Dish","Regenere 1/16eme des PV par temps de pluie."} );
    public static Talent deguisement = new Talent ( new String[] {"Deguisement","Color Change","Change le type du Pokemon en celui de la derniere attaque subie."} );
    public static Talent ecaillespeciale = new Talent ( new String[] {"Ecaille speciale","Marvel Scale","Augmente la defense de 50% lorsque le Pokemon subit un changement de statut."} );
    public static Talent echauffement = new Talent ( new String[] {"Echauffement","Limber","Immunise contre la paralysie."} );
    public static Talent ecranfumee = new Talent ( new String[] {"Ecran Fumee","White Smoke","Empeche la diminution de statistiques par le Pokemon adverse. Reduit de 50% les chances d'etre attaque par un Pokemon sauvage."} );
    public static Talent ecranpoudre = new Talent ( new String[] {"Ecran Poudre","Shield Dust","Empeche les effets secondaires des attaques subies."} );
    public static Talent engrais = new Talent ( new String[] {"Engrais","Overgrow","Augmente la puissance des attaques de type Plante de 50% lorsque le Pokemon a moins d'1/3 de ses PV totaux."} );
    public static Talent espritvital = new Talent ( new String[] {"Esprit Vital","Vital Spirit","Empeche le Pokemon d'etre endormi. Augmente de 50% les chances de rencontrer un Pokemon sauvage de haut niveau."} );
    public static Talent essaim = new Talent ( new String[] {"Essaim","Swarm","Augmente la puissance des attaques de type Insecte de 50% lorsque le Pokemon a moins d'1/3 de ses PV totaux. Augmente les chances d'entendre le cri d'un Pokemon sauvage."} );
    public static Talent fermete = new Talent ( new String[] {"Fermete","Sturdy","Immunise contre les attaques OHKO. a partir de la 5eme generation, ce talent fait aussi conserver 1 PV au Pokemon meme apres une attaque qui aurait du le terrasser, s'il a tous ses PV."} );
    public static Talent forcepure = new Talent ( new String[] {"Force Pure","Pure Power","Double l'attaque du Pokemon."} );
    public static Talent fuite = new Talent ( new String[] {"Fuite","Run Away","Assure la fuite contre les Pokemon sauvages."} );
    public static Talent gardemystik = new Talent ( new String[] {"Garde Mystik","Wonder Guard","Ne subit que les degats d'attaques super efficaces."} );
    public static Talent glissade = new Talent ( new String[] {"Glissade","Swift Swim","Double la vitesse par temps de pluie."} );
    public static Talent glue = new Talent ( new String[] {"Glue","Sticky Hold","Empeche la perte de l'objet tenu. Facilite la capture des Pokemon peches."} );
    public static Talent hypercutter = new Talent ( new String[] {"Hyper Cutter","Hyper Cutter","Empeche la diminution d'attaque du Pokemon."} );
    public static Talent ignifuvoile = new Talent ( new String[] {"Ignifu-Voile","Water Veil","Immunise contre la brulure."} );
    public static Talent insomnia = new Talent ( new String[] {"Insomnia","Insomnia","Empeche le Pokemon d'etre endormi."} );
    public static Talent intimidation = new Talent ( new String[] {"Intimidation","Intimidate","Diminue d'un niveau l'attaque du Pokemon adverse. Reduit de 50% les chances d'etre attaque par un Pokemon sauvage de bas niveau."} );
    public static Talent isograisse = new Talent ( new String[] {"Isograisse","Thick Fat","Les degats provoques par les attaques des types Feu ou Glace sont divises par 2."} );
    public static Talent jolisourire = new Talent ( new String[] {"Joli Sourire","Cute Charm","A 30% de chance de provoquer l'attirance du Pokemon adverse ayant attaque. Augmente de 50% les chances d'etre attaque par un Pokemon sauvage du sexe oppose."} );
    public static Talent levitation = new Talent ( new String[] {"Levitation","Levitate","Immunise contre les attaques de type Sol."} );
    public static Talent lumiattirance = new Talent ( new String[] {"Lumiattirance","Illuminate","Augmente les chances de rencontrer des Pokemon sauvages. RS"} );
    public static Talent magnepiege = new Talent ( new String[] {"Magnepiege","Magnet Pull","Empeche la fuite et le changement des Pokemon de type Acier. Augmente de 50% les chances de rencontrer un Pokemon sauvage de type acier."} );
    public static Talent marqueombre = new Talent ( new String[] {"Marque Ombre","Shadow Tag","Empeche la fuite des Pokemon sauvage et le changement du Pokemon adverse."} );
    public static Talent matinal = new Talent ( new String[] {"Matinal","Early Bird","Reduit le nombre de tours de sommeil du Pokemon."} );
    public static Talent medicnature = new Talent ( new String[] {"Medic Nature","Natural Cure","Le Pokemon est soigne de toute alteration d'etat lorsqu'il est change ou en fin de combat."} );
    public static Talent meteo = new Talent ( new String[] {"Meteo","Forecast","Change le type et la forme du Pokemon selon le climat."} );
    public static Talent minus = new Talent ( new String[] {"Minus","Minus","Augmente l'attaque speciale de 50% en match double, si le partenaire a le talent Plus."} );
    public static Talent moiteur = new Talent ( new String[] {"Moiteur","Damp","Empeche l'utilisation d'attaques auto-destructrices par le Pokemon adverse."} );
    public static Talent mue = new Talent ( new String[] {"Mue","Shed Skin","a chaque tour, le Pokemon a 33% de chance d'etre soigne d'une alteration d'etat."} );
    public static Talent oeilcompose = new Talent ( new String[] {"oeil Compose","Compoundeye","Double la precision du Pokemon. Augmente les chances de rencontrer un Pokemon sauvage tenant un objet."} );
    public static Talent paratonnerre = new Talent ( new String[] {"Paratonnerre","Lightningrod","Attire toutes les attaques de type electrique. a partir de la 5eme generation, ce talent augmente aussi l'attaque speciale du Pokemon recevant l'attaque. Augmente les chances de recevoir un appel sur le PokeNav."} );
    public static Talent peaudure = new Talent ( new String[] {"Peau Dure","Rough Skin","Fait perdre 1/16e des PV du Pokemon adverse ayant lance une attaque de contact."} );
    public static Talent piege = new Talent ( new String[] {"Piege","Arena Trap","Empeche la fuite et le changement du Pokemon adverse, s'il est au sol. Augmente de 50% les chances d'etre attaque par un Pokemon sauvage."} );
    public static Talent plus = new Talent ( new String[] {"Plus","Plus","Augmente l'attaque speciale de 50% en match double, si le partenaire a le talent Minus."} );
    public static Talent pointpoison = new Talent ( new String[] {"Point Poison","Poison Point","30% de chance de provoquer l'empoisonnement du Pokemon adverse ayant lance une attaque de contact."} );
    public static Talent posespore = new Talent ( new String[] {"Pose Spore","Effect Spore","30% de chance de provoquer l'empoisonnement, le sommeil ou la paralysie du Pokemon adverse ayant lance une attaque de contact."} );
    public static Talent pression = new Talent ( new String[] {"Pression","Pressure","Double l'utilisation de PP des attaques offensives du Pokemon adverse. Augmente de 50% les chances d'etre attaque par un Pokemon sauvage."} );
    public static Talent puanteur = new Talent ( new String[] {"Puanteur","Stench","Les attaques physiques ont 10% d'apeurer la cible. Uniquement a partir de la 5eme generation. Diminue les chances de rencontrer des Pokemon sauvages."} );
    public static Talent ramassage = new Talent ( new String[] {"Ramassage","Pickup","Donne une chance au Pokemon de ramasser un objet apres un combat."} );
    public static Talent regardvif = new Talent ( new String[] {"Regard Vif","Keen Eye","Empeche la perte de precision. Reduit de 50% les chances d'etre attaque par un Pokemon sauvage de bas niveau."} );
    public static Talent sablevolant = new Talent ( new String[] {"Sable Volant","Sand Stream","Declenche une tempete de sable tant que le Pokemon est en jeu."} );
    public static Talent secheresse = new Talent ( new String[] {"Secheresse","Drought","Cree un temps ensoleille tant que le Pokemon est en jeu."} );
    public static Talent serenite = new Talent ( new String[] {"Serenite","Serene Grace","Double les chances de reussite des effets secondaires des attaques."} );
    public static Talent statik = new Talent ( new String[] {"Statik","Static","30% de chance de provoquer la paralysie du Pokemon adverse ayant lance une attaque de contact. Augmente de 50% les chances de rencontrer un Pokemon sauvage de type electrique."} );
    public static Talent suintement = new Talent ( new String[] {"Suintement","Liquid Ooze","Les attaques absorbantes du Pokemon adverse lui font perdre des PV."} );
    public static Talent synchro = new Talent ( new String[] {"Synchro","Synchronize","Toute alteration d'etat subie est transmise au Pokemon adverse. Augmente les chances de rencontrer un Pokemon sauvage ayant la meme nature."} );
    public static Talent tempoperso = new Talent ( new String[] {"Tempo Perso","Own Tempo","Immunise contre la confusion."} );
    public static Talent tetederoc = new Talent ( new String[] {"Tete de Roc","Rock Head","Le Pokemon ne subit pas de degats de contrecoup."} );
    public static Talent torche = new Talent ( new String[] {"Torche","Flash Fire","Annule les degats des attaques de type Feu subies et augmente de 50% la puissance des attaques de type Feu lancees."} );
    public static Talent torrent = new Talent ( new String[] {"Torrent","Torrent","Augmente la puissance des attaques de type Eau de 50% lorsque le Pokemon a moins d'1/3 de ses PV totaux."} );
    public static Talent turbo = new Talent ( new String[] {"Turbo","Speed Boost","La vitesse du Pokemon augmente a chaque tour."} );
    public static Talent vaccin = new Talent ( new String[] {"Vaccin","Immunity","Immunise contre l'empoisonnement."} );
    public static Talent ventouse = new Talent ( new String[] {"Ventouse","Suction Cups","Empeche d'etre change de force par une attaque adverse. Augmente les chances qu'un Pokemon peche morde a l'hameeon."} );
    public static Talent voilesable = new Talent ( new String[] {"Voile Sable","Sand Veil","Augmente l'esquive de 20% lors d'une tempete de sable et immunise contre ses degats. Reduit de 50% les chances d'etre attaque par un Pokemon sauvage lors d'une tempete de sable."} );
    public static Talent adaptabilite = new Talent ( new String[] {"Adaptabilite","Adaptability","STAB : Si ce Pokemon utilise une attaque de son type, la puissance de l'attaque est multipliee par 2 au lieu de 1. 5."} );
    public static Talent alerteneige = new Talent ( new String[] {"Alerte Neige","Snow Warning","Le Pokemon declenche une grele lorsqu'il est envoye au combat."} );
    public static Talent annulegarde = new Talent ( new String[] {"Annule Garde","No Guard","Toutes les attaques du Pokemon et de son adversaire ont une precision de 100%. Augmente les chances de rencontrer un Pokemon sauvage."} );
    public static Talent anticipation = new Talent ( new String[] {"Anticipation","Anticipation","Alerte et protege lorsque le Pokemon adverse possede certaines attaques."} );
    public static Talent brisemoule = new Talent ( new String[] {"Brise Moule","Mold Breaker","Peut toucher un Pokemon adverse malgre son talent."} );
    public static Talent cherchemiel = new Talent ( new String[] {"Cherche Miel","Honey Gather","Le Pokemon peut trouver du Miel apres un combat."} );
    public static Talent colerique = new Talent ( new String[] {"Colerique","Anger Point","L'attaque du Pokemon est fortement augmentee lorsqu'il subit un coup critique."} );
    public static Talent corpsgel = new Talent ( new String[] {"Corps Gel","Ice Body","Regenere 1/16eme des PV par temps de grele. Immunise les Pokemon n'ayant pas le type glace contre la grele."} );
    public static Talent debutcalme = new Talent ( new String[] {"Debut Calme","Slow Start","Divise par deux l'attaque et la vitesse du Pokemon pendant 5 tours."} );
    public static Talent delestage = new Talent ( new String[] {"Delestage","Unburden","Augmente la vitesse lorsqu'un objet tenu est utilise, lance ou perdu."} );
    public static Talent donfloral = new Talent ( new String[] {"Don Floral","Flower Gift","Augmente l'attaque et la defense speciale de 50% par temps ensoleille."} );
    public static Talent feuillegarde = new Talent ( new String[] {"Feuille Garde","Leaf Guard","Soigne les alterations d'etat par temps ensoleille."} );
    public static Talent filtre = new Talent ( new String[] {"Filtre","Filter","Retire 1/4 des degats subits lors d'une attaque super efficace."} );
    public static Talent forcesoleil = new Talent ( new String[] {"Force Soleil","Solar Power","Augmente l'attaque speciale de 50% par temps ensoleille, mais diminue les PV de 1/8eme par tour."} );
    public static Talent fouille = new Talent ( new String[] {"Fouille","Frisk","Permet de connaitre l'objet tenu d'un Pokemon adverse."} );
    public static Talent frein = new Talent ( new String[] {"Frein","Stall","Le Pokemon attaque toujours en second pour deux attaques de meme priorite."} );
    public static Talent gardemagik = new Talent ( new String[] {"Garde Magik","Magic Guard","Le Pokemon ne subit de degats que lors d'attaques directes."} );
    public static Talent gloutonnerie = new Talent ( new String[] {"Gloutonnerie","Gluttony","Le Pokemon utilise la baie portee lorsque les PV descendent en dessous de 50%."} );
    public static Talent hydratation = new Talent ( new String[] {"Hydratation","Hydration","Soigne les alterations d'etat par temps de pluie."} );
    public static Talent ignifuge = new Talent ( new String[] {"Ignifuge","Heatproof","Divise par 2 les degats des attaques de type feu et les effets de brulure subis par le Pokemon."} );
    public static Talent impassible = new Talent ( new String[] {"Impassible","Steadfast","Augmente d'un niveau la vitesse du Pokemon lorsqu'il est apeure."} );
    public static Talent inconscient = new Talent ( new String[] {"Inconscient","Unaware","Ignore les ameliorations de statistiques du Pokemon adverse, a l'exception de sa Vitesse."} );
    public static Talent lavabo = new Talent ( new String[] {"Lavabo","Storm Drain","Attire toutes les attaques de type eau. a partir de la 5eme generation, ce talent augmente aussi l'attaque speciale du Pokemon recevant l'attaque."} );
    public static Talent lentiteintee = new Talent ( new String[] {"Lentiteintee","Tinted Lens","Double les degats des attaques peu efficaces portees au Pokemon adverse."} );
    public static Talent maladresse = new Talent ( new String[] {"Maladresse","Klutz","Empeche l'utilisation et/ou ignore l'effet des objets tenus en combat."} );
    public static Talent mauvaisreve = new Talent ( new String[] {"Mauvais Reve","Bad Dreams","Fait perdre 1/8eme de ses PV au Pokemon adverse s'il est endormi."} );
    public static Talent motorise = new Talent ( new String[] {"Motorise","Motor Drive","Immunise le Pokemon contre les attaques de type electrique et augmente la vitesse du Pokemon d'un niveau par attaque electrique subie."} );
    public static Talent multicoups = new Talent ( new String[] {"Multi-Coups","Skill Link","Utilise toujours le nombre de coups maximum d'une attaque."}  );
    public static Talent multitype = new Talent ( new String[] {"Multitype","Multitype","Le type et la forme du Pokemon changent en fonction de la plaque qu'il porte."} );
    public static Talent normalise = new Talent ( new String[] {"Normalise","Normalize","Toutes les attaques du Pokemon sont considerees comme etant de type Normal."} );
    public static Talent peauseche = new Talent ( new String[] {"Peau Seche","Dry Skin","Les attaques de type eau soignent le Pokemon, qui regagne 1/4 de ses PV totaux.  Par temps de pluie, il gagne 1/8eme de ses PV par tour.  Les attaques de type feu infligent 25% de degats en plus.  Par temps ensoleille, il perd 1/8eme de ses PV par tour."} );
    public static Talent piedconfus = new Talent ( new String[] {"Pied Confus","Tangled Feet","Augmente l'esquive de 20% lorsque le Pokemon est confus."} );
    public static Talent piedveloce = new Talent ( new String[] {"Pied Veloce","Quick Feet","Augmente la vitesse de 50% lorsque le Pokemon subit une alteration d'etat."} );
    public static Talent poingdefer = new Talent ( new String[] {"Poing de Fer","Iron Fist","Augmente de 20% la puissance des attaques de Poing."} );
    public static Talent prediction = new Talent ( new String[] {"Prediction","Forewarn","Alerte le Pokemon de l'attaque la plus puissante du Pokemon adverse."} );
    public static Talent querelleur = new Talent ( new String[] {"Querelleur","Scrappy","Permet de toucher les Pokemon de type Spectre avec des attaques de type Normal ou Combat."} );
    public static Talent rideauneige = new Talent ( new String[] {"Rideau Neige","Snow Cloak","Augmente l'esquive de 20% par temps de grele. Immunise les Pokemon n'ayant pas le type glace contre la grele."} );
    public static Talent rivalite = new Talent ( new String[] {"Rivalite","Rivalry","Augmente l'attaque et l'attaque speciale de 25% si le Pokemon adverse est de meme sexe. Les diminue s'il est de sexe oppose."} );
    public static Talent simple = new Talent ( new String[] {"Simple","Simple","Double les effets des modifications de statistiques, positives ou negatives."} );
    public static Talent sniper = new Talent ( new String[] {"Sniper","Sniper","Triple la puissance des coups critiques."} );
    public static Talent soinpoison = new Talent ( new String[] {"Soin Poison","Poison Heal","Le Pokemon recupere 1/8e de ses PV par tour lors d'un empoisonnement. Le Pokemon empoisonne perd tout de meme ses PV lorsque son dresseur se deplace. Cette perte de PV n'a plus lieu a partir de la 5eme generation."} );
    public static Talent solideroc = new Talent ( new String[] {"Solide Roc","Solid Rock","Retire 1/4 des degats subits si le Pokemon reeoit une attaque super efficace."} );
    public static Talent technicien = new Talent ( new String[] {"Technicien","Technician","Augmente de 50% la puissance des attaques dont la puissance est inferieure ou egale a 60."} );
    public static Talent telecharge = new Talent ( new String[] {"Telecharge","Download","Augmente l'attaque ou l'attaque speciale du Pokemon, selon la statistique de defense la plus faible du Pokemon adverse."} );
    public static Talent temeraire = new Talent ( new String[] {"Temeraire","Reckless","Augmente de 20% la puissance des attaques infligeant des degats de recul."} );
    public static Talent acharne = new Talent ( new String[] {"Acharne","Defiant","Monte l'Attaque du Pokemon de deux niveau si l'une de ses statistiques est baissee par l'adversaire."} );
    public static Talent analyste = new Talent ( new String[] {"Analyste","Analytic","Si le Pokemon frappe en dernier durant le tour, la puissance de son attaque est augmentee de 30%."} );
    public static Talent armurouillee = new Talent ( new String[] {"Armurouillee","Weak Armor","Le Pokemon touche par une attaque physique voit sa defense diminuer d'un niveau et sa vitesse augmenter d'un niveau."}  );
    public static Talent baignesable = new Talent ( new String[] {"Baigne Sable","Sand Rush","Double la Vitesse du Pokemon lors d'une tempete de sable. Immunise contre les degats de la tempete."} );
    public static Talent coeurdecoq = new Talent ( new String[] {"Coeur de Coq","Big Pecks","Empeche la defense du Pokemon d'etre baissee par les attaques adverses."} );
    public static Talent coeurnoble = new Talent ( new String[] {"Coeur Noble","Justified","Si le Pokemon est touche par une attaque de type tenebres, son attaque augmente d'un niveau."} );
    public static Talent coeursoin = new Talent ( new String[] {"Coeur Soin","Healer","A la fin de chaque tour, le Pokemon a 30% de chance de guerir ses allies d'une alteration d'etat en combat double ou triple."} );
    public static Talent contestation = new Talent ( new String[] {"Contestation","Contrary","Inverse les effets des attaques modifiant les statistiques."} );
    public static Talent corpsmaudit = new Talent ( new String[] {"Corps Maudit","Cursed Body","Toute attaque portee par l'adversaire a 30% de chance de s'entraver."} );
    public static Talent defaitiste = new Talent ( new String[] {"Defaitiste","Defeatist","Divise par deux l'attaque et l'attaque speciale du Pokemon s'il a moins de la moitie de ses PV totaux."} );
    public static Talent envelocape = new Talent ( new String[] {"Envelocape","Overcoat","Immunise contre les degats causes par la grele et les tempetes de sable."} );
    public static Talent epinedefer = new Talent ( new String[] {"Epine de Fer","Iron Barbs","Retire 1/8eme de ses PV a l'adversaire lorsque celui-ci porte une attaque physique."} );
    public static Talent farceur = new Talent ( new String[] {"Farceur","Prankster","Augmente la priorite des attaques de statut d'un niveau."} );
    public static Talent forcesable = new Talent ( new String[] {"Force Sable","Sand Force","Lors d'une tempete de sable, la puissance des attaques de type acier, roche et sol augmente de 30 %."} );
    public static Talent gardeamie = new Talent ( new String[] {"Garde Amie","Friend Guard","Reduire de 25% les degats infliges aux allies en combat double ou triple."} );
    public static Talent heavymetal = new Talent ( new String[] {"Heavy Metal","Heavy Metal","Double la masse du Pokemon."} );
    public static Talent herbivore = new Talent ( new String[] {"Herbivore","Sap Sipper","Si le Pokemon est touche par une attaque de type plante, son attaque augmente d'un niveau."} );
    public static Talent illusion = new Talent ( new String[] {"Illusion","Illusion","Lorsqu'il entre en combat, le Pokemon prend l'apparence du dernier Pokemon de l'equipe."} );
    public static Talent imposteur = new Talent ( new String[] {"Imposteur","Imposter","Le Pokemon entrant en combat prend automatiquement l'apparence du Pokemon adverse."} );
    public static Talent impudence = new Talent ( new String[] {"Impudence","Moxie","Monte l'attaque du Pokemon d'un niveau lorsqu'il met un adversaire K. O."} );
    public static Talent infiltration = new Talent ( new String[] {"Infiltration","Infiltrator","Empeche les attaques de protection adverses tels que Protection ou Mur Lumiere de fonctionner. N'influe pas sur Detection et Abri."} );
    public static Talent lightmetal = new Talent ( new String[] {"Light Metal","Light Metal","Divise par deux la masse du Pokemon."} );
    public static Talent lunatique = new Talent ( new String[] {"Lunatique","Moody","Aleatoirement, a la fin de chaque tour, une statistique du Pokemon augmente de deux niveaux, et une autre baisse d'un niveau (precision et esquive comprises)."} );
    public static Talent miroirmagik = new Talent ( new String[] {"Miroir Magik","Magic Bounce","Retourne les attaques de statut contre l'adversaire."} );
    public static Talent modetranse = new Talent ( new String[] {"Mode Transe","Zen Mode","Le Pokemon change de forme et modifie la repartition de ses statistiques lorsque ses PV sont inferieurs a 50%."} );
    public static Talent momie = new Talent ( new String[] {"Momie","Mummy","Si le Pokemon subit une attaque de contact, le talent de l'adversaire devient Momie. Ce talent est sans effet en elle-meme."} );
    public static Talent multiecaille = new Talent ( new String[] {"Multiecaille","Multiscale","Si le Pokemon possede 100% de ses PV, alors les degats infliges par l'adversaire sont divises par deux."} );
    public static Talent peaumiracle = new Talent ( new String[] {"Peau Miracle","Wonder Skin","50% de chance de faire echouer les attaques de statut portees par l'adversaire."} );
    public static Talent phobique = new Talent ( new String[] {"Phobique","Rattled","Si le Pokemon est touche par une attaque de type insecte, spectre ou tenebres, sa vitesse augmente d'un niveau."} );
    public static Talent pickpocket = new Talent ( new String[] {"Pickpocket","Pickpocket","Si le Pokemon subit une attaque physique, il recupere l'objet tenu par son adversaire."} );
    public static Talent ragebrulure = new Talent ( new String[] {"Rage brulure","Flare Boost","Augmente l'attaque speciale du Pokemon de 50% en cas de brulure."} );
    public static Talent ragepoison = new Talent ( new String[] {"Rage Poison","Toxic Boost","Augmente l'attaque du Pokemon de 50% en cas d'empoisonnement."} );
    public static Talent recolte = new Talent ( new String[] {"Recolte","Harvest","Une baie consommee par le Pokemon a 50% de chances d'etre recuperee a la fin de chaque tour."} );
    public static Talent regeforce = new Talent ( new String[] {"Rege-Force","Regenerator","Restaure 1/3 des PV totaux si le Pokemon est retire du combat."} );
    public static Talent sanslimite = new Talent ( new String[] {"Sans Limite","Sheer Force","Augmente de 30% la puissance des attaques pouvant avoir un effet secondaire. L'effet secondaire est annule."} );
    public static Talent telepathe = new Talent ( new String[] {"Telepathe","Telepathy","Anticipe et evite les attaques des allies en combat double ou triple."} );
    public static Talent tension = new Talent ( new String[] {"Tension","Unnerve","Empeche l'adversaire de consommer sa baie."} );
    public static Talent teravoltage = new Talent ( new String[] {"Tera-Voltage","Teravolt","Peut toucher un Pokemon adverse malgre son talent."} );
    public static Talent toxitouche = new Talent ( new String[] {"Toxitouche","Poison Touch","Peut empoisonner l'adversaire apres lui avoir porte une attaque physique."} );
    public static Talent turbobrasier = new Talent ( new String[] {"TurboBrasier","Turboblaze","Peut toucher un Pokemon adverse malgre son talent."} );
    public static Talent victorieux = new Talent ( new String[] {"Victorieux","Victory Star","Monte de 10% la precision des allies en combat double ou triple."} );
    public static Talent ailesbourrasque = new Talent ( new String[] {"Ailes Bourrasque","Gale Wings","Augmente la priorite des capacites de type vol."} );
    public static Talent amourfilial = new Talent ( new String[] {"Amour Filial","Parental Bond","Permet au lanceur de porter deux coups par tour au lieu d'un."} );
    public static Talent aromavoile = new Talent ( new String[] {"Aroma-Voile","Aroma Veil","Protege les Pokemon allies des capacites ayant un effet sur l'etat mental tels que Attraction ou Tourmente."} );
    public static Talent aurafeerique = new Talent ( new String[] {"Aura Feerique","Fairy Aura","Augmente la puissance des attaques de type fee des Pokemon presents sur le terrain."} );
    public static Talent aurainversee = new Talent ( new String[] {"Aura Inversee","Aura Break","Inverse les effets des talents Aura."} );
    public static Talent auratenebreuse = new Talent ( new String[] {"Aura Tenebreuse","Dark Aura","Augmente la puissance des attaques de type tenebres des Pokemon presents sur le terrain."} );
    public static Talent bajoues = new Talent ( new String[] {"Bajoues","Cheek Pouch","Lorsque le Pokemon mange une Baie, il obtient ses effets et regagne des PV en plus."} );
    public static Talent battant = new Talent ( new String[] {"Battant","Competitive","Augmente l'Attaque speciale par deux niveaux lorsque n'importe quelle stat est baissee par un Pokemon adverse."} );
    public static Talent declictactique = new Talent ( new String[] {"Declic Tactique","Stance Change","Change la forme du Pokemon selon le combat."} );
    public static Talent floravoile = new Talent ( new String[] {"Flora-Voile","Flower Veil","Empeche la diminution des statistiques des allies de type plante par les Pokemon adverses."} );
    public static Talent glucovoile = new Talent ( new String[] {"Gluco-Voile","Sweet Veil","Empeche les Pokemon allies de s'endormir."} );
    public static Talent griffedure = new Talent ( new String[] {"Griffe Dure","Tough Claws","Augmente d'un tiers la puissance des attaques directes."} );
    public static Talent magicien = new Talent ( new String[] {"Magicien","Magician","Vole l'objet d'une cible apres l'avoir touche avec une attaque directe."} );
    public static Talent megablaster = new Talent ( new String[] {"Mega Blaster","Mega Launcher","Un Pokemon dote de ce talent verra la puissance de ses capacites d'aura augmentee."} );
    public static Talent pareballes = new Talent ( new String[] {"Pare-Balles","Bulletproof","Protege contre les capacites balles et bombes, par exemple Balle Graine ou Canon Graine."} );
    public static Talent peauceleste = new Talent ( new String[] {"Peau Celeste","Aerilate","Transforme les capacites de type normal en type vol."} );
    public static Talent peaufeerique = new Talent ( new String[] {"Peau Feerique","Pixilate","Transforme les capacites de type normal en type fee."} );
    public static Talent peaugelee = new Talent ( new String[] {"Peau Gelee","Refrigerate","Transforme les capacites de type normal en type glace."} );
    public static Talent poisseux = new Talent ( new String[] {"Poisseux","Gooey","Baisse la Vitesse des Pokemon qui touchent ce Pokemon avec une attaque directe."} );
    public static Talent prognathe = new Talent ( new String[] {"Prognathe","Strong Jaw","Augmente la puissance des attaques a base de morsures."} );
    public static Talent proteen = new Talent ( new String[] {"Proteen","Protean","Change le type du Pokemon en celui de toute capacite qu'il utilise."} );
    public static Talent symbiose = new Talent ( new String[] {"Symbiose","Symbiosis","Passe un objet tenu a un Pokemon allie lorsque l'allie utilise son objet."} );
    public static Talent toisonepaisse = new Talent ( new String[] {"Toison Epaisse","Fur Coat","Divise par deux les degats recus lors d'une attaque physique."} );
    public static Talent toisonherbue = new Talent ( new String[] {"Toison Herbue","Grass Pelt","Augmente la Defense lorsque Champ Herbu est en vigueur."} );
    public static Talent zero = new Talent( new String[] {"...","...","Il n'y a pas d'autre talent pour le moment"});
    public static Talent[] listeTalents = new Talent[] {absenteisme,absorbeau,absorbvolt,agitation,airlock,antibruit,armumagma,armurbaston,attention,benet,boomfinal,brasier,cacophonie,calque,chanceux,chlorophylle,cielgris,coloforce,coquearmure,corpsardent,corpssain,crachin,cran,cuvette,deguisement,ecaillespeciale,echauffement,ecranfumee,ecranpoudre,engrais,espritvital,essaim,fermete,forcepure,fuite,gardemystik,glissade,glue,hypercutter,ignifuvoile,insomnia,intimidation,isograisse,jolisourire,levitation,lumiattirance,magnepiege,marqueombre,matinal,medicnature,meteo,minus,moiteur,mue,oeilcompose,paratonnerre,peaudure,piege,plus,pointpoison,posespore,pression,puanteur,ramassage,regardvif,sablevolant,secheresse,serenite,statik,suintement,synchro,tempoperso,tetederoc,torche,torrent,turbo,vaccin,ventouse,voilesable,adaptabilite,alerteneige,annulegarde,anticipation,brisemoule,cherchemiel,colerique,corpsgel,debutcalme,delestage,donfloral,feuillegarde,filtre,forcesoleil,fouille,frein,gardemagik,gloutonnerie,hydratation,ignifuge,impassible,inconscient,lavabo,lentiteintee,maladresse,mauvaisreve,motorise,multicoups,multitype,normalise,peauseche,piedconfus,piedveloce,poingdefer,prediction,querelleur,rideauneige,rivalite,simple,sniper,soinpoison,solideroc,technicien,telecharge,temeraire,acharne,analyste,armurouillee,baignesable,coeurdecoq,coeurnoble,coeursoin,contestation,corpsmaudit,defaitiste,envelocape,epinedefer,farceur,forcesable,gardeamie,heavymetal,herbivore,illusion,imposteur,impudence,infiltration,lightmetal,lunatique,miroirmagik,modetranse,momie,multiecaille,peaumiracle,phobique,pickpocket,ragebrulure,ragepoison,recolte,regeforce,sanslimite,telepathe,tension,teravoltage,toxitouche,turbobrasier,victorieux,ailesbourrasque,amourfilial,aromavoile,aurafeerique,aurainversee,auratenebreuse,bajoues,battant,declictactique,floravoile,glucovoile,griffedure,magicien,megablaster,pareballes,peauceleste,peaufeerique,peaugelee,poisseux,prognathe,proteen,symbiose,toisonepaisse,toisonherbue,zero};

    public String _fr;
    public String _en;
    public String _description;
    
    public static void main (String[] args){
        Talent absenteisme = new Talent (new String[] {"Absenteisme","Truant","Le Pokemon n'attaque qu'un tour sur deux."});
        System.out.println(absenteisme.toString());
        
    }

}
