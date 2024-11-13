public class C3 {
    static boolean isAlphabet(String t) {
        String alphabet = "abcdefghijklmnopqrstuwxyz";
        for (int i=0; i<t.length(); i++) {
            if (i > 0) {
                char x = t.charAt(i);
                char y = t.charAt(i-1);
                if (alphabet.indexOf(x) < alphabet.indexOf(y)) {
                    return false;
                }
            }
        }
        return true;
    }

    static String hideText(String t) {
        String newString = "";
        for (int i=0; i<t.length(); i++) {
            if (i > 0 && i < t.length()-1) {
                newString += "*";
            }
            else {
                newString += t.charAt(i);
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(C3.isAlphabet("abegsw"));
        System.out.println(C3.isAlphabet("abcmhsw"));
        System.out.println(C3.hideText("apple"));
        System.out.println(C3.hideText("ok"));
    }
}
