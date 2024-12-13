package pkg;

public class Movie{
    String name;
    double rating;
    int nor;
    int revenue;
    public Movie(){
        name = "Avengers";
        rating = 8.0;
        nor = 33;
        revenue = 623357910;
    }
    public Movie(String name, double rating, int nor, int revenue){
        this.name = name;
        this.rating = rating;
        this.nor = nor;
        this.revenue = revenue;
    }
    public void movieToString(){
        System.out.println("Movie: " + name);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + nor);
        System.out.println("Revenue: " + revenue);
        System.out.println(" ");
    }
    public String getMovieName(){
        return name;
    }
    public int getRevenue(){
        return revenue;
    }
    public void addRating(double num){
        double rating1 = rating * nor;
        double rating2 = rating1 + num;
        double rating3 = rating2/(nor + 1);
        rating = rating3;
        nor = nor + 1;
    }
    public boolean compareRatings(Movie a){
        if(this.rating > rating){
            return true;
        }
        else{
            return false;
        }
    }
}
