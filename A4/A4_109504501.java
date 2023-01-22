/**
 Assignment 4
 Student Number : 109504501
 Course : CE1004-B
 */

public class A4_109504501 {
    static public void main(String args[]){
        Archer archer = new Archer("Alex",10,100);
        Medic medic = new Medic("Justin",5,100);
        System.out.printf("弓箭手：(%s, %d, %d)%n", archer.getName(),archer.getLevel(), archer.getHealth());
        System.out.printf("醫護兵：(%s, %d, %d)%n", medic.getName(),medic.getLevel(), medic.getHealth());
        archer.Reload();
        archer.Attack();
        medic.Cure();
    }
}


class Character{
    String name;
    int level;
    int health;
    public Character(){
        this.name = name;
        this.health = health;
        this.level = level;
    }

    public String getName(){
        return name;
    }

    public int getLevel(){
        return level;
    }

    public int getHealth() {
        return health;
    }
}

class Archer extends Character{
    public Archer(String name, int level, int health){
        this.name = name;
        this.level = level;
        this.health = health;

    }
    void Attack(){
        System.out.println("弓箭手：發射弓箭");
    }
    void Reload(){
        System.out.println("弓箭手：填裝彈藥");
    }
}

class Medic extends Character{
    public Medic(String name, int level, int health){
        this.name = name;
        this.level = level;
        this.health = health;

    }
    void Cure(){
        System.out.println("醫護兵：治癒中");
    }
}