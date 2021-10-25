package id.ac.uversrivaldo.javacode1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int AngkaRandom;

    public void makeToast(String string){

        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();

    }

    public void guess(View view) {

        EditText guessEditText = (EditText) findViewById(R.id.angka);
        
        int IntAngka = Integer.parseInt(guessEditText.getText().toString());

        if (IntAngka > AngkaRandom){

            makeToast("Lebih Rendah");

        } else if (IntAngka < AngkaRandom) {

            makeToast("Lebih Tinggi");
        } else {
            makeToast("Yee Benar, Coba Tebak Lagi!!");

            Random rand = new Random();
            AngkaRandom = rand.nextInt(25) + 1;

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        AngkaRandom = rand.nextInt(25) + 1;


    }
}