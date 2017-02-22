package projekt.artur.sortowanie;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Main extends AppCompatActivity {

    TextView tV;
    Button bt, bt2;
    Context c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutname);

        tV = (TextView) findViewById(R.id.textView);
        bt = (Button) findViewById(R.id.bt);
        bt2 = (Button) findViewById(R.id.bt2);
        c = getApplicationContext();
    }

    Model model = new Model();

    public void bt(View view) { model.wyswietl(tV, c); }
    public void bt2(View view) { model.sortuj(tV); }

}
