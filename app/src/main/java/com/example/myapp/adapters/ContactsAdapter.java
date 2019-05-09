package com.example.myapp.adapters;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapp.R;
import com.example.myapp.model.Person;

import java.util.ArrayList;

public class ContactsAdapter extends BaseAdapter {
    ArrayList<Person> people=new ArrayList<>();

    public ContactsAdapter(ArrayList<Person> people) {
        this.people = people;
    }

    @Override
    public int getCount() {
        return people.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        ViewHolder holder;
        if (convertView==null){
            Log.d("blu3","NULL");
            convertView= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
            holder=new ViewHolder(convertView);
            convertView.setTag(holder);
        }
        else {Log.d("blu3","NULL");
            holder=(ViewHolder) convertView.getTag();

        }
        holder.emri.setText(people.get(position).getEmri()+" "+people.get(position).getMbiemri());
        holder.call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+people.get(position).getTelefoni()));
                parent.getContext().startActivity(i);
            }
        });
        return convertView;
    }

    class ViewHolder{
        TextView emri;
        Button call;
        ViewHolder(View v){
            emri=(TextView) v.findViewById(R.id.emri_textview);
            call=(Button) v.findViewById(R.id.call_button);
        }
    }
}




