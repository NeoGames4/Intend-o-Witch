package pi;

import com.diozero.api.I2CDevice;

public class Joystick {
    private static final int COMMAND_BIT = 0b10000100;

    private static final I2CDevice device = new I2CDevice(1, 0x4b);

    private static int readADC(int channel) {
        if (channel < 0 || channel > 7) {
            throw new IllegalArgumentException("Channel must be between 0 and 7");
        }

        // Build the command for the specified channel
        int command = COMMAND_BIT | (channel << 4);

        try {
            // Write the command to the device
            device.writeByte((byte) command);

            // Wait for ADC to settle (ADS7830 typically needs a short delay)
            Thread.sleep(1);

            // Read the 8-bit result from the ADC

            return device.readByte() & 0xFF;
        } catch (Exception e) {
            e.printStackTrace();
            return -1; // Error case
        }
    }

    public static float readX() {
        return 2f * readADC(7) / 0xff - 1;
    }
    public static float readY() {
        return 2f * readADC(6) / 0xff - 1;
    }
}
