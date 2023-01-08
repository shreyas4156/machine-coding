package com.shreyas.lld.parkingLot.entity;


import java.util.List;

public class ParkingLot {
    private String parkingLotId;
    private int noOfFloors;
    private int noOfSlotsPerFloors;
    private List<ParkingFloor> parkingFloors;

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public ParkingLot(String parkingLotId, int noOfFloors, int noOfSlotsPerFloors) {
        this.parkingLotId = parkingLotId;
        this.noOfFloors = noOfFloors;
        this.noOfSlotsPerFloors = noOfSlotsPerFloors;
    }

    public String getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(String parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public void setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    public int getNoOfSlotsPerFloors() {
        return noOfSlotsPerFloors;
    }

    public void setNoOfSlotsPerFloors(int noOfSlotsPerFloors) {
        this.noOfSlotsPerFloors = noOfSlotsPerFloors;
    }
}

class ParkingFloor {
    private int floorNumber;
    private List<ParkingSlot> parkingSlots;

    public ParkingFloor(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }
}
class ParkingSlot {

}