package fr.insa.nouguier.otriogame;

/**
 *
 * @author Marius
 */



public class Egalite {
	
	//------------CONDITION D'EGALITE PAR PLUS DE PION ------------------------------------------------------
public static int PlusDePion( int [][]coupjoueur, int V){
	int Ex=0;
	
	for(int i=0;i<=2;i++){
		for(int j=0;j<=1;j++){
			if(coupjoueur[j][i]==0){
				Ex=Ex+1;
				}
		}
		}
		if (Ex==6){
			System.out.println("il y a égalité, Bravo à tous"); // si plus aucun joueur n'a de pion à joueur 
			V=V+1; //variable de victroire prend + 1
			}
			return V;
	}


//----------------CONDITION D'EGALITE PLUS DE PLACE-------------------------------------------
public static int PlusDePlace(int [][][] plateau,int V){
	int E=0;
	
	for(int l=0;l<=2;l++){
		for(int c=0;c<=2;c++){
			for(int p=0;p<=2;p++){
				if((plateau[l][c][p])==0){
					E=E+1; // variable prenant + 1 si une case ocupée est trouvée 
					}
		}
		}
		}
	if(E==0){
		System.out.println("Personne n'a gangné pour cette partie, bravo à tous");
		V=V+1; //variable de victroire prend + 1
		}
		return V;
}
}

