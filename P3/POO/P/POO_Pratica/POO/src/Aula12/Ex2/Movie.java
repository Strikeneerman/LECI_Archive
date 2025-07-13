package Aula12.Ex2;

import java.util.Comparator;


public class Movie implements Comparable<Movie> {
    private String name;
    private String rating;
    private String genre;
    private double score;
    private int runningTime;

    public Movie(){}
    public Movie(String name, double score, String rating, String genre, int runningTime){
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.genre = genre;
        this.runningTime = runningTime;

    }
    public void setName(String name){this.name = name;}
    public void setRating(String rating){this.rating = rating;}
    public void setScore(double score){this.score = score;}
    public void setRunningTime(int runningTime){this.runningTime = runningTime;}

    public String getName(){return this.name;}
    public String getRating(){return this.rating;}
    public String getGenre(){return this.genre;}
    public double getScore(){return this.score;}
    public int getRunningTime(){return this.runningTime;}

    @Override
    public String toString(){
        return String.format("%s\t%.2f\t%s\t%s\t%2d\n",this.name,this.score,this.rating,this.genre,this.runningTime);
    }
    @Override
    public boolean equals(Object o){
        if(o == null)
          return false;
        if(this == o)
          return true;
        if(this.getClass() != o.getClass())
           return false;
        Movie other = (Movie) o;
        return this.name.equals(other.name) && this.rating.equals(other.rating) && this.genre.equals(other.genre) 
                && this.score == other.score && this.runningTime == other.runningTime;
    }
    @Override
    public int hashCode(){
        int aux = (int)(score + runningTime)/2;
        return this.name.hashCode() + this.rating.hashCode() + this.genre.hashCode() + aux;
    }
    @Override
    public int compareTo(Movie other) {
        // TODO Auto-generated method stub
        return this.name.compareToIgnoreCase(other.name);
    }
    public int compareToScore(Movie other){
        if(this.score > other.score)
          return -1;
        else if(this.score < other.score)
          return 1;
        else
           return 0; 
    }
    public int compareToRunTime(Movie other){
        return this.runningTime - other.runningTime;
    }

}
