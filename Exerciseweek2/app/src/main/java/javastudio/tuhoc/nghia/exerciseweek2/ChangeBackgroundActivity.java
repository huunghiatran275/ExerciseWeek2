package javastudio.tuhoc.nghia.exerciseweek2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ChangeBackgroundActivity extends AppCompatActivity {

    int imgBackgroud = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_background);
        ImageView bg1 = (ImageView) findViewById(R.id.bg1);
        ImageView bg2 = (ImageView) findViewById(R.id.bg2);
        ImageView bg3 = (ImageView) findViewById(R.id.bg3);
        ImageView bg4 = (ImageView) findViewById(R.id.bg4);
        ImageView bg5 = (ImageView) findViewById(R.id.bg5);
        ImageView bg6 = (ImageView) findViewById(R.id.bg6);

        Button btnSave = (Button) findViewById(R.id.btnSaveBG);

        final View viewBG = (View) findViewById(R.id.viewBG);

        bg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgBackgroud = 1;
            }
        });

        bg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgBackgroud = 1;
                viewBG.setBackgroundResource(R.drawable.shutterstock_130125752_huge);
            }
        });

        bg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewBG.setBackgroundResource(R.drawable.shutterstock_248651677_supersize);
                imgBackgroud = 2;
            }
        });

        bg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewBG.setBackgroundResource(R.drawable.shutterstock_280897220_huge);
                imgBackgroud = 3;
            }
        });

        bg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewBG.setBackgroundResource(R.drawable.shutterstock_316465280_huge);
                imgBackgroud = 4;
            }
        });

        bg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewBG.setBackgroundResource(R.drawable.shutterstock_333376544_huge);
                imgBackgroud = 5;
            }
        });

        bg6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewBG.setBackgroundResource(R.drawable.shutterstock_390660301_huge);
                imgBackgroud = 6;
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }

    @Override
    public void finish()
    {
        Intent i = new Intent();
        i.putExtra("key_imgBackground",imgBackgroud);
        setResult(RESULT_OK,i);
        super.finish();
    }
}
