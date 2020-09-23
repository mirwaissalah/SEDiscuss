//edit for pullrequest and newseries
import java.util.Scanner;
public class Discussion{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float su = 0;
        for(int i=1; i<=3; i++){
            System.out.print("Enter the number " + "(" + i + "): ");
            num = input.nextFloat();
            su = su + num;
        }
        System.out.println("The average value is " + average(su));
    }
    public static float average(float y){
        float avg = y / 3;
        return  avg;
    }
}
