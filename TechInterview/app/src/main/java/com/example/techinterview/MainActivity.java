package com.example.techinterview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.techinterview.databinding.ActivityMainBinding;
import com.example.techinterview.oop_basics.Person;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Person person = new Person("Persona", 20);
        String tvOneText = String.valueOf(person.printNumbers());
        binding.textViewOne.setText(tvOneText);
//        TextView tv: TextView = findViewById(R.id.text_view).text = person.printNumbers();

    }
}