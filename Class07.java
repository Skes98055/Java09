class ANS{
    int ans1;
    int ans2;
    void power(int x,int n){
        ans1=x;
        ans2=n;
    }
    void ans(){
        System.out.println(Math.pow(ans1, ans2));
    }
    
}
public class Class07{
    public static void main(String[] args) {
        ANS aa=new ANS();
        aa.power((int)Math.pow(2, 5), (int)Math.pow(3, 2));
        aa.ans();
    }
}