public class largestofthree{
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        int num3=15;
        int largest;
        if(num1>=num2){
            if(num1>=num3){
            }else{
                largest=num3;
            }
        }else{
            if(num2>=num3){
                largest=num2;
            }else{
                if(num2>=num3){
                    largest=num2;
                }else{
                    largest=num3;
                }
            }
            System.out.println("the largest number is:"+largest);
        }
    }
}