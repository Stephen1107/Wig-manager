public class Delivery {
    // 1. Properties (State)
    String riderName;
    String currentLocation;
    String status;

    // 2. Constructor
    // It only asks for the rider's name, because location and status are always the same at the start.
    public Delivery(String inputName) {
        this.riderName = inputName;
        this.currentLocation = "Wig Warehouse"; 
        this.status = "Assigned";               
    }

    // 3. Behavior (Action)
    // This method receives new data from the real world and updates our variables.
    public void updateLocation(String newLocation, String newStatus) {
        // Update our object's internal memory with the new values passed in
        this.currentLocation = newLocation;
        this.status = newStatus;

        // Print a live tracking alert to the console
        System.out.println("\n🛰️ [LIVE TRACKING UPDATE]");
        System.out.println("Rider: " + this.riderName);
        System.out.println("Current Location: " + this.currentLocation);
        System.out.println("Status: " + this.status);
        System.out.println("-------------------------");
    }
}