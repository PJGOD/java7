package com.pj;

public class Person extends Creature{
    @Override
    public void useArticle(Weapon weapon, Creature targetCreature) {
            weapon.useArticle(targetCreature);
    }
}
