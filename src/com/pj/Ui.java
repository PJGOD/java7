package com.pj;

public class Ui {
    public void displayStaus(Sense sense){
        System.out.println("------------------------------------------");
        System.out.println(sense.getPerson().getDescription()+":"+sense.getPerson().getHpValue());
        for (MonsterWolf item:sense.getMonsterWolfSet().getMonsterWolves()
             ) {
            System.out.print(item.getId()+"("+item.getDescription()+")"+":"+item.getHpValue()+";");
        }
        System.out.println();
        System.out.println("------------------------------------------");
    }
    public void displayHelpMsg(){
        System.out.println("有三条可用命令：chop(chop wolf1) bye help");
    }
    public void displayBye(){
        System.out.println("再见。");
    }
    public void displayErrorCmdMsg(){
        System.out.println("你输入的都是非法命令。");
    }
    public void displayDamageMsg(Creature attackCreature,Creature targetCreature){
        System.out.println(attackCreature.getDescription()+"对"+targetCreature.getDescription()+
                "照成"+attackCreature.getCurrentWeapon().getDamagePoints()+"伤害。");
    }
}
