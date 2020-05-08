package com.pj;

public class MonsterWolf extends Creature{
    @Override
    public void useArticle(Weapon weapon, Creature targetCreature) {
        weapon.useArticle(targetCreature);
}
}
