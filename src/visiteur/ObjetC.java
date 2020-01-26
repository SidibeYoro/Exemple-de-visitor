package visiteur;

import visiteur.*;

public class ObjetC implements Objet {
    public String Couleur = "Noir";
    @Override
    public void accept(Visitor visit)
    {
        visit.visit(this);

    }
}

