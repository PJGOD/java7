package com.pj;

import java.util.ArrayList;

public class MonsterWolfSet {
    private ArrayList<MonsterWolf> monsterWolves=new ArrayList<>();

    //根据id(String)来查找对应的MonsterWolf对象
    //如果找到了对应的id的Monster，返回相应的对象，如果没有找到就返回空
    public MonsterWolf get(String id){
        MonsterWolf monsterWolf=null;
        for (MonsterWolf item:monsterWolves
             ) {
            if(true == id.equals(item.getId())){
                monsterWolf=item;
                break;
            }
        }
        return monsterWolf;
    }
    public MonsterWolfSet(ArrayList<MonsterWolf> monsterWolves) {
        this.monsterWolves = monsterWolves;
    }

    public MonsterWolfSet() {

    }

    public ArrayList<MonsterWolf> getMonsterWolves() {
        return monsterWolves;
    }

    public void setMonsterWolves(ArrayList<MonsterWolf> monsterWolves) {
        this.monsterWolves = monsterWolves;
    }
}
