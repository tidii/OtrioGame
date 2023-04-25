package fr.insa.nouguier.otriogame;

/**
 *
 * @author Marius
 */



import java.awt.*;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import javax.swing.*;
public class Affiche {
	
	public static void A(int [][][]plateau, JFrame window, int Couleur1, int Couleur2, int Couleur3, int Couleur4){
	
		// On creer un panel (ici P) sur lequel on va dessiner (on affichera ce panel dans la fenêtre après)
		JPanel P = new JPanel() {
		@Override
		public void paintComponent(Graphics e) {
		super.paintComponent(e);
      
		//tracer du cadrillage en Noir et avec une eppaisseur de 8u 
		Graphics2D e2 = (Graphics2D) e;
		e2.setStroke(new BasicStroke(8));
		e.setColor(Color.BLACK); 
		e.drawLine(140, 10, 140, 400); //fonction permettant de tracer des lignes (on donne les coordonnées de l'arrivé et du départ)
		e.drawLine(270, 10, 270, 400);
		e.drawLine(10, 140, 400, 140);
		e.drawLine(10, 270, 400, 270);

		//remise de l'eppaisseur du trait à 5
		e2.setStroke(new BasicStroke(5));
		
        int i=0,j=0,k=0;
		for (int c = 0; c < 3; c++) {
			for (int l = 0; l < 3; l++) {
				for (int p = 0; p < 3; p++) {
			
					// si le programme tombe sur un cercle du joueur 1 (1)
					if (plateau[c][l][p] == 1) {
						if(Couleur1==1){e.setColor(Color.GREEN);} //selection de la couleur en fonction de l'appartenance du coup 
						if(Couleur1==2){e.setColor(Color.BLUE);}
						if(Couleur1==3){e.setColor(Color.RED);}
						if(Couleur1==4){e.setColor(Color.YELLOW);}
						if(p==0){i=70;j=70;k=10;}   //différentes initialisations en fonction de la taille du cerlce "trouvé"
						if(p==1){i=50;j=50;k=50;}
						if(p==2){i=25;j=25;k=100;}
						i=i+c*130;	//petits calcul pour initialiser les coordonnées du cercle à placer 
						j=j+l*130;
						e.drawOval(i, j, k, k); //tracer du cercle 
					}
					    
            //__IDEM POUR LES 3 SUIVANTS__
            
						// si le programme tombe sur un cercle du joueur 2 (2)
					if(plateau[c][l][p] == 2){
						if(Couleur2==1){e.setColor(Color.GREEN);}
						if(Couleur2==2){e.setColor(Color.BLUE);}
						if(Couleur2==3){e.setColor(Color.RED);}
						if(Couleur2==4){e.setColor(Color.YELLOW);}
						if(Couleur2==5){e.setColor(Color.PINK);} //couleur particulière pour le robot (qui est toujours joueur 2)
						if(p==0){i=70;j=70;k=10;}   
						if(p==1){i=50;j=50;k=50;}
						if(p==2){i=25;j=25;k=100;}
						i=i+c*130;
						j=j+l*130;
						e.drawOval(i, j, k, k);
					}
             
					// si le programme tombe sur un cercle du joueur 3 (3)
					if(plateau[c][l][p] == 3){
						if(Couleur3==1){e.setColor(Color.GREEN);}
						if(Couleur3==2){e.setColor(Color.BLUE);}
						if(Couleur3==3){e.setColor(Color.RED);}
						if(Couleur3==4){e.setColor(Color.YELLOW);}
						if(p==0){ i=70;j=70;k=10;}   
						if(p==1){i=50;j=50;k=50;}
						if(p==2){i=25;j=25;k=100;}
						i=i+c*130;
						j=j+l*130;
						e.drawOval(i, j, k, k);
					}

					// si le programme tombe sur un cercle du joueur 4 (4)
					if (plateau[c][l][p] == 4) {
						if(Couleur4==1){e.setColor(Color.GREEN);}
						if(Couleur4==2){e.setColor(Color.BLUE);}
						if(Couleur4==3){e.setColor(Color.RED);}
						if(Couleur4==4){e.setColor(Color.YELLOW);}
						if(p==0){i=70;j=70;k=10;}   
						if(p==1){i=50;j=50;k=50;}
						if(p==2){i=25;j=25;k=100;}
						i=i+c*130;
						j=j+l*130;
						e.drawOval(i, j, k, k);
					}
					
				}
			}
		} 
		
		}
		};
		
    // ajout du panel(P) à la fenètre (window)
		window.add(P);
		
    // rendre la fenètre visible 
		window.setVisible(true);
		
		}
}
