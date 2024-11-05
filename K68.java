class pkg1{
    double width;
    double height;
    double depth;
    pkg1(){
	System.out.println("Constructing Box");
	width=10;
	height=10;
	depth=10;}
    double volume(){
	return (width*height*depth);}}
   public class K68{
    public static void main(String[] args){
	pkg1 box1=new Box();
	pkg1 box2=new Box();
	System.out.println("Volume is " + box1.volume());
	System.out.println("Volume is " + box2.volume());}}





