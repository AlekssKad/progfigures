import java.util.Scanner;
import java.lang.Math;
 public class Program {

    public static class figure {
        protected int angles;
        protected int R;
        protected double a;
        protected double S;
        protected double P;

        {
            this.a = 0;
            this.S = 0;
            this.P = 0;
        }

        figure( int r) {
         if(r==0){ throw new RuntimeException("There is no figure with such parameters.");};
            this.R = r;
        }
        public void getShape() {
            System.out.printf("angles: %s \n",this.angles);
            System.out.printf("R: %s \n",this.R);
            this.S = ((this.a * this.R) / 2);
            this.P = this.a * this.angles;
            System.out.printf("P: %s \n",this.P);
            System.out.printf("S: %s \n",this.S);
        }


    }
public static class circle extends figure{

    circle(int r) {
        super(r);
    }

    @Override
    public void getShape() {
        System.out.printf("angles: %s \n",this.angles);
        System.out.printf("R: %s \n",this.R);
        this.S = (3.14*this.R)*(3.14*this.R);
        this.P = 3.14*this.R;
        System.out.printf("P: %s \n",this.P);
        System.out.printf("S: %s \n",this.S);

    };
}
     public static class square extends figure {

         square(int r,int A) {
             super(r);
          if(A!=4){ throw new RuntimeException("There is no figure with such parameters.");};
             this.angles=A;
         }


         @Override
         public void getShape() {
             System.out.printf("angles: %s \n",this.angles);
             System.out.printf("R: %s \n",this.R);
             this.a = 2 * this.R * Math.sin(Math.toRadians(180 / angles));
             this.S = ((this.a * this.R) / 2);
             this.P = this.a * this.angles;
             System.out.printf("P: %s \n",this.P);
             System.out.printf("S: %s \n",this.S);

         }
     }
     public static class triangle extends figure {

         triangle(int r,int A) {
             super(r);
          if(A!=3){ throw new RuntimeException("There is no figure with such parameters.");};
             this.angles=A;
         }

         @Override
         public void getShape() {
             System.out.printf("angles: %s \n",this.angles);
             System.out.printf("R: %s \n",this.R);
             this.a = 2 * this.R * Math.sin(Math.toRadians(180 / angles));
             this.S = ((this.a * this.R) / 2);
             this.P = this.a * this.angles;
             System.out.printf("P: %s \n",this.P);
             System.out.printf("S: %s \n",this.S);

         }
     }

    public static void main(String[] args) {
        figure n1 = new figure(60);
        n1.getShape();
        figure n3 = new triangle(60,3);
        n3.getShape();
        circle n2 = new circle(180);
        n2.getShape();
        figure n4 = new square(60,4);
        n4.getShape();
    }
}
