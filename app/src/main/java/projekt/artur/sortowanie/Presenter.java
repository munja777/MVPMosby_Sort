package projekt.artur.sortowanie;

import android.widget.TextView;
import java.util.Arrays;


class Presenter {

    void sort (TextView tV) {

        String a = tV.getText().toString();
        String b, c;
        String tablica[];

        tablica = a.split(", ");
        Arrays.sort(tablica);
        b = Arrays.toString(tablica);
        c = b.substring(1, (b.length()) - 1);

        tV.setText(c);
    }

}
