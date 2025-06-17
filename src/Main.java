import accorde.models.Podcast;
import accorde.models.Song;

public class Main {
    public static void main(String[] args) {
        //Instanciando Podcast
        Podcast pd = new Podcast();
        pd.setTitle("FÁBIO AKITA - Flow #458");
        pd.setHost("Igor3K");
        pd.setDuration(130);
        pd.addSponsor("Philip Mead");
        pd.addSponsor("iFood");
        pd.addSponsor("Insider");
        pd.play();
        pd.pause();
        pd.play();
        pd.play();
        pd.play();
        pd.stop();
        pd.rate(10);
        pd.rate(7);
        pd.rate(2);
        pd.rate(8);
        pd.getSponsors();

        pd.showDetails();

        Song sg = new Song();
        sg.setTitle("SONHA COMIGO");
        sg.setArtist("Zé Neto e Cristiano");
        sg.setDuration(3);
        sg.rate(6);
        sg.rate(10);
        sg.rate(2);

        sg.showDetails();
    }
}