public class CombatCore {
    public static void main(String[] args) {
        Character Hero = new Character("Hero", 100, 18, 15);
        Character Villian = new Character("Villian", 100, 22, 10);

        while (Hero.getCurrentHp() > 0 && Villian.getCurrentHp()) > 0 {
            Villian.takeDamage(Hero.getAttack());
            Hero.takeDamage(Villian.getAttack());
        }
        if (Hero.dead()) {
            System.out.println("The Hero has fallen!");
        }
        if (Villian.dead()) {
            System.out.println("The Hero has saved us all!");
        }


    }
}
