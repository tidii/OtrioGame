package fr.insa.nouguier.otriogame;

/**
 *
 * @author Marius
 */



public class Coup {

//-------------------CHOIX ET VERIFICATION DES COUP LORS DES JEUX SANS ROBOT----------------------
	public static void Joueur(int [][][] plateau, String x, int T,int y){
		int C=0, L=0;
		
		//choix de la colone
		System.out.println(x+", choisissez une colonne");
		C=Lire.i();
		//saisie controlée
		while((C!=1)&(C!=2)&(C!=3)){
			System.out.println(x+", choisissez une VRAIE colonne");
			C=Lire.i();
		}
		//choix de la ligne
		System.out.println(x+", choisissez une ligne");
		L=Lire.i();
		//saisie controlée
		while((L!=1)&(L!=2)&(L!=3)){
			System.out.println(x+", choisissez une VRAIE ligne");
			L=Lire.i();
		}
		
		// verification si l'emplacement demmandé est libre ou non 
		while(plateau[C-1][L-1][T-1]!=0){
			System.out.println("\nCette case est déja prise, choisissez en une autre");
			System.out.println(x+", choisissez une colonne");
			C=Lire.i();
			//saisie controlée
			while((C!=1)&(C!=2)&(C!=3)){
				System.out.println(x+", choisissez une VRAIE colonne");
				C=Lire.i();
			}
			System.out.println(x+", choisissez une ligne");
			L=Lire.i();
			//saisie controlée
			while((L!=1)&(L!=2)&(L!=3)){
				System.out.println(x+", choisissez une VRAIE ligne");
				L=Lire.i();
			}
		}
		plateau[C-1][L-1][T-1]=y; //placement du numéro assigné au joueur à l'emplacement choisi
	 
	
}

//---------------------CHOIX ET VERIFIACATION DES COUPS POUR LE JEU AVEC LE ROBOT-------------------------------
public static void Robot(int [][][] plateau, String x,String J1,String J2, int T,int y){
	int C=0, L=0;
	
	//S'il s'agit du tour du joueur
	if(x==J1){
		//choix de la colonne 
		System.out.println(x+", choisissez une colonne");
		C=Lire.i();
		//saisie controlée
		while((C!=1)&(C!=2)&(C!=3)){
			System.out.println(x+", choisissez une VRAIE colonne");
			C=Lire.i();
		}
		//choix de la ligne
		System.out.println(x+", choisissez une ligne");
		L=Lire.i();
		//saisie controlée
		while((L!=1)&(L!=2)&(L!=3)){
			System.out.println(x+", choisissez une VRAIE ligne");
			L=Lire.i();
		}
		//verification de la disponibilité de la case choisie sur le plateau 
		while(plateau[C-1][L-1][T-1]!=0){
			System.out.println("\nCette case est déja prise, choisissez en une autre");
			//choix de la colonne
			System.out.println(x+", choisissez une colonne");
			C=Lire.i();
			//saisie controlée
			while((C!=1)&(C!=2)&(C!=3)){
				System.out.println(x+", choisissez une VRAIE colonne");
				C=Lire.i();
			}
			//choix de la ligne
			System.out.println(x+", choisissez une ligne");
			L=Lire.i();
			//saisie controlée
			while((L!=1)&(L!=2)&(L!=3)){
				System.out.println(x+", choisissez une VRAIE ligne");
				L=Lire.i();
			}
		}
	}
	
	//S'il s'agit du tour du robot 
	if(x==J2){
		//choix de la colone
		C=(int)((Math.random()*(4-1))+1);
		//choix de la ligne
		L=(int)((Math.random()*(4-1))+1);
		//verification de la disponibilité de la case choisie avec T la taille du cercle 
		while(plateau[C-1][L-1][T-1]!=0){
			//idem
			C=(int)((Math.random()*(4-1))+1);
			L=(int)((Math.random()*(4-1))+1);
		}
	}
	System.out.println("\n "+x+" a joué un cercle de taille "+T+" à la colone "+C+" et la ligne "+L);
	plateau[C-1][L-1][T-1]=y; //placement du cercle choisie à l'emplacement shouité et verifié 

}
	
}

