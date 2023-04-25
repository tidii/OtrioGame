package fr.insa.nouguier.otriogame;

/**
 *
 * @author Marius
 */

public class Victoire {
	
//-------------FONCTION REGROUPANT TOUS LES CAS DE VICTOIRE--------------
	public static int V(int [][][]plateau,int y, int V, String x){
		V=V+victoire_diagonale(plateau,y,V,x);
		V=V+diagonale_1_meme_taille(plateau,y,V,x);
		V=V+diagonale_2_meme_taille(plateau,y,V,x);
		
		V=V+allignement_meme_taille_colone(plateau,y,V,x);
		V=V+allignement_croissant_colone(plateau,y,V,x);
		V=V+allignement_decroissant_colone(plateau,y,V,x);
		
		V=V+empillement(plateau,y,V,x);
		
		V=V+allignement_meme_taille_ligne(plateau,y,V,x);
		V=V+allignement_croissant_ligne(plateau,y,V,x);
		V=V+allignement_decroissant_ligne(plateau,y,V,x);
		
		return V;
		}
		
//-----------------CONDITION DE VICTOIRE PAR ALLIGNEMENT CROISSANT DANS LES LIGNES-------------------------------------------------
	public static int allignement_croissant_ligne(int [][][] plateau, int y, int V, String x){
		
		for(int l=0;l<=2;l++){
			if((plateau[l][0][0])==(plateau[l][1][1])&(plateau[l][1][1])==(plateau[l][2][2])){
				if((plateau[l][0][0])==y){
					System.out.println("il y a une victoire de "+x+" par allignement croissant à la ligne "+(l+1));
					V=V+1;
				}
			}
		}
	return V;
}
//----------------CONDITION DE VICTOIRE PAR ALLIGNEMENT DECROISSANT DANS LES LIGNES--------------------------------------------------
public static int allignement_decroissant_ligne(int [][][] plateau, int y, int V, String x){
	
	for(int l=0;l<=2;l++){
			if((plateau[l][0][2])==(plateau[l][1][1])&(plateau[l][1][1])==(plateau[l][2][0])){
				if((plateau[l][0][2])==y){
					System.out.println("il y a une victoire de "+x+" par allignement decroissant à la ligne "+(l+1));
					V=V+1;
				}
			}
		}
	return V;
}
//--------------VICTOIRES DIAGONALE CROISSANT ET DECROISSANT----------------------------------------------------
public static int victoire_diagonale(int [][][] plateau, int y, int V, String x){
	
	 if(((plateau[0][0][0])==(plateau[1][1][1]))&((plateau[1][1][1])==(plateau[2][2][2]))){
			if(plateau[0][0][0]==y){
				System.out.println("il y a une victoire de "+x+ " par allignement croissant dans la diagonale 1");
				V=V+1;	
			}
	}
	if(((plateau[0][0][2])==(plateau[1][1][1]))&((plateau[1][1][1])==(plateau[2][2][0]))){
		if(plateau[0][0][2]==y){
			System.out.println("il y a une victoire de "+x+ " par allignement decroissant dans la diagonale 1");
			V=V+1;	
		}
	}		
	if(((plateau[2][0][0])==(plateau[1][1][1]))&((plateau[1][1][1])==(plateau[0][2][2]))){
		if(plateau[2][0][0]==y){
			System.out.println("il y a une victoire de "+x+ " par allignement croissant dans la diagonale 2");
			V=V+1;	
		}
	}
	if(((plateau[2][0][2])==(plateau[1][1][1]))&((plateau[1][1][1])==(plateau[0][2][0]))){
		if(plateau[2][0][2]==y){
			System.out.println("il y a une victoire de "+x+ " par allignement decroissant dans la diagonale 2");
			V=V+1;
			}
		}
		return V;
}
//----------------ALLIGNEMENT DE MEME TAILLE SUR LES LIGNES---------------------------------------------------------
	public static int allignement_meme_taille_ligne(int [][][]plateau, int y, int V, String x){
		int l,p;
		for(l=0;l<=2;l++){
			for(p=0;p<=2;p++){
				if(((plateau[0][l][p])==(plateau[1][l][p]))&((plateau[1][l][p])==(plateau[2][l][p]))){
					if(plateau[0][l][p]==y){
						System.out.println("il y a une victoire de "+x+" par allignement de même taille dans la ligne "+(l+1));
						V=V+1;
					}
				}
			}
		}
		return V;
	}
//-----------------CONDITION DE VICTOIRE PAR ALLIGNEMENT CROISSANT DANS LES COLONES--------------------------------------------------------
	public static int allignement_croissant_colone(int [][][]plateau, int y, int V, String x){
		int l;
		for(l=0;l<=2;l++){
			if((plateau[0][l][0])==(plateau[1][l][1])&(plateau[1][l][1])==(plateau[2][l][2])){
				if((plateau[0][l][0])==y){
					System.out.println("il y a une victoire de "+x+" par allignement croissant dans la colone "+(l+1));
					V=V+1;
				}
			}
		}
	return V;
	}
//-------------------CONDITION DE VICTOIRE PAR ALLIGNEMENT DECROISSANT DANS LES COLONES------------------------------------------------------
	public static int allignement_decroissant_colone(int [][][]plateau, int y, int V, String x){
		int l;
		for(l=0;l<=2;l++){
			if((plateau[0][l][2])==(plateau[1][l][1])&(plateau[1][l][1])==(plateau[2][l][0])){
				if((plateau[0][l][2])==y){
					System.out.println("il y a une victoire de "+x+" par allignement decroissant dans la colonne "+(l+1));
					V=V+1;
				}
			}
		}
		return V;
	}
//-----------------CONDITION DE VICTOIRE PAR ALLIGNEMENT DE MEME TAILLE DANS UNE DES DEUX DIAGONALE--------------------------------------------------------
	public static int diagonale_1_meme_taille(int [][][]plateau, int y, int V, String x){
		
		for(int p=0;p<=2;p++){
			if((plateau[0][0][p])==(plateau[1][1][p])&(plateau[1][1][p])==(plateau[2][2][p])){
				if((plateau[0][0][p])==y){
					System.out.println("il y a une victoire de "+x+" par allignement de meme taille dans la diagonale 1 ");
					V=V+1;
				}
			}
		}
		return V;
	}
//-----------------CONDITION DE VICTOIRE PAR ALLIGNEMENT DE MEME TAILLE DANS L'AUTRE DIAGONALE--------------------------------------------------------
	public static int diagonale_2_meme_taille(int [][][]plateau, int y, int V, String x){
		
		for(int p=0;p<=2;p++){
			if((plateau[2][0][p])==(plateau[1][1][p])&(plateau[1][1][p])==(plateau[0][2][p])){
				if((plateau[2][0][p])==y){
					System.out.println("il y a une victoire de "+x+" par allignement de meme taille dans la diagonale 2 ");
					V=V+1;
				}
			}
		}
		return V;
	}
//-----------------CONDITION DE VICTOIRE PAR EMPILEMENT--------------------------------------------------------
	public static int empillement(int [][][]plateau, int y, int V, String x){
		
		for(int c=0;c<=2;c++){
			for(int l=0;l<=2;l++){
				if(((plateau[c][l][0])==(plateau[c][l][1]))&((plateau[c][l][1])==(plateau[c][l][2]))){
					if(plateau[c][l][0]==y){
						System.out.println("il y a victoire de "+x+" par empillement");
						V=V+1;
					}
				}
			}
		}
		return V;
	}
//----------------------CONDITION DE VICTOIRE PAR ALLIGNEMENT DE MEME TAILLE DANS LES COLONES---------------------------------------------------
	public static int allignement_meme_taille_colone(int [][][]plateau, int y, int V, String x){
		
		for(int c=0;c<=2;c++){
			for(int p=0;p<=2;p++){
				if(((plateau[c][0][p])==(plateau[c][1][p]))&((plateau[c][1][p])==(plateau[c][2][p]))){
					if(plateau[c][0][p]==y){
						System.out.println("il y a victoire de " +x+" par allignement de même taille dans la colone "+(c+1));
						V=V+1;
					}
				}
			}
		}
		return V;
	}

	
}

