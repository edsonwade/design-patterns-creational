package code.with.vanilson.builder;

/**
 * ComputerBuilderDemo
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-08
 */
public class ComputerBuilderDemo {

    public static void main(String[] args) {
        Computer.ComputerBuilder builder = new Computer.ComputerBuilder()
                .setDiskSize(HDD.MAX)
                .setRamSize(RAM.UPGRADE)
                .setHasUsbc(true)
                .setHasGigabiWifi(true);

        Computer computer = builder.build();
        System.out.println(computer.getDiskSize() + " "
                + computer.getRamSize() + " "
                + computer.isHasUsbc() + " "
                + computer.isHasGigabiWifi());
    }

    /**  Not the best scenery coz it immutable
     Computer computer = new Computer();
     computer.setDiskSize(HDD.DEFAULT);
     computer.setRamSize(RAM.DEFAULT);
     computer.setHasUsbc(true);
     computer.setHasGigabiWifi(true);

     System.out.println(computer.getDiskSize()
     + ", " + computer.getRamSize()
     + ", USBC: " + computer.isHasUsbc()
     + ", Gigabit WiFi: " + computer.isHasGigabiWifi());

     */

}