public class Prime {
    public boolean check(int a){
        int f=0;
        for (int i=2;i<a/2+1;i++){
            if(a%i==0){
                f=1;
                break;
            }
        }
        if (f==0){
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        Prime p=new Prime();
        for (int i=2;i<10;i++){
            if(p.check(i)==true){
                System.out.println(i);
            }
        }
    }
}
