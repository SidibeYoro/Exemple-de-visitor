package visiteur;

import visiteur.Objet;

public class ObjetB implements Objet {
    public String Age = "22";
    @Override
    public void accept(Visitor visit)
    {
      visit.visit(this);
    }
}
