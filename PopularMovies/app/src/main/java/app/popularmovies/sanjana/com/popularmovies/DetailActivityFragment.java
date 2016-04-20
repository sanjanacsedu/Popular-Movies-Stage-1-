package app.popularmovies.sanjana.com.popularmovies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {
    private final String LOG_TAG = DetailActivityFragment.class.getSimpleName();
    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);

        Intent intent = getActivity().getIntent();
        if(intent!= null ) {

            String original_title = intent.getStringExtra("original_title");
            String releaseDate = intent.getStringExtra("releaseDate");
            String overview = intent.getStringExtra("overview");
            String final_image_url = intent.getStringExtra("final_image_url");
            String vote_average_txt = intent.getStringExtra("vote_average_txt");
            double vote_average = intent.getDoubleExtra("vote_average",0.0);



            ((TextView) rootView.findViewById(R.id.original_title)).setText(original_title);

            ((TextView) rootView.findViewById(R.id.releaseDate)).setText(releaseDate);

            ImageView iconView = (ImageView) rootView.findViewById(R.id.final_image_url);
            Picasso.with(getContext()).load(final_image_url).into(iconView);
            ((RatingBar) rootView.findViewById(R.id.vote_average)).setNumStars(10);

         //   ((TextView) rootView.findViewById(R.id.movie_rating_text)).setText("Rating:" + (float) vote_average + "/ 10");

            ((RatingBar) rootView.findViewById(R.id.vote_average)).setRating((float)vote_average);


            ((TextView) rootView.findViewById(R.id.overview))
                    .setText(overview);

            ((TextView) rootView.findViewById(R.id.ratingresult))
                    .setText(vote_average_txt);



        }
        return rootView;
    }
}
