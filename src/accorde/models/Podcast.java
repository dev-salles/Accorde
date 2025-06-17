package accorde.models;
import accorde.interfaces.Detail;
import java.util.ArrayList;
public class Podcast extends Audio implements Detail {
    private String host;
    private ArrayList<String> sponsors = new ArrayList<>();

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public ArrayList<String> getSponsors() {
        return sponsors;
    }

    public void addSponsor(String sponsor) {
        this.sponsors.add(sponsor);
    }

    @Override
    public void showDetails() {
        System.out.println(String.format("""
                \nTitulo: %s
                Host: %s
                Patrocinadores: %s 
                Duração: %d Minutos
                Total de Reproduções: %d
                Reviews: %f
                """, getTitle(), getHost(), getSponsors(), getDuration(), getTotalReproductions(), getMediaReviews()));
    }
}
