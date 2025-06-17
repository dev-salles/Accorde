package accorde.models;
import accorde.interfaces.Detail;

public class Song extends Audio implements Detail {
    private String artist;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public void showDetails() {
        System.out.println(String.format("""
                \nTitulo: %s
                Artista: %s
                Duração: %d Minutos
                Total de Reproduções: %d
                Reviews: %f
                """, getTitle(), getArtist(), getDuration(), getTotalReproductions(), getMediaReviews()));
    }
}
