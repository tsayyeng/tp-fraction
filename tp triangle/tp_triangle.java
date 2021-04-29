import dessin

public static void main ( string [] args) { // pour montrer l'image du triangle
	triangle= nouveau triangle ();
	affiche triangle();
}
%%

creation de la classe:

%%(php)
package dessin;

classe publique triangle {
	point prive pointa, pointb, pointc;

triangle public (pointa , pointb, pointc) {  // on crée 3 point 
	pointa = A;
	pointb = B;
	pointc = C;
}

public void affiche () {
	système.dehors.println ("triangle ABC"); pointa.affiche(); //on affiche les points du triangle
	système.dehors.println (" A "); pointa.affiche();
	système.dehors.println (" B "); pointa.affiche();
	système.dehors.println (" C "); pointa.affiche();
}
	}
%%

création de la classe point:
%%(php)
//utilisation de GET
public double getpointa () { // elle permet de renvoyer x et y 
	renvoyer ceci.x;
	renvoyer ceci.y;
}

public double getpointb () {
	renvoyer ceci.x;
	renvoyer ceci.y;
}

public double getpointc () {
	renvoyer ceci.x;
	renvoyer ceci.y;
}

//utilisation déplacement

public void deplacerpointa (double hauteur, double largeur) {
ceci.x= hauteur;
ceci.y= largeur;
}

public void deplacerpointb (double hauteur, double largeur) {
ceci.x= hauteur;
ceci.y= largeur;
}

public void deplacerpointc (double hauteur, double largeur) {
ceci.x= hauteur;
ceci.y= largeur;
}
%%