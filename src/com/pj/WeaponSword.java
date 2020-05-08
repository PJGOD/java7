package com.pj;

public class WeaponSword extends Weapon{
    public WeaponSword(String id, String description, int damagePoints) {
        super(id, description, damagePoints);
    }

    @Override
    public void useArticle(Creature enemyCreature) {
            enemyCreature.setHpValue(enemyCreature.getHpValue()+this.getDamagePoints());
    }
}
