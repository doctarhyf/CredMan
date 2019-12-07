package com.mfalm.credman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ActivityNetDetails extends AppCompatActivity {


    private static final String TAG = "CredMan";
    private String[] nets = new String[] { "Vodacom", "Airtel", "Africell",
            "Orange", "Test" };

    private ImageView ivLogo;
    private TextView tvNet;
    private ListView lvTrans;
    private ListAdapter adpTrans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net_details);

        ivLogo = findViewById(R.id.ivNetLogo);
        tvNet = findViewById(R.id.tvNetName);
        lvTrans = findViewById(R.id.lvTrans);

        adpTrans = new AdapterTransList(this, new String[] { "trans", "Trans2", "trans", "Trans2", "Trans2", "trans", "Trans2", "Trans2", "trans", "Trans2", "Trans2", "trans", "Trans2", "Trans2", "trans", "Trans2", "Trans2", "trans", "Trans2", "Trans2", "trans", "Trans2", "Trans2", "trans", "Trans2", "Trans2", "trans", "Trans2", "Trans2", "trans", "Trans2", "Trans2", "trans", "Trans2", "Trans2", "trans", "Trans2", "Trans2", "trans", "Trans2", "Trans2", "trans", "Trans2", "Trans2", "trans", "Trans2", "Trans2", "trans", "Trans2", "Trans2", "trans", "Trans2", "Trans2", "trans", "Trans2", "Trans2", "trans", "Trans2", "Trans2", "trans", "Trans2"});

        String net = getIntent().getStringExtra("net");

        Log.e(TAG, "onCreate: " );

        getSupportActionBar().setTitle(net);



        if(net.equals(nets[0])){
            ivLogo.setImageDrawable(getResources().getDrawable(R.drawable.net_log_voda));

            loadNetStats(net);

        }

        if(net.equals(nets[1])){
            ivLogo.setImageDrawable(getResources().getDrawable(R.drawable.net_log_air));

            loadNetStats(net);
        }

        if(net.equals(nets[2])){
            ivLogo.setImageDrawable(getResources().getDrawable(R.drawable.net_log_afri));

            loadNetStats(net);
        }

        if(net.equals(nets[3])){
            ivLogo.setImageDrawable(getResources().getDrawable(R.drawable.net_log_ora));

            loadNetStats(net);
        }
    }

    private void loadNetStats(String net) {

        Log.e(TAG, "loadNetStats: -> " + net );
        tvNet.setText(net);


        lvTrans.setAdapter(adpTrans);
    }
}
