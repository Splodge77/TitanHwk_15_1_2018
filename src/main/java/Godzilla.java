public class Godzilla extends Titan {
    
    private String name;
    private int hp;
    
    public Godzilla(String name, int hp){
        this.name = name;
        this.hp = hp;
    }


    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}
