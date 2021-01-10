package vampire;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> reVam = new ArrayList<>();
        for (int i = 1000; i < 10000; i++) {
            int fourth = i % 10;
            int b = i % 100;
            int third = b / 10;
            int first = i / 1000;
            int e = i / 100;
            int second = e % 10;
                String a1 = first + "" + second;
                int a2 = Integer.parseInt(a1);
                String b1 = first + "" + third;
                int b2 = Integer.parseInt(b1);
                String c1 = first + "" + fourth;
                int c2 = Integer.parseInt(c1);
                String d1 = second + "" + first;
                int d2 = Integer.parseInt(d1);
                String e1 = second + "" + third;
                int e2 = Integer.parseInt(e1);
                String f1 = second + "" + fourth;
                int f2 = Integer.parseInt(f1);
                String g1 = third + "" + first;
                int g2 = Integer.parseInt(g1);
                String h1 = third + "" + second;
                int h2 = Integer.parseInt(h1);
                String i1 = third + "" + fourth;
                int i2 = Integer.parseInt(i1);
                String j1 = fourth + "" + first;
                int j2 = Integer.parseInt(j1);
                String k1 = fourth + "" + second;
                int k2 = Integer.parseInt(k1);
                String l1 = fourth + "" + third;
                int l2 = Integer.parseInt(l1);
                int r11 = a2 * i2;
                int r12 = a2 * l2;
                int r21 = b2 * f2;
                int r22 = b2 * k2;
                int r31 = c2 * e2;
                int r32 = c2 * h2;
                int r41 = d2 * i2;
                int r42 = d2 * l2;
                int r51 = e2 * c2;
                int r52 = e2 * j2;
                int r61 = f2 * b2;
                int r62 = f2 * g2;
                int r71 = g2 * f2;
                int r72 = g2 * k2;
                int r81 = h2 * c2;
                int r82 = h2 * j2;
                int r91 = i2 * a2;
                int r92 = i2 * d2;
                int r101 = j2 * e2;
                int r102 = j2 * h2;
                int r111 = k2 * b2;
                int r112 = k2 * g2;
                int r121 = l2 * a2;
                int r122 = l2 * d2;
                if (i == r11 || i == r12 || i == r21 || i == r22 || i == r31 || i == r32 || i == r41 || i == r42 || i == r51 || i == r52 || i == r61 || i == r62 || i == r71 || i == r72 || i == r81 || i == r82 || i == r91 || i == r92 || i == r101 || i == r102 || i == r111 || i == r112 || i == r121 || i == r122){
                    reVam.add(i);
                }
        }

        System.out.println(reVam);

    }

}
