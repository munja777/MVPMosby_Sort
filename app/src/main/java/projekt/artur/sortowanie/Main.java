package projekt.artur.sortowanie;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;


@SuppressWarnings("ResultOfMethodCallIgnored")
public class Main extends AppCompatActivity {

    TextView tV;
    Button bt, bt2;
    String a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutname);

        tV = (TextView) findViewById(R.id.textView);
        bt = (Button) findViewById(R.id.bt);
        bt2 = (Button) findViewById(R.id.bt2);
    }



    void wyswietl() {

        InputStream is = null;

        try { is = getAssets().open("nazwiska.txt"); }   catch (IOException e1) { e1.printStackTrace(); }

        int size = 0;

        try {
            assert is != null;
            size = is.available();
        } catch (IOException e1) { e1.printStackTrace(); }

        byte[] buffer = new byte[size];

        try { is.read(buffer); }   catch (IOException e1) { e1.printStackTrace(); }

        try { is.close(); }   catch (IOException e1) { e1.printStackTrace(); }

        String text = new String(buffer);
        tV.setText(text);
    }



    public void bt(View view) { wyswietl(); }

    public void bt2(View view) {

        a = tV.getText().toString();
        String b, c;
        String tablica[];

        tablica = a.split(", ");
        Arrays.sort(tablica);
        b = Arrays.toString(tablica);
        c = b.substring(1,(b.length())-1);


        tV.setText(c);
    }

}
