package app.popularmovies.sanjana.com.popularmovies;

/**
 * Created by sanjana on 4/14/16.
 *
 *
 *

 original title
 movie poster image thumbnail
 A plot synopsis (called overview in the api)
 user rating (called vote_average in the api)
 release date
 */




public class Movie {
    String original_title;
    String vote_average_txt;
    String final_image_url;
    String overview;
    String releaseDate;
    double vote_average;


    public Movie(String final_image_url, String original_title, String overview, String releaseDate, double vote_average, String vote_average_txt){
        this.final_image_url = final_image_url;
        this.original_title = original_title;
        this.overview = overview;
        this.releaseDate = releaseDate;
        this.vote_average = vote_average;
        this.vote_average_txt = vote_average_txt;


    }
}
