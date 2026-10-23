public class CombatCore {
    public static void main(String[] args) {
        Character Hero = new Character("Hero", 100, 18, 15);
        Character Villian = new Character("Villian", 100, 18, 15);

        while (Hero.dead() == false && Villian.dead() == false) {
            if (Hero.getCurrentHp() > 0) {
                Villian.takeDamage(Hero.getAttack());
                System.out.println("The Villan has " + Villian.getCurrentHp() +  " health left!");
            }
            
            if (Villian.getCurrentHp() > 0) {

                Hero.takeDamage(Villian.getAttack());
                System.out.println("The Hero has " + Hero.getCurrentHp()  + " health left!");
            }
        }
        if (Hero.dead()) {
            System.out.println("The Hero has fallen!");
        }
        if (Villian.dead()) {
            System.out.println("The Hero has saved us all!");
        }
        

    }
}
