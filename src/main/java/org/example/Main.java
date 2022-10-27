package org.example;

import classes.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         try{
             //create UIcolor
             UIcolor uiColor1 = new UIcolor(255,255,255);
             System.out.println(uiColor1 + "\t- uiColor1");
             UIcolor uiColor2 = UIcolor.of(-128, -128, 0);
             System.out.println(uiColor2 + "\t- uiColor2 create by UIcolor.of through the parameters numbers");
             //Convert UIcolor to Color
             Color color1 = Color.of(uiColor1);
             System.out.println(color1 + "\t- convert uiColor1 to Color through the parameter class");
             //Create Color
             Color color2 = Color.of(255,255,255);
             System.out.println(color2 + "\t- color2 create by static class Color through the parameters numbers");
             Color color3 = new Color(-128,127,127);
             System.out.println(color3 + "\t- color3");
             //Convert Color to UIcolor
             UIcolor uiColor3 = UIcolor.of(color3);
             System.out.println(uiColor3 + "\t- uiColor3 create by static class UIcolor through the parameter class");
          } catch (ValueOutOfRangeException ex) {
         System.out.println(ex.getMessage());
         }
    }
}