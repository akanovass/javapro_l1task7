package com.example.javapro_l1task7;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Footballer> footballers = new ArrayList<>();
    private static int index=0;

    static{
        Footballer f1 = new Footballer(index,"Zara","Kevin", 780640,"Barselona FC",223200);
        footballers.add(f1);
    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        DBManager.index = index;
    }

    public static void addFootballer(Footballer footballer){
        footballers.add(footballer);
        index++;
    }

    public static ArrayList<Footballer> getAllFootballers(){
        return footballers;
    }
}
