package com.example.bangaliranna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btn =(Button)findViewById(R.id.btno);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Menu.this,Beef_keema_Curry.class);
                startActivity(in);
            }
        });
        btn =(Button)findViewById(R.id.btnto);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inn = new Intent(Menu.this,Mutton_stew.class);
                startActivity(inn);
            }
        });
        btn =(Button)findViewById(R.id.btnth);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inth = new Intent(Menu.this,Beef_yogurt_curry.class);
                startActivity(inth);
            }
        });
        btn =(Button)findViewById(R.id.btnfo);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent info = new Intent(Menu.this,Vegetable_cutlet.class);
                startActivity(info);
            }
        });
        btn =(Button)findViewById(R.id.btnfi);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent infi = new Intent(Menu.this,Cauliflower.class);
                startActivity(infi);
            }
        });
        btn =(Button)findViewById(R.id.btnsix);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent insix = new Intent(Menu.this,Sweet_And_Sour_Lentil.class);
                startActivity(insix);
            }
        });
        btn =(Button)findViewById(R.id.btnse);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inse = new Intent(Menu.this,Hilsa_Curry.class);
                startActivity(inse);
            }
        });
        btn =(Button)findViewById(R.id.btneight);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inei = new Intent(Menu.this,Spicy_Chicken_Ball.class);
                startActivity(inei);
            }
        });
        btn =(Button)findViewById(R.id.btnnine);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inni = new Intent(Menu.this,Catfish_Curry.class);
                startActivity(inni);
            }
        });
        btn =(Button)findViewById(R.id.btnten);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten = new Intent(Menu.this,Wholetilapia.class);
                startActivity(inten);
            }
        });
        btn =(Button)findViewById(R.id.btnele);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inele = new Intent(Menu.this,Narkel_Nadu.class);
                startActivity(inele);
            }
        });
        btn =(Button)findViewById(R.id.btntew);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intew = new Intent(Menu.this,Lobster_Curry.class);
                startActivity(intew);
            }
        });
        btn =(Button)findViewById(R.id.btnthirteen);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inthi = new Intent(Menu.this,Cauliflower_Pulao.class);
                startActivity(inthi);
            }
        });
        btn =(Button)findViewById(R.id.btnfourteen);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent infour = new Intent(Menu.this,Jhinge_Alu_Posto.class);
                startActivity(infour);
            }
        });
        btn =(Button)findViewById(R.id.btnfifteen);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent infif = new Intent(Menu.this,BEEF_REZALA.class);
                startActivity(infif);
            }
        });
        btn =(Button)findViewById(R.id.btnsixteen);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent insixt = new Intent(Menu.this,PANTA_ILISH.class);
                startActivity(insixt);
            }
        });
        btn =(Button)findViewById(R.id.btnseventeen);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inseven = new Intent(Menu.this,ALOO_BHORTA.class);
                startActivity(inseven);
            }
        });
        btn =(Button)findViewById(R.id.btneighteen);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ineighteen = new Intent(Menu.this,EGGPLANT_BHORTA.class);
                startActivity(ineighteen);
            }
        });
        btn =(Button)findViewById(R.id.btnnineteen);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inninet = new Intent(Menu.this,DAL_BHORTA.class);
                startActivity(inninet);
            }
        });
        btn =(Button)findViewById(R.id.btntwenty);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intw = new Intent(Menu.this,SHUTKI_BHORTA.class);
                startActivity(intw);
            }
        });
        btn =(Button)findViewById(R.id.btntwno);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inton = new Intent(Menu.this,Muri_Ghonto.class);
                startActivity(inton);
            }
        });
    }
}
