package aula12.ex3;

public class Movie {
    private String name;
    private Float score;
    private String rating;
    private String genre;
    private Integer runningTime;

    public Movie(String name, Float score, String rating, String genre, Integer runningTime) {
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.genre = genre;
        this.runningTime = runningTime;
    }
    
    public String getName() {
        return this.name;
    }

    public Float getScore() {
        return this.score;
    }

    public String getRating() {
        return this.rating;
    }

    public String getGenre() {
        return this.genre;
    }

    public Integer getRunningTime() {
        return this.runningTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRunningTime(Integer runningTime) {
        this.runningTime = runningTime;
    }


    public String toString() {
        return "Name: " + this.name + "\nScore: " + this.score + "\nRating: " + this.rating + "\nGenre: " + this.genre + "\nRunning Time: " + this.runningTime;
    }
}
