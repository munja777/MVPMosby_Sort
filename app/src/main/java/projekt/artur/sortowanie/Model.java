package projekt.artur.sortowanie;

import java.io.IOException;
import java.io.InputStream;


class Model {


    static String showNames() {

        InputStream is = null;
        int size = 0;

        try { is = Main.context.getAssets().open("nazwiska.txt"); }   catch (IOException e1) { e1.printStackTrace(); }

        try {
            assert is != null;
            size = is.available();
        } catch (IOException e1) { e1.printStackTrace(); }

        byte[] buffer = new byte[size];

        try { is.read(buffer); }   catch (IOException e1) { e1.printStackTrace(); }
        try { is.close(); }   catch (IOException e1) { e1.printStackTrace(); }

        return new String(buffer);
    }

}