package com.example.toshiba.lab20july2017;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Contacts> {


    public CustomAdapter(@NonNull Context context, @LayoutRes ArrayList<Contacts> contactes) {
        super(context, R.layout.activity_custom_adapter, contactes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        TextView textView;
        TextView textView1;
        ImageView imageView;
        ViewHolder viewHolder;

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.activity_custom_adapter, null);

            textView = view.findViewById(R.id.tvName);
            textView1 = view.findViewById(R.id.tvEmail);
            imageView = view.findViewById(R.id.imageView);

            viewHolder = new ViewHolder(textView, textView1, imageView);
            view.setTag(viewHolder);
        }

        Contacts c = getItem(position);
        viewHolder = (ViewHolder) view.getTag();

        viewHolder.textView.setText(c.getName());
        viewHolder.textView1.setText(c.getEmail());
        viewHolder.imageView.setImageResource(R.drawable.picture);
        return view;
    }

    public class ViewHolder {
        TextView textView;
        TextView textView1;
        ImageView imageView;

        public ViewHolder(TextView textView, TextView textView1, ImageView imageView) {
            this.textView = textView;
            this.textView1 = textView1;
            this.imageView = imageView;
        }
    }


}
