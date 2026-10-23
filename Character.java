

class Character{
    private String name;
    private int maxHp;
    private int currentHp;
    private int attack;
    private int defense;
    private String[] actions = {"Attack", "Defend", "Heal"};

    public setCurrentHp(int maxHp) {
        this.currentHp = maxHp;
    }
    // Taking damage
    public int takeDamage(int attack, int defense, int currentHp) {
        //dmg = raw dmg x (100/ (100 + defense)) I searched for a simple math function
        this.currentHp = attack * (100 / (100 + defense));
        return currentHp;
    }
    // Healing damage
    public int heal(int currentHp) {
        this.currentHp = currentHp + 15; // needs work
        return currentHp;
    }
    // Check if dead
    public boolean dead(int currentHp) {
        boolean death = false;
        if (currentHp > 0) {
            continue;
        }
        else {
            death = true;
        }
        return death;
    }

    
            
    
    //////////////////
    //Getter methods/
    ////////////////
    public String getName(){
        return name;
    }
    public long getMaxHp(){
        return maxHp;
    }
    public long getCurrentHp(){
        return currentHp;
    }
    public long getAttack(){
        return attack;
    }
    public long getDefense(){
        return defense;
    }
    public Character(name, maxHp, attack, defense) {

    
        
}

