package com.pj;

public class WeaponDagger extends Weapon{
    //给敌人生物的生命值造成伤害
    //道具使用方法
    //修改
    @Override
    public void useArticle(Creature enemyCreature) {
            enemyCreature.setHpValue(enemyCreature.getHpValue()+this.getDamagePoints());
    }
}
