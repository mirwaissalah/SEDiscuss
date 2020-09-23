public class Discussion{
    public static void main(String[] args) {
        float sum = 0;
        for(int i=1; i<=3; i++){
            System.out.print("Enter the number " + "(" + i + "): ");
            num = input.nextFloat();
            sum = sum + num;
        }
        System.out.println("The average value is " + average(sum));
    }
}
