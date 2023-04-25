package fr.insa.nouguier.otriogame;

/**
 *
 * @author Marius
 */



import java.awt.*;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import javax.swing.*;
public class Jeu {
	
	//--------JEU POUR QUATRE JOUEURS------------------------
	public static void QuatreJoueur (int [][][]plateau, int [][]CoupJoueur, JFrame window) {
				int i,V=0,y=0,T,E,E1,E2,E3,J;
		int Couleur1=0,Couleur2=0,Couleur3=0,Couleur4=0,NombreCouleur;
		int random_n4=(int)(Math.random() * (4-0)) + 0;			//random pour le jeu à 4 joueurs
		String J1,J2,J3,J4,x=" ";


		System.out.println("Vous avez choisi le mode de jeu à 4 joueurs, BONNE CHANCE !");
		
		//initialisation de la partie 
		System.out.println("Donnez le nom du premier joueur");
		J1=Lire.S();
		Couleur1=Choix.Couleur(Couleur1,Couleur2,Couleur3);

		System.out.println("Donnez le nom du deuxième joueur");
		J2=Lire.S();
		Couleur2=Choix.Couleur(Couleur1,Couleur2,Couleur3);
		
		System.out.println("Donnez le nom du troisieme joueur");
		J3=Lire.S();
		Couleur3=Choix.Couleur(Couleur1,Couleur2,Couleur3);
		
		System.out.println("Donnez le nom du quatrieme joueur");
		J4=Lire.S();
		Couleur4=Choix.Couleur(Couleur1,Couleur2,Couleur3);
		
		
i=random_n4;//Nombre aleatoire pour le premier joueur qui commence 

//Boucle qui continue tant qu'il n'y a pas de victoire ou d'égalité
while(V==0){
	if(i%4==0){  //changement joueur 
		x=J1;
		y=1;      //numéro assigné au joueur qui sera mit dans le plateau lors de son coup
	}if(i%4==1){ //changement joueur 
		x=J2;
		y=2;
	}if(i%4==2){ //changement joueur 
		x=J3;
		y=3;
	}if(i%4==3){ //changement joueur 
		x=J4;
		y=4;
	}
	
	//appel du compteur pour compter le nombre de cases libre par taille de cercle
	E1=Compteur.PetitCercle(plateau);
	E2=Compteur.MoyenCercle(plateau);
	E3=Compteur.GrandCercle(plateau);
										 
	T=Choix.TailleCercle(CoupJoueur,y,x,E1,E2,E3); //appel de la classe et de la fonction s'occupant  de la verification du choix de la taille de cercle du joueur
	Coup.Joueur(plateau,x,T,y);	//appel de la classe s'occupant du choix et verification du coup des joueurs
	Affiche.A(plateau,window,Couleur1,Couleur2,Couleur3,Couleur4);// appel de la fonction d'affichage dans sa classe 
	V=Victoire.V(plateau,y,V,x); //appel de la fonction regroupant toutes les verifications de cas de victoire dans la classe Victore		
	V=Egalite.PlusDePlace(plateau,V); //appel de la classe de verification d'égalité par plus de place sur le plateau
	
	if(V==0){
	System.out.println("\nIl n'y a aucune victoire, vous pouvez continuer \n "); // si aucune victoire 
	}
	i=i+1;
}


}
//---------JEU A TROIS JOUEURS-----------------------------------
public static void TroisJoueurs(int [][][]plateau, int [][]CoupJoueur, JFrame window){
		int i,V=0,y=0,T,E,E1,E2,E3,J;
		int Couleur1=0,Couleur2=0,Couleur3=0,Couleur4=0,NombreCouleur;
		int random_n3=(int)(Math.random() * (3-0)) + 0;			//random pour le jeu à 3 joueurs
		String J1,J2,J3,J4,x=" ";
		

		System.out.println("Vous avez choisi le mode de jeu à 3 joueurs, BONNE CHANCE !");
		
		//initialisation de la partie
		System.out.println("\nDonnez le nom du premier joueur");
		J1=Lire.S();
		Couleur1=Choix.Couleur(Couleur1,Couleur2,Couleur3);
		
		System.out.println("\nDonnez le nom du deuxième joueur");
		J2=Lire.S();
		Couleur2=Choix.Couleur(Couleur1,Couleur2,Couleur3);
		
		System.out.println("\nDonnez le nom du troisieme joueur");
		J3=Lire.S();
		Couleur3=Choix.Couleur(Couleur1,Couleur2,Couleur3);
		
		
		i=random_n3; //nombre aleatoire pour le premier joueur qui commence 
		
	//boucle qui continue tant qu'il n'y a pas de victoire ou d'égalité
	while(V==0){
		if (i%3==0){  //changement joueur 
		x=J1;
		y=1;			//numéro assigné au joueur
		}if (i%3==1){ //changement joueur 
		x=J2;
		y=2;
		}if (i%3==2){ //changement joueur 
		x=J3;
		y=3;
	}
	
	//appel du compteur pour compter le nombre de cases libre par taille de cercle
	E1=Compteur.PetitCercle(plateau);
	E2=Compteur.MoyenCercle(plateau);
	E3=Compteur.GrandCercle(plateau);
	

	T=Choix.TailleCercle(CoupJoueur,y,x,E1,E2,E3); //appel de la classe et de la fonction s'occupant de la verification du choix de la taille de cercle du joueur
	Coup.Joueur(plateau,x,T,y); //appel de la classe s'occupant du choix et verification du coup des joueurs 
	Affiche.A(plateau,window,Couleur1,Couleur2,Couleur3,Couleur4); // appel de la fonction d'affichage dans sa classe 
	V=Victoire.V(plateau,y,V,x); //appel de la fonction regroupant toutes les verifications de cas de victoire dans la classe Victore				
	V=Egalite.PlusDePlace(plateau,V); //appel de la classe de verification d'égalité par plus de place sur le plateau
	
	
	if(V==0){
	System.out.println("\nIl n'y a aucune victoire, vous pouvez continuer \n "); // si aucune victoire 
	}
	
	i=i+1;
}
}

//----------JEU A DEUX JOUEURS----------------------------
public static void DeuxJoueurs(int [][][]plateau, int [][]CoupJoueur, JFrame window){
		int i,V=0,y=0,T,E,E1,E2,E3,J;
		int Couleur1=0,Couleur2=0,Couleur3=0,Couleur4=0,NombreCouleur;
		String J1,J2,J3,J4,x=" ";
		int random=(int)(Math.random() * (2-0)) + 0;            //random pour le jeu à 2 joueurs
		int random_n4=(int)(Math.random() * (4-0)) + 0;	
		
			
		System.out.println("Vous avez choisi le mode de jeu à 2 joueurs. \n");
		NombreCouleur=Choix.NombreCouleur(); //appel de la classe et fonction du choix du nombre de couleur spécifique au jeu à 2
		
		//si le mode shouaité est à 1 couleur par joueur
		 if(NombreCouleur==1){
			 
			System.out.println("Donnez le nom du premier joueur");
			J1=Lire.S();
			Couleur1=Choix.Couleur(Couleur1,Couleur2,Couleur3);
			
			System.out.println("\nDonnez le nom du deuxième joueur");
			J2=Lire.S();
			Couleur2=Choix.Couleur(Couleur1,Couleur2,Couleur3);
	
		i=random;//nombre aleatoire pour le premier joueur qui commence 
		
	//boucle qui continue tant qu'il n'y a pas de victoire ou d'égalité
	while(V==0){
		if (i%2==0){ //changement joueur 
		x=J1;
		y=1;  //numéro assigné au joueur
	} else {
		x=J2;
		y=2; //numéro assigné au joueur
	}
	E1=Compteur.PetitCercle(plateau);
	E2=Compteur.MoyenCercle(plateau);
	E3=Compteur.GrandCercle(plateau);
	
	T=Choix.TailleCercle(CoupJoueur,y,x,E1,E2,E3); //appel de la classe et de la fonction s'occupant  de la verification du choix de la taille de cercle du joueur
	Coup.Joueur(plateau,x,T,y); //appel de la classe s'occupant du choix et verification du coup des joueurs
	Affiche.A(plateau,window,Couleur1,Couleur2,Couleur3,Couleur4); // appel de la fonction d'affichage dans sa classe 
	V=Victoire.V(plateau,y,V,x);//appel de la fonction regroupant toutes les verifications de cas de victoire dans la classe Victoire
	
	if(V==0){
		V=Egalite.PlusDePion(CoupJoueur,V);
	}
	if(V==0){
			System.out.println("\nIl n'y a aucune victoire, vous pouvez continuer"); // si aucune victoire 
			System.out.println("");
		}
		
			i=i+1; // changement de joueur 
		}
		
		
}else{ //Si mode shouaité est à 2 couleurs par joueur

	
	System.out.println("Vous avez choisi le mode de jeu à 2 joueurs et 4 couleurs, BONNE CHANCE !");
	
		System.out.println("Donnez le nom du premier joueur");
		J1=Lire.S();
		Couleur1=Choix.Couleur(Couleur1,Couleur2,Couleur3);
		
		System.out.println("Donnez le nom du deuxième joueur");
		J2=Lire.S();
		Couleur2=Choix.Couleur(Couleur1,Couleur2,Couleur3);
		
		System.out.println(J1+", choisissez une deuxième couleur :");
		Couleur3=Choix.Couleur(Couleur1,Couleur2,Couleur3);
		
		System.out.println(J2+", choisissez une deuxième couleur:");
		Couleur4=Choix.Couleur(Couleur1,Couleur2,Couleur3);
		
		

i=random_n4; //nombre aleatoire pour le premier joueur qui commence 

//boucle qui continue tant qu'il n'y a pas de victoire ou d'égalité
while(V==0){
	if (i%4==0){  //changement joueur 
		x=J1;
		y=1;      //numéro assigné au joueur
	}if (i%4==1){ //changement joueur 
		x=J2;
		y=2;
	}if (i%4==2){ //changement joueur 
		x=J1;
		y=3;
	}if (i%4==3){ //changement joueur 
		x=J2;
		y=4;
	}
	
	E1=Compteur.PetitCercle(plateau);
	E2=Compteur.MoyenCercle(plateau);
	E3=Compteur.GrandCercle(plateau);
		
	T=Choix.TailleCercle(CoupJoueur,y,x,E1,E2,E3); //appel de la classe et de la fonction s'occupant  de la verification du choix de la taille de cercle du joueur
	(CoupJoueur[y-1][T-1])=((CoupJoueur[y-1][T-1])-1);//retrait du pions dans le stock du joueur à sa ligne
	Coup.Joueur(plateau,x,T,y);	//appel de la classe s'occupant du choix et verification du coup des joueurs
	Affiche.A(plateau,window,Couleur1,Couleur2,Couleur3,Couleur4); // appel de la fonction d'affichage dans sa classe 
	V=Victoire.V(plateau,y,V,x); //appel de la fonction regroupant toutes les verifications de cas de victoire dans la classe Victoire
	V=Egalite.PlusDePlace(plateau,V); //appel de la classe de verification d'égalité par plus de place sur le plateau
		

	if(V==0){
	System.out.println("\nIl n'y a aucune victoire, vous pouvez continuer \n "); // si aucune victoire 
	
	}
	
	i=i+1;
	}
}
}
	
	
//-------------------JEU A UN JOUEUR-------------------------
public static void UnJoueur(int [][][]plateau, int [][]CoupJoueur, JFrame window){
		int i,V=0,y=0,T,E,E1,E2,E3,J;
		int Couleur1=0,Couleur2=5,Couleur3=0,Couleur4=0;
		String J1,J2="Terminator",x=" ";
		int random=(int)(Math.random() * (2-0)) + 0;            //random pour le jeu à 2 joueurs
		
		System.out.println("Vous avez choisi le mode de jeu à 2 joueurs face au robot, BONNE CHANCE ! \nDonnez votre nom");	
		J1=Lire.S();
		Couleur1=Choix.Couleur(Couleur1,Couleur2,Couleur3); // appel fonction du choix de la couleur 
		
		i=random; //nombre aleatoire pour le premier joueur qui commence 
		
		//boucle qui continue tant qu'il n'y a pas de victoire ou d'égalité
		while(V==0){
		if (i%2==0){ //changement joueur 
		x=J1;
		y=1;  //numéro assigné au joueur
		} else {
		x=J2;
		y=2; //numéro assigné au joueur
	}
	
	T=Choix.TailleCercleRobot(CoupJoueur,y,x,J1,J2); //appel de la classe et de la fonction s'occupant  de la verification du choix de la taille de cercle du joueur
	Coup.Robot(plateau,x,J1,J2,T,y); //appel de la classe s'occupant du choix et verification du coup des joueurs et du robot 
	Affiche.A(plateau,window,Couleur1,Couleur2,Couleur3,Couleur4);	// appel de la fonction d'affichage dans sa classe 
	V=Victoire.V(plateau,y,V,x);//appel de la fonction regroupant toutes les verifications de cas de victoire dans la classe Victore
	
	if(V==0){
		V=Egalite.PlusDePion(CoupJoueur,V); // condition d'égalité si tous les pions ont été joués 
	}
	if(V==0){
		System.out.println("\nIl n'y a aucune victoire, vous pouvez continuer \n "); // si aucune victoire 
	
	}
	i=i+1;
}
	
	}
	}


