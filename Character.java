

class Character{
    private String name;
    private long maxHp;
    private long currentHp;
    private long attack;
    private long defense;
    private String[] actions = {"Attack", "Defend", "Heal"};
    
    ///////////////////
    // Setter methods/
    /////////////////
    public void setName(String name) {
        this.name = name;
    }
    public void setMaxHp(long maxHp) {
        this.maxHp = maxHp;
    }
    public void setCurrentHp(long currentHp) {
        this.currentHp = currentHp;
    }
    public void setAttack(long attack) {
        this.attack = attack;
    }
    public void setDefense(long defense) {
        this.defense = defense;
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
}

