package Frontend;

import Backend.*;

public class TestBackend {

    public static void main(String[] args) {
        int x = 0, blnP = 1, blnK = 2, tglP = 1, tglK = 1;
        
        for (int i = 0; i < blnK - 1; i++) {
            System.out.println(blnP % 2);
            if (blnP % 2 == 0) {
                if (blnP == 2) {
                    x += 28;
                } else {
                    x += 31;
                }
            } else {
                x += 30;
            }
            if (blnP == 12) {
                blnP = 1;
            } else {
                blnP++;
            }
        }
        System.out.println(x);
        blnP = 1;
        if (blnP % 2 == 0) {
            if (blnP == 2) {
                x = x + (28 - tglP) - 28 + tglK;
            } else {
                x = x + (31 - tglP) - 31 + tglK;
            }
        } else {
            x = x + (30 - tglP) - 30 + tglK;

        }
        System.out.println(x);
    }
}
