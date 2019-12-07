package com.mfalm.credman;




import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {



    private ListView lvMain;
    private String TAG = "CredMan";
    String[] nets = new String[] { "Vodacom", "Airtel", "Africell",
            "Orange" };


    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);




        lvMain = findViewById(R.id.lvMain);


        AdapterMainMenu adapter = new AdapterMainMenu(this, nets);
        lvMain.setAdapter(adapter);

        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, ActivityNetDetails.class);
                intent.putExtra("net", nets[position]);
                startActivity(intent);
            }
        });
    }

}


