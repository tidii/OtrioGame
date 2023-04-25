package fr.insa.nouguier.otriogame;

/**
 *
 * @author Marius
 */



public class Compteur {
	
//------------------compte les cases dispo sur le plateau pour petits cercles------------------------------------------------
public static int PetitCercle(int [][][] plateau){
	int l,c;
	int E1=0;
	
	for(l=0;l<=2;l++){
		for(c=0;c<=2;c++){
			if ((plateau[l][c][0])==0){
				E1=E1+1;
			}
		}
	}
	return E1;
}

//--------------------compte les cases dispo sur le plateau pour les cercles moyens----------------------------------------------
public static int MoyenCercle(int [][][] plateau){
	int l,c;
	int E2=0;
	for(l=0;l<=2;l++){
		for(c=0;c<=2;c++){
			if ((plateau[l][c][1])==0){
				E2=E2+1;
			}
		}
	}
	return E2;
}

//------------------compte les cases dispo sur le plateau pour les grands cercles------------------------------------------------
public static int GrandCercle(int [][][] plateau){
	int l,c;
	int E3=0;
	for(l=0;l<=2;l++){
		for(c=0;c<=2;c++){
			if ((plateau[l][c][2])==0){
				E3=E3+1;
				}
		}
	}
	return E3;
}

}

