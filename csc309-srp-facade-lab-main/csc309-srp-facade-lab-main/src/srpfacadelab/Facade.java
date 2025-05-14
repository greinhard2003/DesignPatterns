public class Facade{

    public Facade(Damage damage, Inventory inventory) {
        this.damage = damage,
        this.inventory = inventory
    }

    public int calculateInventoryWeight() {
        inventory.calculateInventoryWeight();
    }

    public boolean checkIfItemExistsInInventory(Item item){
        inventory.checkIfItemExistsInInventory(item);
    }

    public void calculateStats(){
        inventory.calculateStats();
    }

    public boolean pickUpItem(Item item){
        inventory.pickUpItem(item);
    }

    public void useItem(Item item){
        inventory.useItem(item);
    }

    public takeDamage(int damage){
        damage.takeDamage(damage);
    }
}