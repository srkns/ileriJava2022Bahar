package main;

public class Main {

    public static void main(String[] args) {
        //new Temp();
        //new Temp2();

//        Computer computer = new Computer();
//        computer.setHDD("");
//        computer.setRAM("");
//        computer.setBluetoothEnabled(true);
//        computer.setGraphicsCardEnabled();

        Computer computer = new Computer.ComputerBuilder("hdd", "ram").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
        System.out.println(computer);



    }

}
