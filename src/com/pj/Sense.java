package com.pj;

import java.util.Scanner;

public class Sense {
    private Person person=new Person();
    private MonsterWolf wolf1=new MonsterWolf();
    private MonsterWolf wolf2=new MonsterWolf();
    private MonsterWolf wolf3=new MonsterWolf();
    Ui ui=new Ui();

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public MonsterWolfSet getMonsterWolfSet() {
        return monsterWolfSet;
    }

    public void setMonsterWolfSet(MonsterWolfSet monsterWolfSet) {
        this.monsterWolfSet = monsterWolfSet;
    }

    private MonsterWolfSet monsterWolfSet=new MonsterWolfSet();

    public void initSense()
    {
        initPerson();
        initMonster();
    }
    public void initPerson(){
        person.setId("201900258");
        person.setDescription("小明");
        person.setHpValue(300);
        person.setCurrentWeapon(new WeaponSword("w1","剑",-50));
    }
    public void initMonster(){
        wolf1.setId("wolf1");
        wolf1.setDescription("狼1");
        wolf1.setHpValue(200);
        wolf1.setCurrentWeapon(new WeaponKnife("mw1","大刀1",-30));

        wolf2.setId("wolf2");
        wolf2.setDescription("狼2");
        wolf2.setHpValue(200);
        wolf2.setCurrentWeapon(new WeaponKnife("mw2","大刀2",-20));

        wolf3.setId("wolf3");
        wolf3.setDescription("狼3");
        wolf3.setHpValue(200);
        wolf3.setCurrentWeapon(new WeaponKnife("mw3","大刀3",-25));

        monsterWolfSet.getMonsterWolves().add(wolf1);
        monsterWolfSet.getMonsterWolves().add(wolf2);
        monsterWolfSet.getMonsterWolves().add(wolf3);
    }
    public boolean judgeSuccess(){
        boolean flagPersonSuccess=true;

        if(this.getPerson().getHpValue() <=0){
            flagPersonSuccess=false;
        }
        return  flagPersonSuccess;
    }
    public void play()
    {
        ui.displayStaus(this);
        ui.displayHelpMsg();
        Scanner in = new Scanner(System.in);
        while (true){
            String command = in.nextLine();
            String[] cmdLineItems = command.split(" ");

            //chop by help 其他做相应的处理
            if(cmdLineItems[0].equals("bye"))
            {
                ui.displayBye();
                System.exit(0);
            }else  if(cmdLineItems[0].equals("help")){
                ui.displayHelpMsg();
            }else  if(cmdLineItems[0].equals("chop")){
//                this.getPerson().useArticle(getPerson().getCurrentWeapon(),
//                        this.getMonsterWolfSet().getMonsterWolves().);
                this.getPerson().useArticle(this.getPerson().getCurrentWeapon(),
                        this.getMonsterWolfSet().get(cmdLineItems[1]));
                ui.displayDamageMsg(this.getPerson(),this.getMonsterWolfSet().get(cmdLineItems[1]));
                //妖怪砍人 随机砍
                for (MonsterWolf item:this.getMonsterWolfSet().getMonsterWolves()
                     ) {
                    if(1==Utils.randomMonsterChop())
                    {
                        item.useArticle(item.getCurrentWeapon(),this.getPerson());
                        ui.displayDamageMsg(item,getPerson());
                    }
                }
            }else {
                ui.displayErrorCmdMsg();
                ui.displayHelpMsg();
            }
            ui.displayStaus(this);
        }
    }
}
