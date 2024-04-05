import java.util.*;

public class Telecommande {
    private List<Lampe> lampes;

    public Telecommande() {
        lampes = new ArrayList<>();
    }

    public void ajouterLampe(Lampe lampe) {
        lampes.add(lampe);
    }

    public void allumerLampe(int indiceLampe) {
        lampes.get(indiceLampe).allumer();
    }

    public void eteindreLampe(int indiceLampe) {
        lampes.get(indiceLampe).eteindre();
    }

    public void activerTout() {
        for (Lampe lampe : lampes) {
            lampe.allumer();
        }
    }
}
