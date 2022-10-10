package task2;

public class ball {
    static public class Ball {
        private double x = 0, y = 0;
        public Ball (double x, double y) {
            this.x = x;
            this.y = y;
        }
        public Ball () {}
        public double getX() {
            return this.x;
        }
        public void setX(double x) {
            this.x = x;
        }
        public double getY() {
            return y;
        }
        public void setY(double y) {
            this.y = y;
        }
        public void setXY(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public void move(double xDisp, double yDisp) {
            this.x += xDisp;
            this.y += yDisp;
        }
        public String toString() {
            return "Ball: {\nX:\t"+this.x+",\nY:\t"+this.y+"\n}";
        }
    }
    static public void main() {
        Ball TestBall = new Ball(4, 6);
        System.out.println(TestBall.getX() + "\n" + TestBall.getY());
        TestBall.setX(8);
        TestBall.setY(9);
        System.out.println(TestBall.toString());
        TestBall.move(2, 4);
        System.out.println(TestBall.toString());
        TestBall.setXY(1, 1);
        System.out.println(TestBall.toString());
    }
}
