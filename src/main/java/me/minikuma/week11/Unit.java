package me.minikuma.week11;

import java.util.EnumMap;

/**
 * Created by wminikuma@gmail.com on 2021/01/27
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class Unit {
    enum Direction { EAST, WEST, NORTH, SOUTH }
    int x, y;
    Direction d;

    void init() {
        d = Direction.EAST;
    }
}
