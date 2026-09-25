class Solution {
    public int addDigits(int num) {
        if(num<10)return num;
        while(num>=10){
            int sum=0;
            int val=num;
            while(val!=0){
                int rev = val%10;
                sum+=rev;
                val/=10;
            }
            num = sum;
        }
        return num;
    }
}   

