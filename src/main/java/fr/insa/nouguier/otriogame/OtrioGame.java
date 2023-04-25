package fr.insa.nouguier.otriogame;

import java.awt.*;
import java.awt.Graphics2D; // importations necessaires à l'affichage 
import java.awt.BasicStroke;
import javax.swing.*;
public class OtrioGame {
	
	public static void main (String[] args) {
		
		int J;
		int [][] CoupJoueur= {{3,3,3},{3,3,3},{3,3,3},{3,3,3}}; // matrice comportant les cercles restants des joueurs (une ligne = 1 joueur)
		
		// Creation de la fenètre pour l'affichage avec ses caractéristiques 
		JFrame window = new JFrame();
		window.setSize(430, 430);
		window.setTitle("Otrio Game");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Création d'une matrice 3D pour materialiser le plateu de jeu
		int[][][] plateau = {
			{
			{0,0,0},{0,0,0},{0,0,0}
			},
			{
			{0,0,0},{0,0,0},{0,0,0}
			},
			{
			{0,0,0},{0,0,0},{0,0,0}
			}
			};
			
		// Credits 
		System.out.println("Otrio Game !!\n");
		System.out.println("Made by : \nNouguier Marius \nBurger Arthur \nNiyonkuru Jimmy\n");
		
		//demande du mode de Jeu shouaité 
		System.out.println("Veuillez choisir le mode de jeu :\n \nTapez 1 : Pour jouer seul face à un robot \nTapez 2 : Pour jouer en multijoueur avec 2 joueurs \nTapez 3 : Pour jouer en multijoueur avec 3 joueurs \nTapez 4 : Pour jouer en multijoueur avec 4 joueurs \n");
		J=Lire.i();
		
		//saisie controlée 
		while((J!=1)&(J!=2)&(J!=3)&(J!=4)){
		System.out.println("Une erreur est survenue. \nVeuillez choisir le mode de jeu :\n \nTapez 1 : Pour jouer seul face à un robot \nTapez 2 : Pour jouer en multijoueur avec 2 joueurs \nTapez 3 : Pour jouer en multijoueur avec 3 joueurs \nTapez 4 : Pour jouer en multijoueur avec 4 joueurs \n");
			J=Lire.i();
		}
//-----------------JOUEUR VS ROBOT-------------------------------------------------
		if (J==1){
			Jeu.UnJoueur(plateau,CoupJoueur,window); // Appel de la classe Jeu et de son sous programme pour 1 joueur
		}
//------------JEU A DEUX JOUEURS (2 ET 4 COULEURS)---------------------------------
		if (J==2){
			Jeu.DeuxJoueurs(plateau,CoupJoueur,window); // Appel de la classe Jeu et de son sous programme pour 2 joueurs
		}
//-----------------JEU A TROIS JOUEURS---------------------------------------------
		if (J==3){
			Jeu.TroisJoueurs(plateau,CoupJoueur,window); // Appel de la classe Jeu et de son sous programme pour 3 joueurs
		}
//-----------------JEU A QUATRE JOUEURS--------------------------------------------
		if (J==4){
			Jeu.QuatreJoueur(plateau,CoupJoueur,window); // Appel de la classe Jeu et de son sous programme pour 4 joueurs
		}
		
	}
}
