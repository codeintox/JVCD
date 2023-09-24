//StringTokenizer returns one token at a time but Split() returns array of tokens.
// StringTokenizer discards empty string.
//StringTokenizer doesn't support Regular Expression.
//\\d+ is the number delimiter.

import java.util.StringTokenizer;

public class tkndel1 {
    public static void main(String[] args) {
        String str = "123dfdf23SEDEDefe787vb";
        StringTokenizer tk = new StringTokenizer("\\d+");
        while(tk.hasMoreElements()){
            System.out.println(tk.nextElement());
        }
        System.out.println("..................................");
        String arr[] = str.split("\\d+");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }
}
