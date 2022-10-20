public class Main {
    public static void main(String[] args) {
        CiftYonluDairesel c=new CiftYonluDairesel();
        c.basaEkle(1);
        c.basaEkle(2);
        c.basaEkle(3);
        c.basaEkle(4);
        c.sonaEkle(5);
        c.posizyonaEkle(7,3);
        c.Listele();
        c.pozisyondanSil(1);
        c.Listele();
        c.Ara(5);
    }
}