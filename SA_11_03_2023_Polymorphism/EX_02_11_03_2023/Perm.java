package EX_02_11_03_2023;

import java.util.ArrayList;
import java.util.List;

public class Perm {

    public void perm(int a, int b) {
        List<Integer> numbList = new ArrayList<>();
        numbList.add(a);
        numbList.add(b);
        for (int i = 0; i < numbList.size(); i++) {

            System.out.print(numbList);
            int temp = numbList.get(0);
            numbList.remove(0);
            numbList.add(temp);
            System.out.println();
        }
    }
    public void perm(int a, int b, int c) {
        List<Integer> numbList = new ArrayList<>();
        numbList.add(a);
        numbList.add(b);
        numbList.add(c);
        for (int i = 0; i < numbList.size(); i++) {
            for (int j = i+1; j <numbList.size() ; j++) {
                System.out.print(numbList);
                int temp = numbList.get(j);
                numbList.remove(j);
                numbList.add(temp);
            }
            int temp = numbList.get(i);
            numbList.remove(i);
            numbList.add(temp);
            System.out.println();


        }
    }
    public void perm(int a, int b, int c,int d) {
        List<Integer> numbList = new ArrayList<>();
        numbList.add(a);
        numbList.add(b);
        numbList.add(c);
        numbList.add(d);
        for (int i = 0; i < numbList.size(); i++) {

            System.out.print(numbList);
            int temp = numbList.get(0);
            numbList.remove(0);
            numbList.add(temp);
            System.out.println();
        }
    }

}
