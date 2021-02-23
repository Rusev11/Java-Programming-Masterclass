public class PointChallenge {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }

    public static class Point {
        private int x;
        private int y;

        public Point() {

        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public double distance (){
            return Math.sqrt(this.x*this.x + this.y*this.y);
        }

        public double distance (Point secondPoint){
            int deltaX = this.x - secondPoint.getX();
            int deltaY = this.y - secondPoint.getY();
            return Math.sqrt(Math.pow((double) deltaX, 2) + Math.pow((double) deltaY, 2) );
        }
        public double distance (int x, int y){
            int deltaX = this.x - x;
            int deltaY = this.y - y;
            return Math.sqrt(Math.pow((double) deltaX, 2) + Math.pow((double) deltaY, 2) );
        }


    }
}
