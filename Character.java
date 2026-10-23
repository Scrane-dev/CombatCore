

class Character{
    private String name;
    private int maxHp;
    private int currentHp;
    private int attack;
    private int defense;
    private String[] actions = {"Attack", "Defend", "Heal"};

    public Character(String name,int maxHp, int attack, int defense) {
        this.name = name;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.attack = attack;
        this.defense = defense;
    }
    // Taking damage
    public int takeDamage(int damage) {
        //dmg = raw dmg x (100/ (100 + defense)) I searched for a simple math function 100 22 15
        this.currentHp = currentHp - (damage * 100) / (100 + this.defense);
        if (currentHp <= 0) {
            currentHp = 0;
        }
        return currentHp;
    }
    // Healing damage
    public int heal(int currentHp) {
        this.currentHp = currentHp + 15; // needs work
        return currentHp;
    }
    // Check if dead
    public boolean dead() {
        boolean death = false;
        if (currentHp > 0) {
            death = false;
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
    public int getMaxHp(){
        return maxHp;
    }
    public int getCurrentHp(){
        return currentHp;
    }
    public int getAttack(){
        return attack;
    }
    public int getDefense(){
        return defense;
    }

    
        
}

