package unorganized.BOJ_Sol1152;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int pre_str = 32;   // ASCII CODE = ' '
        int str;

        while(true){
            str = System.in.read();

            if (str == 32){
                if(pre_str != 32) count++;
            }
            // ASCII CODE 10 = '\n'
            else if (str == 10) {
                if(pre_str != 32) count++;
                break;
            }
            pre_str = str;
        }
        System.out.println(count);
    }
}
