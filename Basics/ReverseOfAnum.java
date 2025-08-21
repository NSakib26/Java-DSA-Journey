public class ReverseOfAnum {
    public static void main(String args[]){
        int num=264017;
        int ReverseNum=0;
        while (num>0){
            int lastDigit=num%10;
            //System.out.print(lastDigit);
            ReverseNum=(ReverseNum*10)+lastDigit;
            num=num/10;
        }
             System.out.println("Reverse of the number: "+ ReverseNum);
    }
}
