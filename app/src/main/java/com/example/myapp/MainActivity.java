package com.example.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.myapp.adapters.ContactsAdapter;
import com.example.myapp.model.Person;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
ContactsAdapter contactsAdapter;
ArrayList<Person> people=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.list_listview);
        Person person=new Person("aaa","bbb","123");
        Person person1=new Person("ccc","bbb","46885");
        Person person2=new Person("aaa","bbb","6541");
        Person person3=new Person("aaa","fff","53468");
        Person person4=new Person("www","bbb","348658");
        Person person5=new Person("fff","kkk","45344");
        Person person6=new Person("rrr","lll","34512");
        Person person7=new Person("ppp","uuu","645333");
        Person person8=new Person("zzz","ttt","8646654");
        Person person9=new Person("www","bbb","348658");
        Person person10=new Person("fff","kkk","45344");
        Person person11=new Person("rrr","lll","34512");
        Person person22=new Person("ppp","uuu","645333");
        Person person33=new Person("zzz","ttt","8646654");
        people.add(person);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);
        people.add(person11);
        people.add(person22);
        people.add(person33);
        contactsAdapter = new ContactsAdapter(people);
        listView.setAdapter(contactsAdapter);
    }
}
