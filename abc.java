//Second edit
// the previous one was first edit i got mistaken
import java.util.Scanner;
public class Discussion{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sum = 0;
        float num = 0;
        for(int i=1; i<=3; i++){
            System.out.print("Enter the number " + "(" + i + "): ");
            num = input.nextFloat();
            sum = sum + num;
        }
        System.out.println("The average value is " + average(sum));
    }
    public static float average(float y){
        float avg = y / 3;
        return  avg;
    }
}
