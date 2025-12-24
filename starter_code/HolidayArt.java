import java.util.Random;

public class HolidayArt {

    public static void main(String[] args) {
        int height = 5;
        if (args.length > 0) {
            height = Integer.parseInt(args[0]);
        }
        printTree(height);
    }

    public static void printTree(int height) {
        String reset = "\u001B[0m";
        String yellow = "\u001B[33m";
        String green = "\u001B[32m";
        String brown = "\u001B[38;5;94m";
        String red = "\u001B[31m";
        String blue = "\u001B[34m";

        int starCount = 1;
        int spaceCount = height-1;
        for(int i = 1; i <= height; i++){
            System.out.print(" ".repeat(spaceCount));
            int random = (int) (Math.random() * starCount);

            if(i == 1){
                System.out.print(yellow+"\u2605"+reset);
            } else {
                for(int j = 0; j < starCount; j++) {
                   if(j!=random) {
                       System.out.print(green+"*"+reset);
                   }
                   else {
                       int ornament = (int) (Math.random() * 2);
                       int color = (int) (Math.random() * 2);
                       String colorANSI = "";
                       colorANSI = (color == 0 ? blue : red);
                       System.out.print(ornament == 0 ? colorANSI + "o" + reset : colorANSI + "O" + reset);
                   }
                }
            }
            System.out.println(" ".repeat(spaceCount));
            starCount+=2;
            spaceCount--;
        }
        spaceCount= height-2;
        System.out.print(" ".repeat(spaceCount));
        System.out.print(brown+"|||"+reset);
        System.out.println(" ".repeat(spaceCount));
        System.out.print ("Merry Christmas & Happy New Year!");
    }
}
