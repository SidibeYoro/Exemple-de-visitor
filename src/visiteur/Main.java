package visiteur;

public class Main {
  public static void main(String[] args)
  {
      VisitorA a1 =  new VisitorA();
      ObjetA objeta = new ObjetA();
      ObjetB objetb = new ObjetB();
      ObjetC objetc = new ObjetC();

      objeta.accept(a1);
      objetb.accept(a1);
      objetc.accept(a1);

  }
}
