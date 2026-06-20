public class Inventory {
    String managerName;

    public Inventory(String inputName) {
        this.managerName = inputName;
    }

    public void restockProduct(Product item, int amountToAdd) {
        item.stockQuantity = item.stockQuantity + amountToAdd;

        System.out.println("\n📦 [INVENTORY RESTOCK]");
        System.out.println("Manager " + this.managerName + " successfully restocked " + item.name);
        System.out.println("New Stock Level: " + item.stockQuantity + " units.");
        System.out.println("----------------------");
    }
}