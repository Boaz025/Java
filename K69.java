class pkg1{
    double width;
    double height;
    double depth;
    pkg1(double w, double h, double d){
	width=w;
	height=h;
	depth=d;}
    double volume(){
	return (width*height*depth);}}
   public class K69{
    public static void main(String[] args){
	pkg1 box1=new pkg1(10,20,15);
	pkg1 box2=new pkg1(3,6,9);
	System.out.println("Volume is " + box1.volume());
	System.out.println("Volume is " + box2.volume());}}





