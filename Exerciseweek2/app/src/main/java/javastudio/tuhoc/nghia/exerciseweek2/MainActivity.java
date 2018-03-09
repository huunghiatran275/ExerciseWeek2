package javastudio.tuhoc.nghia.exerciseweek2;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTitle;
    Button btnTitle;
    Button btnBackground;
    ConstraintLayout display0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTitle = (TextView) findViewById(R.id.textTitle);
        btnTitle = (Button) findViewById(R.id.btnTitle);
        btnBackground = (Button) findViewById(R.id.btnBackground);
        display0 = (ConstraintLayout) findViewById(R.id.display0);

        //action click change Title
        btnTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changeTitle = new Intent(MainActivity.this, ChangeTitleActivity.class);
                changeTitle.putExtra("key_currentTitle",txtTitle.getText().toString());
                changeTitle.putExtra("key_currentColor",txtTitle.getCurrentTextColor());
                startActivityForResult(changeTitle,100);
            }
        });

        btnBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changeBackground = new Intent(MainActivity.this, ChangeBackgroundActivity.class);
                startActivityForResult(changeBackground,200);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode, Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode == 100 && resultCode == RESULT_OK)
        {
            txtTitle.setText(data.getStringExtra("key_newTitle"));
            txtTitle.setTextColor(data.getExtras().getInt("key_color"));
        }
        if(requestCode == 200 && resultCode == RESULT_OK)
        {
            int resultBG = data.getExtras().getInt("key_imgBackground");
            changeBackgourd(resultBG);
        }
    }

    public  void changeBackgourd(int i)
    {
        switch (i)
        {
            case 1:
                txtTitle.setBackgroundResource(R.drawable.shutterstock_130125752_huge);
                break;
            case 2:
                txtTitle.setBackgroundResource(R.drawable.shutterstock_248651677_supersize);
                break;
            case 3:
                txtTitle.setBackgroundResource(R.drawable.shutterstock_280897220_huge);
                break;
            case 4:
                txtTitle.setBackgroundResource(R.drawable.shutterstock_316465280_huge);
                break;
            case 5:
                txtTitle.setBackgroundResource(R.drawable.shutterstock_333376544_huge);
                break;
            case 6:
                txtTitle.setBackgroundResource(R.drawable.shutterstock_390660301_huge);
                break;
        }
    }
}
