public class rgb_to_hex {
    public static void main(String[] args) {
        //declaring some colors to use with the rgbToHex method
        int r = 255;
        int g = 127;
        int b = 0;
        //calling the method
        String hexColor = rgbToHex(r, g, b);
        System.out.println("RGB color (" + r + ", " + g + ", " + b + ") = " + hexColor);
    }

    public static String rgbToHex(int r, int g, int b) {
        //added bug here.
        r = Math.min(255, Math.max(0, r));
        g = Math.min(255, Math.max(0, g));
        //another bug here.
        b = Math.min(255, Math.min(0, b));
        return String.format("%02X%02X%02X", r, g, b);
    }
}

//Test with RGB color (255, 127, 0) = FF7F00


