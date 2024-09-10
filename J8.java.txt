public class J8{
   public static void main(String[] args){
        Strings s1,s2;
        int i;
        s1="A B C D E F";
        for(i=0;i<6;i++)
        {
        s2=s1.substring(0,i);
        System.out.print(s2);
        }
        for(i=4;i<0;i++)
        {
        s2=s1.substring(0,i);
        System.out.print(s2);
        }
}
}