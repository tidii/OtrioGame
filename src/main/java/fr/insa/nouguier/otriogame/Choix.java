package fr.insa.nouguier.otriogame;

/**
 *
 * @author Marius
 */



public class Choix{
	
//-------------CHOIX DU NOMBRE DE COULEUR PAR JOUEUR DANS LE CAS DU JEU A 2-----------------------------------------------------
	public static int NombreCouleur(){
		int NombreCouleur;
		System.out.println("Choisissez le nombre de couleur par joueur. \n \nTapez 1 : pour une couleur par joueur \nTapez 2 : pour deux couleurs par joueur");
		NombreCouleur=Lire.i();
			
		// saisie controlée
		while((NombreCouleur!=1)&(NombreCouleur!=2)){
			System.out.println("Une erreur est survenue ;'( \nChoisissez le nombre de couleur par joueur. \n \nTapez 1 : pour une couleur par joueur \nTapez 2 : pour deux couleurs par joueur");
			NombreCouleur=Lire.i();
		}
	return NombreCouleur;
	}

//-------------CHOIX DE LA COULEUR----------------------------------------------------
	public static int Couleur(int Couleur1, int Couleur2, int Couleur3){
		int C;
		
		System.out.println("\nChoisissez une couleur : \nTapez 1 pour VERT \nTapez 2 pour BLEU \nTapez 3 pour ROUGE \nTapez 4 pour JAUNE");
		C=Lire.i();
		
		// saisie controlée
		while((C!=1)&(C!=2)&(C!=3)&(C!=4)){
			System.out.println("\nCette couleur n'existe pas, choisissez en une autre");
			C=Lire.i();
		}
		
		//Verification de la disponibilité de la couleur 
		while((C==Couleur1)||(C==Couleur2)||(C==Couleur3)){
			System.out.println("\nCette couleur est déja prise par un autre joueur. \nTapez 1 pour VERT \nTapez 2 pour BLEU \nTapez 3 pour ROUGE \nTapez 3 pour JAUNE");
			C=Lire.i();
			// saisie controlée
			while((C!=1)&(C!=2)&(C!=3)&(C!=4)){
				System.out.println("\nCette couleur n'existe pas, choisissez en une autre");
				C=Lire.i();
			}
		}
	return C;
	}
	
//--------------------choix de la taille du cerlce et verification si possibilité de jouer IDEM pour l'IA----------------------------------------------
	public static int TailleCercleRobot( int [][]coupjoueur, int y, String x, String J1,String J2){
		int T=0;

		//si il s'agit du joueur
		if(x==J1){
			System.out.println(J1+", choisissez une taille de cercle : 1 pour le petit, 2 pour le moyen, 3 pour le grand");
			T=Lire.i();
			//saisie controlée
			while((T!=1)&(T!=2)&(T!=3)){
				System.out.println(J1+", choisissez une VRAIE taille de cercle ");
				T=Lire.i();
			}
			//verification disponibilité cercle dans la matrice dediée à la ligne du joueur 
			while(coupjoueur[y-1][T-1]==0){
				System.out.println("Il n'y a plus de cercle de cette taille maintenant ! Choisissez une autre taille");
				T=Lire.i();
				//saisie controlée
				while((T!=1)&(T!=2)&(T!=3)){
					System.out.println(J1+", choisissez une VRAIE taille de cercle ");
					T=Lire.i();
				}
			}
		}
		
		if(x==J2){
			T=(int)((Math.random()*(4-1))+1);
			//verification disponibilité cercle dans la matrice dediée à la ligne du robot (2)
			while(coupjoueur[y-1][T-1]==0){
				T=(int)((Math.random()*(4-1))+1);
			}
		}
	
		(coupjoueur[y-1][T-1])=((coupjoueur[y-1][T-1])-1); //retrait du pions dans le stock du joueur/robot à sa ligne dans la matrice dédiée
		
		return T; //revoit de la taille du cercle choisie par le joueur 
	}
	
//-----------------------------choix de la taille du cerlce et verification si possibilité de joueur-----------------------------------------------------------------
	
public static int TailleCercle( int [][]coupjoueur, int y, String x, int E1, int E2, int E3){
	int T=0;
	
	//cas ou il ne reste plus d'emplacement pour les petits cercles 
	if ((E1==0)&(E2!=0)&(E3!=0)){
		System.out.println("\n "+x+", choisissez une taille de cercle : 1 pour le petit, 2 pour le moyen, 3 pour le grand");
		T=Lire.i();
		//saisie controlée
		while((T!=2)&(T!=3)){
			System.out.println(x+", choisissez une VRAIE taille de cercle");
			T=Lire.i();
		}
		//verification disponibilité cercle dans la matrice dediée à la ligne du Joueur
		while(coupjoueur[y-1][T-1]==0){
			System.out.println("Il n'y a plus de cercle de cette taille maintenant ! Choisissez une autre taille");
			T=Lire.i();
			//saisie controlée
			while((T!=2)&(T!=3)){
				System.out.println(x+", choisissez une VRAIE taille de cercle ");
				T=Lire.i();
			}
		}
		(coupjoueur[y-1][T-1])=((coupjoueur[y-1][T-1])-1);
	return T; //revoit de la taille du cercle choisie par le joueur 
	}
	
	//cas ou il ne reste plus d'emplacement pour les cercles moyens 
	if ((E1!=0)&(E2==0)&(E3!=0)){
		System.out.println(x+", choisissez une taille de cercle : 1 pour le petit, 2 pour le moyen, 3 pour le grand");
		T=Lire.i();
		//saisie controlée
		while((T!=1)&(T!=3)){
			System.out.println(x+", choisissez une VRAIE taille de cercle ");
			T=Lire.i();
		}
		//verification disponibilité cercle dans la matrice dediée à la ligne du Joueur
		while(coupjoueur[y-1][T-1]==0){
			System.out.println("Il n'y a plus de cercle de cette taille maintenant ! Choisissez une autre taille");
			T=Lire.i();
			//saisie controlée
			while((T!=1)&(T!=3)){
				System.out.println(x+", choisissez une VRAIE taille de cercle ");
				T=Lire.i();
			}
		}
		(coupjoueur[y-1][T-1])=((coupjoueur[y-1][T-1])-1);
	return T; //revoit de la taille du cercle choisie par le joueur 
	}

	//cas ou il ne reste plus d'emplacement pour les grands cercles	
	//fonctionne d'une façon similaire aux précédents cas 
	if ((E1!=0)&(E2!=0)&(E3==0)){
		System.out.println(x+", choisissez une taille de cercle : 1 pour le petit, 2 pour le moyen, 3 pour le grand");
		T=Lire.i();
		while((T!=1)&(T!=2)){
			System.out.println(x+", choisissez une VRAIE taille de cercle ");
			T=Lire.i();
		}
		while(coupjoueur[y-1][T-1]==0){
			System.out.println("Il n'y a plus de cercle de cette taille maintenant ! Choisissez une autre taille");
			T=Lire.i();
			while((T!=1)&(T!=2)){
				System.out.println(x+", choisissez une VRAIE taille de cercle ");
				T=Lire.i();
			}
		}
		(coupjoueur[y-1][T-1])=((coupjoueur[y-1][T-1])-1);
	return T;
	}
		
	//cas ou il ne reste plus d'emplacement pour les petis et moyens cercles	
	//fonctionne d'une façon similaire aux précédents cas 
	if ((E1==0)&(E2==0)&(E3!=0)){
		System.out.println(x+", choisissez une taille de cercle : 1 pour le petit, 2 pour le moyen, 3 pour le grand");
		T=Lire.i();
		while((T!=3)){
			System.out.println(x+", choisissez une VRAIE taille de cercle ");
			T=Lire.i();
		}
		while(coupjoueur[y-1][T-1]==0){
			System.out.println("Il n'y a plus de cercle de cette taille maintenant ! Choisissez une autre taille");
			T=Lire.i();
			while((T!=3)){
				System.out.println(x+", choisissez une VRAIE taille de cercle ");
				T=Lire.i();
			}
		}
		(coupjoueur[y-1][T-1])=((coupjoueur[y-1][T-1])-1);
	return T;
	}
		
	//cas ou il ne reste plus d'emplacement pour les grands et petits cercles	
	//fonctionne d'une façon similaire au précédents cas 	
	if ((E1==0)&(E2!=0)&(E3==0)){
		System.out.println(x+", choisissez une taille de cercle : 1 pour le petit, 2 pour le moyen, 3 pour le grand");
		T=Lire.i();
		while((T!=2)){
			System.out.println(x+", choisissez une VRAIE taille de cercle ");
			T=Lire.i();
		}
		while(coupjoueur[y-1][T-1]==0){
			System.out.println("Il n'y a plus de cercle de cette taille maintenant ! Choisissez une autre taille");
			T=Lire.i();
			while((T!=2)){
				System.out.println(x+", choisissez une VRAIE taille de cercle ");
				T=Lire.i();
			}
		}
		(coupjoueur[y-1][T-1])=((coupjoueur[y-1][T-1])-1);
	return T;
	}
	
	//cas ou il ne reste plus d'emplacement pour les grands et moyens cercles	
	//fonctionne d'une façon similaire au précédents cas 		
	if ((E1!=0)&(E2==0)&(E3==0)){
		System.out.println(x+", choisissez une taille de cercle : 1 pour le petit, 2 pour le moyen, 3 pour le grand");
		T=Lire.i();
		while((T!=1)){
			System.out.println(x+", choisissez une VRAIE taille de cercle ");
			T=Lire.i();
		}
		while(coupjoueur[y-1][T-1]==0){
			System.out.println("Il n'y a plus de cercle de cette taille maintenant ! Choisissez une autre taille");
			T=Lire.i();
			while((T!=1)){
				System.out.println(x+", choisissez une VRAIE taille de cercle ");
				T=Lire.i();
			}
		}
		(coupjoueur[y-1][T-1])=((coupjoueur[y-1][T-1])-1);
	return T;
	} 
	
	//cas ou il reste des emplacements pour toutes les tailles de cercle 	
	//fonctionne d'une façon similaire au précédents cas 	
	if((E1!=0)&(E2!=0)&(E3!=0)){
		System.out.println(x+", choisissez une taille de cercle : 1 pour le petit, 2 pour le moyen, 3 pour le grand");
		T=Lire.i();
		while((T!=1)&(T!=2)&(T!=3)){
			System.out.println(x+", choisissez une VRAIE taille de cercle ");
			T=Lire.i();
		}
		while(coupjoueur[y-1][T-1]==0){
			System.out.println("Il n'y a plus de cercle de cette taille maintenant ! Choisissez une autre taille");
			T=Lire.i();
			while((T!=1)&(T!=2)&(T!=3)){
				System.out.println(x+", choisissez une VRAIE taille de cercle ");
				T=Lire.i();
			}
		}
		(coupjoueur[y-1][T-1])=((coupjoueur[y-1][T-1])-1);
	return T;
	}
	
else{T=5;
	return 5;
}	
}

}

