package classes;

public class UIcolor implements AuditColor{
    private int r;
    private int g;
    private int b;
    public UIcolor(int r, int g, int b) throws ValueOutOfRangeException {
        checkNumberRange(r, g, b);
        this.r = r;
        this.g = g;
        this.b = b;
    }
    public int getR() { return r; }
    public int getG() { return g; }
    public int getB() { return b; }
    public  static  UIcolor of(Color rgb) throws ValueOutOfRangeException {
        int r = rgb.getR() + 128,
            g = rgb.getG() + 128,
            b = rgb.getB() + 128;
        return new UIcolor(r,g,b);
    }
    public  static  UIcolor of(int r, int g, int b) throws ValueOutOfRangeException {
        return UIcolor.of(new Color(r, g, b));
    }
    @Override
    public String toString() {
        return "UIcolor{" +
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
                     "The numeric range must be from 0 to 255.\n";
            if(num < 0 || num > 255)
             throw new ValueOutOfRangeException(message);
        }
    }
}
