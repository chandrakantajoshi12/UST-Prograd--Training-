public class ShadesOfGrey {
  static String[] shadesOfGrey(int num) {
       if (num <= 0) {
            return new String[0];
        }
        if (num > 254) {
            num = 254;
        }

        String[] greys = new String[num];

        int i=0;
        while (i<num) {
            i++;
            String a = Integer.toHexString(i);
            if (a.length() == 1) {
                a = "0" + a;
            }
            greys[i-1] = "#" + a + a + a;
        }
        return greys;
    }
}