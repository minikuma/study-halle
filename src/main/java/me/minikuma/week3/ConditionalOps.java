package me.minikuma.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConditionalOps {
    public static void main(String[] args) {
        boolean firstConditional = false;
        boolean secondConditional = false;

        int a = 1, b = 0;
        int c = 0, d = 0;

        firstConditional = (a == b); // false
        secondConditional = (c == d);// true
        System.out.println("[firstConditional] -> " + firstConditional);
        System.out.println("[secondConditional] -> " + secondConditional);

        System.out.println("[firstConditional && secondConditional] -> " + (firstConditional && secondConditional));
        System.out.println("[firstConditional || secondConditional] -> " + (firstConditional || secondConditional));


        String[] data = {"g","o","o","d"};

        List<String> lists = new ArrayList<>(Arrays.asList(data));

        // 조건 검사
        // first conditional -> null 체크
        // second conditional -> element 갯수 3개 이상 체크

        boolean isChecked = (lists != null) && (lists.size() > 3);

        System.out.println("isChecked: " + isChecked);
    }
}
