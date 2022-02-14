package by.epam.jwd.task1;

public class TaskLogic {
    public boolean task1(int num){
        return (num / 1000) + (num / 100 % 10) == (num / 10 % 10) + (num % 10);
    }

    public double task2(double a, double b, double c){
        return ((b + Math.sqrt(b*b + 4 * a * c)) / (2 * a)) - Math.pow(a,3) * c + Math.pow(b,-2);
    }

    public double calcPerimetr(double a,double b){
        return a + b + Math.sqrt(a*a+b*b);
    }

    public double calcSquare(double a,double b){
        return a * b / 2.0;
    }

    public boolean isPointInRightPlace(double x, double y){
        if(x >= -2 && x <= 2 && y >= 0 && y <= 4) {
            return true;
        }
        else {
            if(x*x/0.25 + y*y/0.25 <= 1) return false;
            else return (x >= -4 && x <= 4 && y <= 0 && y >= -4);
        }
    }
}
