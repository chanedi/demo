/**
 * Created by Chanedi on 2016/3/1.
 * 最长公共子串
 */
public class LCS {

    public static int calculate(String str) {
        char[] charArr1 = str.toCharArray();
        char[] charArr2 = new StringBuffer(str).reverse().toString().toCharArray();
        int length = str.length();

        int max = 0;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int[] temp = new int[length];
            for (int j = 0; j < length; j++) {
                if (charArr1[i] == charArr2[j]) {
                    if (j == 0) {
                        temp[j] = 1;
                    } else {
                        temp[j] = result[j - 1] + 1;
                    }
                    if (temp[j] > max) {
                        max = temp[j];
                    }
                }
            }
            result = temp;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(calculate("43egologle"));
    }

}
