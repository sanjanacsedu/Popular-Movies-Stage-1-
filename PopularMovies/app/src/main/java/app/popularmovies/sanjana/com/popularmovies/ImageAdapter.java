package app.popularmovies.sanjana.com.popularmovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by sanjana on 4/12/16.
 */
//public class ImageAdapter extends BaseAdapter {

    //public class ImageAdapter extends BaseAdapter {
public class ImageAdapter extends ArrayAdapter<Movie>{

    private ArrayList<String> imageUrls;


    private Context context;
    private LayoutInflater inflater;

    //public ImageAdapter(Context c) {
    //    mContext = c;
    //}


    public ImageAdapter(Context context, ArrayList<Movie> movies) {
        super(context, R.layout.grid_item_image,movies);

        this.context = context;
        inflater = LayoutInflater.from(context);
    }

/*
    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }
*/
    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;


        Movie movie = (Movie) getItem(position);

        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            convertView = inflater.inflate(R.layout.grid_item_image, parent, false);
        }


        Picasso
                .with(context)
                .load(movie.final_image_url)
                .into((ImageView) convertView);



        //imageView.setImageResource(mThumbIds[position]);
        return convertView;
    }


}