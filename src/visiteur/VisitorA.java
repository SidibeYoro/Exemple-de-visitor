package visiteur;

import visiteur.ObjetA;
import visiteur.ObjetB;
import visiteur.ObjetC;
import visiteur.Visitor;

public class VisitorA implements Visitor {

    @Override
    public void visit(ObjetA a) {
        System.out.println( "votre sexe est ".concat(a.Sexe));

    }

    @Override
    public void visit(ObjetB b) {
        System.out.println("votre age est ".concat(b.Age));
    }

    @Override
    public void visit(ObjetC c) {
        System.out.println("votre couleur est ".concat(c.Couleur));
    }
}
