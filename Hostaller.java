public class Hosteller { private double collegeFee; private double blockName; private double roomType;

public Hosteller(double collegeFee, double blockName, double roomType) {
    this.collegeFee = collegeFee;
    this.blockName = blockName;
    this.roomType = roomType;
}

public double calculateTotalAmount() {
    return collegeFee + blockName + roomType;
}

public double getCollegeFee() {
    return collegeFee;
}

public void setCollegeFee(double collegeFee) {
    this.collegeFee = collegeFee;
}

public double getBlockName() {
    return blockName;
}

public void setBlockName(double blockName) {
    this.blockName = blockName;
}

public double getRoomType() {
    return roomType;
}

public void setRoomType(double roomType) {
    this.roomType = roomType;
}

public static void main(String[] args) {
    double collegeFee = 70000;
    double blockName = 40000;
    double roomType = 2500;

    Hosteller hosteller = new Hosteller(collegeFee, blockName, roomType);
    double totalAmount = hosteller.calculateTotalAmount();
    System.out.println("Total Amount: " + totalAmount);
}
                       }
