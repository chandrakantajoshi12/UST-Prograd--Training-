public class Rectangle {
    public double l;
    public double b;
    public double area(){
        return  l*b;
    }

}
  class Cuboid extends  Rectangle {
    public double h;
    public double volume() {
        return area() * h;
    }

}

 class Main{
    public  static  void  main(String[] args){
        Cuboid cuboid= new Cuboid();
        cuboid.l= 3;
        cuboid.b=4;
        cuboid.h=5;
        System.out.println(cuboid.area());
        System.out.println(cuboid.volume());
    }

 }