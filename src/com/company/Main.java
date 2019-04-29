package com.company;


import java.text.DecimalFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String tempstr = "no war but the class war";
        String[] s = tempstr.split(" ");
        System.out.println(s);
        ArrayList<String> goalStr = new ArrayList<>();
        for (String items : s) {
            if (items.length() > 2) {
                for (int i = 0; i < items.length() - 1; i++) {
                    goalStr.add((items.subSequence(i, i + 2)).toString());
                }
            }
            if (items.length() == 2) {
                goalStr.add(items);
            }
        }
        Collections.sort(goalStr);
        System.out.println(goalStr);
        Map<String, Integer> map = new TreeMap<String, Integer>();
        for (int i = 0; i < goalStr.size() - 1; i++) {
            int j = 1;
            if (goalStr.get(i).equals(goalStr.get(i + 1))) {
                j++;
                i++;
            }
            map.put(goalStr.get(i), j);
        }
        System.out.println(map.toString());
        Object[] objects = map.keySet().toArray();
        for (int i = 0; i < objects.length; i++) {
            float num = (float) map.get(objects[i]) / goalStr.size();
            DecimalFormat df = new DecimalFormat("0.000000000000");
            System.out.println("[" + objects[i] + "]\t" + df.format(num));
        }
    }
}
