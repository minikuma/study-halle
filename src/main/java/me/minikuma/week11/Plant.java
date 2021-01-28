package me.minikuma.week11;

import java.util.*;

/**
 * Created by wminikuma@gmail.com on 2021/01/27
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class Plant {
    final String name;
    final LifeCycle lifeCycle;

    enum LifeCycle {ANNUAL, PERENNIAL, BIENNIAL}

    public Plant(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    public String toString() {
        return name;
    }

    public static void useOrdinal(List<Plant> farm) {
        Set<Plant>[] plantByLifeCycle = (Set<Plant>[]) new Set[LifeCycle.values().length];

        for (int i = 0; i < plantByLifeCycle.length; i++) {
            plantByLifeCycle[i] = new HashSet<>();
        }

        for (Plant p : farm) {
            plantByLifeCycle[p.lifeCycle.ordinal()].add(p);
        }

        for (int i = 0; i < plantByLifeCycle.length; i++) {
            System.out.printf("%s: %s\n", Plant.LifeCycle.values()[i], plantByLifeCycle[i]);
        }
    }

    public static void useEnumMap(List<Plant> farm) {
        EnumMap<LifeCycle, Set<Plant>> plantByLifeCycle = new EnumMap<>(LifeCycle.class);

        for (Plant.LifeCycle lc : Plant.LifeCycle.values()) {
            plantByLifeCycle.put(lc, new HashSet<>());
        }

        for (Plant p : farm) {
            plantByLifeCycle.get(p.lifeCycle).add(p);
        }

        System.out.println(plantByLifeCycle);
    }


    public static void main(String[] args) {
        Plant corn = new Plant("옥수수", Plant.LifeCycle.ANNUAL);
        Plant potato = new Plant("감자", Plant.LifeCycle.BIENNIAL);
        Plant pumpkin = new Plant("호박", LifeCycle.PERENNIAL);
        Plant tomato = new Plant("토마토", LifeCycle.ANNUAL);

        List<Plant> farm = Arrays.asList(corn, potato, pumpkin, tomato);
        System.out.println("========================");
        System.out.println("ordinal 메소드 사용했을 경우");
        System.out.println("========================");
        useOrdinal(farm);
        System.out.println("========================");
        System.out.println("EnumMap 메소드 사용했을 경우");
        System.out.println("========================");
        useEnumMap(farm);
    }
}
