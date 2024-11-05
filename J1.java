package pkg1;
class Bank2
{
    int getInterestRate()
    {
    return 0;
    }
}
class canara extends Bank2
{
    int getInterestRate()
    {
        return 5;
    }
}
class SBI extends Bank2
{
    int getInterestRate()
    {
        return 6;
    }
}
class SCDCC extends Bank2
{
    int getInterestRate()
    {
        return 8;
    }
}
public class J1
{
    public static void main(String[]args)
    {
        canara bank1=new canara();
        SBI bank2=new SBI();
        SCDCC bank3=new SCDCC();
        System.out.println("Bank1:"+bank1.getInterestRate()+"%");
        System.out.println("Bank2:"+bank2.getInterestRate()+"%");
        System.out.println("Bank3:"+bank3.getInterestRate()+"%");
    }
}