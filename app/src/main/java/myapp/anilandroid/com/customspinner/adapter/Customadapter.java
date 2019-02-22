package myapp.anilandroid.com.customspinner.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import myapp.anilandroid.com.customspinner.R;
import myapp.anilandroid.com.customspinner.model.Countryitems;

public class Customadapter extends BaseAdapter {

    Context context;
    ArrayList <Countryitems> countrydata;
    LayoutInflater layoutInflater;

    public Customadapter(Context context, ArrayList<Countryitems> countrydata) {
        this.context = context;
        this.countrydata = countrydata;
    }

    @Override
    public int getCount() {
        return countrydata.size();
    }

    @Override
    public Object getItem(int position) {
        return countrydata.get( position );
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        layoutInflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        convertView=layoutInflater.inflate( R.layout.country_row_items,null );

        Countryitems countryitems=(Countryitems)getItem( position );

        ImageView imageView=convertView.findViewById( R.id.country_flag );
        TextView textView1=convertView.findViewById( R.id.country_names );
        TextView textView2=convertView.findViewById( R.id.country_capital );

        imageView.setImageResource( countryitems.getImages() );
        textView1.setText( countryitems.getNames() );
        textView2.setText( countryitems.getCapital() );

        return convertView;
    }
}
