package miumg.edu.gt.examencorto;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class InteresesActivity extends AppCompatActivity {
    RadioButton rb1,rb2,rb3,rb4,rb5,rb6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intereses);

        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);
        rb5 = (RadioButton) findViewById(R.id.rb5);
        rb6 = (RadioButton) findViewById(R.id.rb6);
    }

    public void enviar(View view){
        if(!rb1.isChecked()&&!rb2.isChecked())
            Toast.makeText(this, "No ha elegido Android", Toast.LENGTH_SHORT).show();
        if(!rb3.isChecked()&&!rb4.isChecked())
            Toast.makeText(this, "No ha elegido Java", Toast.LENGTH_SHORT).show();
        if(!rb5.isChecked()&&!rb6.isChecked())
            Toast.makeText(this, "No ha elegido Spring", Toast.LENGTH_SHORT).show();
        else {
            String Android, Java, Spring;

            if (rb1.isChecked())
                Android = " Android: " + rb1.getText().toString();
            else
                Android = "";
            if (rb3.isChecked())
                Java = " Java: " + rb3.getText().toString();
            else
                Java = "";
            if (rb5.isChecked())
                Spring = " Spring: " + rb5.getText().toString();
            else
                Spring = "";

            Toast.makeText(this, "Preferencias listas para monitoreo" +
                     Android +
                     Java +
                     Spring, Toast.LENGTH_SHORT).show();
        }
    }
}
