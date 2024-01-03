package other;

import java.util.Arrays;
public class ImageOfArray {
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int len = image[i].length;
            for (int j = 0; j < len / 2; j++) {
                int a = image[i][j];
                int b = image[i][len - j - 1];
                if (a != b) {
                    if (a == 0) {
                        image[i][len - j - 1] = 1;
                        image[i][j] = 0;
                    } else {
                        image[i][len - j - 1] = 0;
                        image[i][j] = 1;
                    }
                } else {
                    if (a == 0)
                        image[i][j] = image[i][len - j - 1] = 1;
                    else
                        image[i][j] = image[i][len - j - 1] = 0;
                }
                if (len % 2 != 0 && len != 1) {
                    if (image[i][(len / 2)] == 0)
                        image[i][(len / 2)] = 1;
                    else
                        image[i][(len / 2)] = 0;
                }
            }
        }
        return image;
    }
    public static void main(String[] args) {
        int[][] image = {{1}};
        image = flipAndInvertImage(image);
        System.out.println(Arrays.toString(image[0]));
    }
}
