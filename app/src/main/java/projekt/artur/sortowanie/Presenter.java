package projekt.artur.sortowanie;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.hannesdorfmann.mosby.mvp.MvpView;

import java.util.Arrays;


interface MainView extends MvpView {

    void show(String a);
    void sort(String c);
}

@SuppressWarnings("ConstantConditions")
class MainPresenter extends MvpBasePresenter<MainView> {

    private Model model;
    MainPresenter(Model model) { this.model = model; }


    void showText() {

        String a = model.showNames();
        getView().show(a);
    }


    void showSort() {

        String a = model.showNames();
        String b, c;
        String tablica[];

        tablica = a.split(", ");
        Arrays.sort(tablica);
        b = Arrays.toString(tablica);
        c = b.substring(1, (b.length()) - 1);
        getView().sort(c);
    }

}
