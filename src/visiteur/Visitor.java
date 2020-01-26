package visiteur;

import visiteur.ObjetA;
import visiteur.ObjetB;
import visiteur.ObjetC;

public interface Visitor //l'interface qui permet de visiter l'interface à visiter
{

    void visit(ObjetA a);
    void visit (ObjetB b);
    void visit(ObjetC c);

}
