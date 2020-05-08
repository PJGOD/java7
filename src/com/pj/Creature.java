package com.pj;

import java.util.ArrayList;

public abstract class Creature {
    private String id;
    private String description;
    private int HpValue;
    private Weapon currentWeapon;
//    private Weapon currentAttackWeapon;
//    private Weapon currentDefenceWeapon;
    private ArrayList<Weapon> weapons=new ArrayList<>();

    public abstract void useArticle(Weapon weapon, Creature targetCreature);

    public Creature(String id, String description, int hpValue) {
        this.id = id;
        this.description = description;
        HpValue = hpValue;
    }

    public Creature(){
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHpValue() {
        return HpValue;
    }

    public void setHpValue(int hpValue) {
        HpValue = hpValue;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }
}
