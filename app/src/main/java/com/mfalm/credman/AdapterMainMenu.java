package com.mfalm.credman;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterMainMenu extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    public AdapterMainMenu(Context context, String[] values) {
        super(context, R.layout.rowlayout, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.rowlayout, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.label);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        textView.setText(values[position]);
        // Change the icon for Windows and iPhone
        String s = values[position];
        if (s.startsWith("Voda")) {
            imageView.setImageResource(R.drawable.net_log_voda);
        }



        if (s.startsWith("Air")) {
            imageView.setImageResource(R.drawable.net_log_air);
        }

        if (s.startsWith("Afri")) {
            imageView.setImageResource(R.drawable.net_log_afri);
        }

        if (s.startsWith("Ora") ){
            imageView.setImageResource(R.drawable.net_log_ora);
        }

        return rowView;
    }




}
