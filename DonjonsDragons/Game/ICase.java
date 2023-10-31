package DonjonsDragons.Game;

import DonjonsDragons.Persos.Personnage;

public interface ICase {
     String toString();
//     void interact();

     int interact(Personnage personnage); //en paramètre le personnage, on vance la position, on récupère l'objet du tableau... les actions
     //consditionnelles sont spécifiées dans chaque interact spécifique de chaque objet...

}
