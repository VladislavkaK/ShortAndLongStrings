package task.fromJavarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ShortAndLongString {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(br.readLine());
        }

        int shortStr = Integer.MAX_VALUE;
        int longStr = 0;
        for (int i = 0; i < list.size(); i++) {
            String stroka = list.get(i);
            int lenStroka = stroka.length();

            if (lenStroka > longStr) {
                longStr = lenStroka;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            String stroka = list.get(i);
            int lenStroka = stroka.length();

            if (lenStroka < shortStr) {
                shortStr = lenStroka;
            }
        }

        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).length() == shortStr || list.get(i).length() == longStr)
            {
                System.out.println(list.get(i));
                break;
            }
        }

    }
}
