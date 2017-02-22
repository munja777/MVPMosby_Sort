package projekt.artur.sortowanie;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;


@SuppressWarnings("ResultOfMethodCallIgnored")

class Model {

    String show (Context context) {

        InputStream is = null;
        int size = 0;

        try { is = context.getAssets().open("nazwiska.txt"); }   catch (IOException e1) { e1.printStackTrace(); }

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
