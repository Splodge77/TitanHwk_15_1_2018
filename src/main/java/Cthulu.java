public class Cthulu extends Titan{

    String name;
    int hp;
    int dmg;

    public Cthulu(String name, int hp, int dmg){
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
    }


    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDmg() {
        return dmg;
    }
}
