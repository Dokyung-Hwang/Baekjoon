package unorganized.BOJ_Sol1152;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();

        StringTokenizer st = new StringTokenizer(s, " ");

        System.out.println(st.countTokens());
    }
}
