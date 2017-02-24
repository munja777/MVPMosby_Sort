package projekt.artur.sortowanie;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.hannesdorfmann.mosby.mvp.MvpView;

import java.util.Arrays;


interface MainView extends MvpView {

    void show(String textArray);
    void sort(String sortArray);
}

class MainPresenter extends MvpBasePresenter<MainView> {

    private Model model;
    MainPresenter(Model model) { this.model = model; }

    String showText() { return model.show(); }

    String showSort() {

        String a = model.show();
        String b, c;
        String tablica[];

        tablica = a.split(", ");
        Arrays.sort(tablica);
        b = Arrays.toString(tablica);
        c = b.substring(1, (b.length()) - 1);
        return c;
    }

}
