import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the length of the room in feet?");
        int length = scanner.nextInt();
        System.out.println("What is the width of the room in feet?");
        int width = scanner.nextInt();
        System.out.println("You entered dimensions of "+length+" feet by "+width+" feet.");
        int ft_sq = length*width;
        final double meters_sq = ft_sq *0.09290304;
        System.out.println("The area is\n"+ft_sq+" square feet.\n"+meters_sq+" meters squared");


    }
}
