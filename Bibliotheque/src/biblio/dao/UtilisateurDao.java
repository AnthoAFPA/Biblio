package biblio.dao;


import biblio.metier.Utilisateur;
import biblio.metier.Adherent;
import biblio.metier.Employe;

//Cette Classe permet l'acc�s aux donn�es (dao)
//version "Mock object" : objet bouchon (pour les tests)
public class UtilisateurDao {
	// Tableau qui simule la Base de Donn�es des Utilisateurs
	private Utilisateur utilisateurDB[] = { 
			new Adherent(1, "nom", "prenom", "pseudonyme", "pwd"),
			new Employe(2, "HOLLUIGUE", "Anthony", "test", "test") 
			};

	// M�thode qui retourne l'utilisateur dont on fournit l'idUtilisateur
	public Utilisateur findByKey(int id) {
		for (Utilisateur utilisateur : utilisateurDB) {
			if (utilisateur.getIdUtilisateur() == id)
				return utilisateur;
		}
		return null;
	}
}
