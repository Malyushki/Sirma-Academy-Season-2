
    class Figure {

        public double perimeter;
        public double area;
        //private int a;

        public void show(){
            System.out.println(this.perimeter);
            System.out.println(this.area);
        }


    }

    class Rectangle extends Figure{


    }

    // subclass | derivative | extended
    class Circle extends Figure {

        public double radius;

        public void calcDiameter(){
            System.out.println(2*radius);
            //System.out.println(this.a);

        }
    }

    class Square extends Figure {

        public double side;

        public void calcDiagonal(){
            System.out.println(Math.sqrt(this.side));
        }
    }

     public class DEMO_08_03_2023 {
         public static void main(String[] args) {


             Figure figure = new Figure();
             figure.perimeter = 12;
             figure.area = 44;
             //figure.radius = 4;
             Circle circle = new Circle();
             circle.perimeter = 6.28;
             circle.area = 19;
             circle.radius = 2;

             figure.show();
             circle.show();
             //System.out.println(f.radius);
             System.out.println(circle.radius);

             Square square = new Square();
             square.perimeter = 8;
             square.area = 2;
             square.show();
             square.side = 2;
             System.out.println(square.side);

             circle.calcDiameter();
             square.calcDiagonal();

             // Error
             //Figure f1 = new Circle();
             //Circle c1 = new Figure();

             System.out.println(square instanceof Figure);
             System.out.println(figure instanceof Square);
         }
     }
