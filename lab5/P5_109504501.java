/**
 Practice 5
 Student Number : 109504501
 Course : CE1004-B
 */
import java.util.Scanner;

public class P5_109504501 {
    public static void main(String args[]){
        String hero;
        int hp_hero;
        int atk_hero;
        String weapon;
        int weapon_atk;
        Scanner sc = new Scanner(System.in);

        // 創建英雄
        System.out.println("Please Create a hero: ");

        System.out.print("Name: ");
        hero = sc.next();

        System.out.print("Hp: ");
        hp_hero = sc.nextInt();

        System.out.print("Atk: ");
        atk_hero = sc.nextInt();

        System.out.print(hero + "'s Weapon: ");
        weapon = sc.next();

        System.out.print(hero + "'s Weapon Atk: ");
        weapon_atk = sc.nextInt();

        System.out.print("\n");


        int n = 0;
        int i = 1;
        while (n == 0) {
            // 創建敵人
            String enemy;
            int hp_enemy;
            int atk_enemy;
            String dropItem;
            System.out.println("Please Create an enemy: ");

            System.out.print("Name: ");
            enemy = sc.next();

            System.out.print("Hp: ");
            hp_enemy = sc.nextInt();

            System.out.print("Atk: ");
            atk_enemy = sc.nextInt();

            System.out.print("DropItem: ");
            dropItem = sc.next();

            System.out.println("============");
            System.out.println("A Wild " + enemy + " appeared!");

            int k = 1;
            while (k == 1) {
                System.out.println("What will " + enemy + " do?");
                if (i != 1) {
                    Hero Hero2 = new Hero(hero, hp_hero);
                    Enemy Enemy2 = new Enemy(enemy, hp_enemy);
                } else if (i == 1) {
                    Hero Hero = new Hero(hero, hp_hero);
                    Enemy Enemy = new Enemy(enemy, hp_enemy);
                }
                System.out.println("1.Attack 2.Do nothing");
                int action = sc.nextInt();
                if (action == 1) {
                    if (!(hp_hero <= 0)) {
                        System.out.println(hero + " use " + weapon + " and hurt " + enemy + " " + (atk_hero + weapon_atk) + " points.");
                        hp_enemy = hp_enemy - (atk_hero + weapon_atk);
                    }


                    // hero win
                    if (hp_enemy <= 0) {
                        System.out.println(hero + " win!");
                        System.out.println(enemy + " dropped item " + dropItem + " left on the ground.");
                        System.out.println("Want another adventure?");
                        System.out.println("1.Yes 2.No");
                        int adventure = sc.nextInt();
                        if (adventure == 1) {
                            k = 0;
                        }
                        if (adventure == 2) {
                            System.out.println("Game over");
                            break;
                        }
                    }
                    if (!(hp_enemy <= 0)) {
                        System.out.println(enemy + " hurt " + hero + " " + atk_enemy + " points.");
                        hp_hero = hp_hero - atk_enemy;
                    }

                    // enemy win
                    if (hp_hero <= 0) {
                        System.out.println(enemy + " win!");
                        System.out.println(hero + "'s weapon " + weapon + " left on the ground.");
                        System.out.println("Game over");
                        n++;
                        break;
                    }
                } else {
                    System.out.println(hero + " is doing nothing.");
                    // enemy win
                    if (hp_enemy > hp_hero) {
                        System.out.println(enemy + " win!");
                        System.out.println(hero + "'s weapon " + weapon + " left on the ground.");
                    }
                    // hero win
                    else if (hp_hero > hp_enemy) {
                        System.out.println(hero + " win!");
                        System.out.println(enemy + " dropped item " + dropItem + " left on the ground.");
                    }
                    System.out.println("Game over");
                    break;
                }
                i++;


            }
            if(hp_enemy > hp_hero){
                n++;
                break;
            }
        }
    }
}

class Role {
    private String name;
    private int hp;
    private boolean isDead;
    private int atk;

    public Role(String name, int hp) {
        super();
        this.name = name;
        this.hp = hp;
        System.out.println(this.name + "'s Hp: " + this.hp);
    }


    public void attack(Role opponent) {
        // subtract health points from the opponent
        opponent.determineHp(this.atk);

    }

    public void determineHp(int damageTaken) {
        if (this.getHp() - damageTaken <= 0) {
            this.setHp(0);
            this.setDead(true);
        } else {
            this.setHp(this.hp - damageTaken);
        }
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isDead() {

        return isDead;
    }

    public void setDead(boolean isDead) {
        this.isDead = isDead;
    }
}

class Hero extends Role {
    public Hero(String name, int hp){
        super(name, hp);
    }
}

class Enemy extends Role {
    public Enemy(String name, int hp) {
        super(name, hp);
    }
}