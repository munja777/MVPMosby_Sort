package projekt.artur.sortowanie;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hannesdorfmann.mosby.mvp.MvpActivity;


public class Main extends MvpActivity<MainView, MainPresenter> implements MainView {

    TextView tV;
    Button bt, bt2;
    public static Context context;
    public static Context getContext() { return context; }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutname);

        tV = (TextView) findViewById(R.id.textView);
        bt = (Button) findViewById(R.id.bt);
        bt2 = (Button) findViewById(R.id.bt2);

        context = getApplicationContext();
    }

    Model model;

    @NonNull
    @Override
    public MainPresenter createPresenter(){ return new MainPresenter(); }

    public void bt(View view) { presenter.showText(); }
    public void bt2(View view) { presenter.showSort(); }


    @Override
    public void show(String textArray) { tV.setText(textArray); }

    @Override
    public void sort(String sortArray) { tV.setText(sortArray); }

}
