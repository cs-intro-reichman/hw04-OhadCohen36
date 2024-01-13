public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(camelCase("tWo    wordS"));
    }

    public static String capVowelsLowRest (String string) {
        // Write your code here:
        String ans = "";
        int i = 0;
        while (i < string.length()) {
            char ch = string.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                ans = ans + (char) (ch - 32);
            else {
                if (ch > 64 && ch < 91 && ch != 65 && ch != 69 && ch != 73 && ch != 79 && ch != 85)
                    ans = ans + (char) (ch + 32);
                else
                    ans = ans + (char) (ch);
            }
            i++;
        }
        return ans;
    }

    public static String camelCase (String string) {
        // Write your code here:
        String ans = "";
        int i = 0;
        while (i < string.length()) {
            char ch = string.charAt(i);
            if (ch != ' ')
                break;
            i++;
        }
        while (i < string.length() && string.charAt(i) != ' ') {
            char ch = string.charAt(i);
            if (ch > 64 && ch < 91)
                ans = ans + (char) (ch + 32);
            else
                ans = ans + ch;
            i++;
        }
        while (i < string.length()) {
            char ch = string.charAt(i);
            if (ch == ' ' && (i + 1) < string.length() && string.charAt(i + 1) > 96 && string.charAt(i) < 123) {
                ans = ans + (char) (string.charAt(i + 1) - 32);
                i++;
            } else if (ch == ' ' && (i + 1) < string.length() && string.charAt(i + 1) > 64 && string.charAt(i + 1) < 91) {
                ans = ans + (char) (string.charAt(i + 1));
                i++;
            } else if (ch > 64 && ch < 91) {
                ans = ans + (char) (ch + 32);
            } else if (ch != ' ') {
                ans = ans + ch;
            }
            i++;
        }
        return ans;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr)
                count++;
        }
        int[] arr = new int[count];
        int x = 0;
        for (int j = 0; j < string.length(); j++) {
            if (string.charAt(j) == chr) {
                arr[x] = j;
                x++;
            }
        }
        return arr;
    }

    public static String lowerCase(String s) {
        // Replace the following statement with your code
        String ans = "";
        int i = 0;
        while(i < s.length())
        {
            char ch = s.charAt(i);
            if(ch > 64 && ch < 91) {
                ans = ans + (char) (ch + 32);
            }
            else {
                ans = ans + ch;
            }
            i++;
        }
        return ans;
    }
}
