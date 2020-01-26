package visiteur;

public interface Objet    // l'interface à visiter
{
    void accept(Visitor visit);
}
