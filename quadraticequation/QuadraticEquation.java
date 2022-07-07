package com.company.quadraticequation;

public class QuadraticEquation {


    public static void main(String[] args){
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.calculateTheRootOfQuadraticEquation(2,5,3);

    }

    private void calculateTheRootOfQuadraticEquation(int a, int b, int c){
        //template
        //ax2 + bx + c = 0
        int delta = (int) Math.pow(b,2) - (4*a*c);
        if(delta == 0){
            int root1 = b / 2;
            int root2 = (b/2) * (-1);
            System.out.println("1-> "+root1);
            System.out.println("2-> "+root2);
            return;
        }
        if(delta < 0) {
            System.out.println("There is no reel root");
            return;
        }
        if(delta > 0){
            var root1 = ( -b + Math.sqrt(delta) ) / (2*a);
            var root2 = ( -b - Math.sqrt(delta) ) / (2*a);
            System.out.println("1-> "+root1);
            System.out.println("2-> "+root2);
        }
    }
}
