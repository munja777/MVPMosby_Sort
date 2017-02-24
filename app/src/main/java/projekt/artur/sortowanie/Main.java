package projekt.artur.sortowanie;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hannesdorfmann.mosby.mvp.MvpActivity;


public abstract class Main extends MvpActivity<MainView, MainPresenter> implements MainView {

    TextView tV;
    Button bt, bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutname);

        tV = (TextView) findViewById(R.id.textView);
        bt = (Button) findViewById(R.id.bt);
        bt2 = (Button) findViewById(R.id.bt2);
    }

    @Override
    public MainPresenter createPresenter(){
        return new MainPresenter(model);
    }

    public void bt(View view) { tV.setText(textArray); }
    public void bt2(View view) { tV.setText(sortArray); }

    String textArray = presenter.showText();
    String sortArray = presenter.showSort();


}
