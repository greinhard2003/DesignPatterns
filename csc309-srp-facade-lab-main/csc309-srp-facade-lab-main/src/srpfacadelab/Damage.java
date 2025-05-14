public class Damage {
    public Damage(){}

        public void takeDamage(int damage) {
        if (damage < armour) {
            gameEngine.playSpecialEffect("parry");
        }

        int damageToDeal = damage - armour;
        if (calculateInventoryWeight() < .5 * MAX_CARRYING_CAPACITY)
            damageToDeal = damageToDeal * .25;
        health -= damageToDeal;

        gameEngine.playSpecialEffect("lots_of_gore");
    }
}