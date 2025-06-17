package accorde.models;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Audio {
    private String title;
    private int duration;
    private int totalReproductions;
    private double rating;
    private int numberOfReviews;

    // Getters & Setters
    public int getTotalReproductions() {
        return totalReproductions;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Métodos da Aplicação
    public void rate(double score) {
        rating += score;
        numberOfReviews++;
    }

    public double getMediaReviews() {
        // Evitar divisão por 0.
        if (numberOfReviews == 0) {
            return 0.0;
        }

        BigDecimal bd = new BigDecimal(rating / numberOfReviews);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public void play() {
        System.out.println("Tocando " + title);
        totalReproductions++;
    }

    public void pause() {
        System.out.println("Música pausada.");
    }

    public void stop() {
        System.out.println("Nenhuma música tocando no momento.");
    }
}
