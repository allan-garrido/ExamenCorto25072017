package miumg.edu.gt.examencorto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2, et3, et4;
    private List<Usuario> usuarios;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);

        usuarios = new ArrayList<>();

        i = new Intent(this, InteresesActivity.class);
    }

    public void cancelar(View view) {
        et1.setText("");
        et2.setText("");
        et3.setText("");
        et4.setText("");
    }

    public void aceptar(View view) {
        if(et1.getText().toString().trim().equalsIgnoreCase(""))
            Toast.makeText(this, "No ha ingresado un nombre", Toast.LENGTH_SHORT).show();
        else
        if(et2.getText().toString().trim().equalsIgnoreCase(""))
            Toast.makeText(this, "No ha ingresado apellidos", Toast.LENGTH_SHORT).show();
        else
        if(et3.getText().toString().trim().equalsIgnoreCase(""))
            Toast.makeText(this, "No ha ingresado la contraseña", Toast.LENGTH_SHORT).show();
        else
        if(et4.getText().toString().trim().equalsIgnoreCase(""))
            Toast.makeText(this, "No ha confirmado la contraseña", Toast.LENGTH_SHORT).show();
        else
        if(!et3.getText().toString().trim().equals(et4.getText().toString().trim()))
            Toast.makeText(this, "Credenciales inválidas", Toast.LENGTH_SHORT).show();
        else{
            Usuario uTemp = new Usuario();

            uTemp.setNombre(et1.getText().toString().trim());
            uTemp.setApellidos(et2.getText().toString().trim());
            uTemp.setContrasena(et3.getText().toString().trim());

            usuarios.add(uTemp);

            startActivity(i);
        }


    }
}
