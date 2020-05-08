package com.pj;

public class WeaponKnife extends Weapon {
    public WeaponKnife(String id, String description, int damagePoints) {
        super(id, description, damagePoints);
    }

    @Override

    public void useArticle(Creature enemyCreature) {
            enemyCreature.setHpValue(enemyCreature.getHpValue()+this.getDamagePoints());
    }
}
