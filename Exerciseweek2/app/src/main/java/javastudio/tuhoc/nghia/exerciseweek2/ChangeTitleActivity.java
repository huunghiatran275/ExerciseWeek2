package javastudio.tuhoc.nghia.exerciseweek2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ChangeTitleActivity extends AppCompatActivity {

    Button btnSave;
    TextView txtTitle;
    int colorChoose = 0;
    View viewColorSample;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_title);
        btnSave = (Button) findViewById(R.id.btnSave);
        txtTitle = (TextView) findViewById(R.id.textEditTitle);
        viewColorSample = (View) findViewById(R.id.viewImageSample);
        Bundle data = getIntent().getExtras();


        ImageView pink = (ImageView) findViewById(R.id.iv1);
        ImageView purple = (ImageView) findViewById(R.id.iv2);
        ImageView indigo = (ImageView) findViewById(R.id.iv3);
        ImageView blue = (ImageView) findViewById(R.id.iv4);
        ImageView teal = (ImageView) findViewById(R.id.iv5);
        ImageView green = (ImageView) findViewById(R.id.iv6);


        // data from main to show current text and color
        if (data != null) {
            String currentTitle = data.getString("key_currentTitle");
            txtTitle.setText(currentTitle);
            viewColorSample.setBackgroundColor(data.getInt("key_currentColor"));
            colorChoose = data.getInt("key_currentColor");
        }

        pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorChoose = getResources().getColor(R.color.pink);
                viewColorSample.setBackgroundColor(colorChoose);
            }
        });

        indigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorChoose = getResources().getColor(R.color.indigo);
                viewColorSample.setBackgroundColor(colorChoose);
            }
        });

        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorChoose = getResources().getColor(R.color.purple);
                viewColorSample.setBackgroundColor(colorChoose);
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorChoose = getResources().getColor(R.color.blue);
                viewColorSample.setBackgroundColor(colorChoose);
            }
        });

        teal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorChoose = getResources().getColor(R.color.teal);
                viewColorSample.setBackgroundColor(colorChoose);
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorChoose = getResources().getColor(R.color.green);
                viewColorSample.setBackgroundColor(colorChoose);
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
            i.putExtra("key_newTitle",txtTitle.getText().toString());
            i.putExtra("key_color",colorChoose);
            setResult(RESULT_OK,i);
            super.finish();
        }
}
