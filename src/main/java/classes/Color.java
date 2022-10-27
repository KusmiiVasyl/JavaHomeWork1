package classes;

public class Color implements AuditColor {
    private byte r;
    private byte g;
    private byte b;
    public Color(int r, int g, int b) throws ValueOutOfRangeException {
        checkNumberRange(r, g, b);
        this.r = (byte)r;
        this.g = (byte)g;
        this.b = (byte)b;
    }
    public byte getR() { return r; }
    public byte getG() { return g; }
    public byte getB() { return b; }
    public  static  Color of(UIcolor rgb) throws ValueOutOfRangeException {
        byte r = (byte)(rgb.getR() - 128),
             g = (byte)(rgb.getG() - 128),
             b = (byte)(rgb.getB() - 128);
        return new Color(r,g,b);
    }
    public  static  Color of(int r, int g, int b) throws ValueOutOfRangeException {
        return Color.of(new UIcolor(r, g, b));
    }
    @Override
    public String toString() {
        return "Color{" +
                "r=" + r +
                ", g=" + g +
                ", b=" + b +
                '}';
    }
    @Override
    public void checkNumberRange(int... nums) throws ValueOutOfRangeException {
        String message;
        for (int num : nums) {
            message = "\nERROR!!!\nThe number " + num + " is out of range.\n" +
                    "The numeric range must be from -128 to 127.\n";
            if(num < -128 || num > 127)
                throw new ValueOutOfRangeException(message);
        }
    }
}
