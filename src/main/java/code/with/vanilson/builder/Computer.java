package code.with.vanilson.builder;

import lombok.Getter;
import lombok.Setter;

/**
 * Computer
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-08
 */
@Getter
@Setter
public class Computer {
    private HDD diskSize;
    private RAM ramSize;
    private boolean hasUsbc;
    private boolean hasGigabiWifi;

    // we call this inner class directly because we don't want to modify the constructor parameters of the
    // constructor itself.'
    public static class ComputerBuilder {
        private HDD diskSize;
        private RAM ramSize;
        private boolean hasUsbc;
        private boolean hasGigabiWifi;

        // Its mutable constructor
        public ComputerBuilder() {
        }

        public ComputerBuilder setDiskSize(HDD diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        public ComputerBuilder setRamSize(RAM ramSize) {
            this.ramSize = ramSize;
            return this;
        }

        public ComputerBuilder setHasUsbc(boolean hasUsbc) {
            this.hasUsbc = hasUsbc;
            return this;
        }

        public ComputerBuilder setHasGigabiWifi(boolean hasGigabiWifi) {
            this.hasGigabiWifi = hasGigabiWifi;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }

    public Computer(ComputerBuilder builder) {
        this.diskSize = builder.diskSize;
        this.hasUsbc = builder.hasUsbc;
        this.hasGigabiWifi = builder.hasGigabiWifi;
        this.ramSize = builder.ramSize;

    }

}