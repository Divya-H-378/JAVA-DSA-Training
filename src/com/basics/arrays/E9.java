package com.basics.arrays;
class Equipment{
        String name;
        int equipmentId;
        String lab;
        double voltage;
        boolean working;

    public Equipment(String name, int equipmentId, String lab, double voltage, boolean working) {
        this.name = name;
        this.equipmentId = equipmentId;
        this.lab = lab;
        this.voltage = voltage;
        this.working = working;
    }
}
public class E9 {
    public static void main(String[] args) {
        Equipment[] equipments = new Equipment[]{
                new Equipment("Oscilloscope", 101, "Analog Lab", 300, true),
                new Equipment("Power supply", 102, "VLSI Lab", 400, false),
                new Equipment("Signal Analyzer", 103, "DSP Lab", 500, true)
        };
        for (Equipment equipment : equipments){
            System.out.println(equipment.name + ", "
            + equipment.equipmentId + " " + equipment.lab + " " + " " + equipment.voltage + " " + equipment.working);
        }
    }
}
