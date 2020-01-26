package visiteur;

import visiteur.Objet;

public class ObjetA implements Objet
{
    public String Sexe = "masculin";

    @Override
    public void accept(Visitor visit)
    {
        visit.visit(this);
    }
}
