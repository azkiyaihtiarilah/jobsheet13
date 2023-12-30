import java.util.Scanner;
/**
 * Experiment608
 */
public class Experiment608 {

    static int calculateArea (int l, int w){
        int area = l * w;
        return area;
    }

    static int calculateVolume (int l, int w, int h){
        int vol = l * w * h;
        return vol;
    }

    public static void main(String[] args) {
        Scanner input08 = new Scanner (System.in);
        int p, l, t, L, vol;
        System.out.print("Input length = ");
        p = input08.nextInt();
        System.out.print("Input Width = ");
        l = input08.nextInt();
        System.out.print("Input height = ");
        t = input08.nextInt();

        L = p * l;
        System.out.println("Area of the rectangle = " + L);
        vol = p * l * t;
        System.out.println("Volume of the rectangle = " + vol);
    }
}