public class Main {
    public static void main(String[] args) {
        double radius = 50;

        CircleCalculator circleCalculator = new CircleCalculator();
        circleCalculator.setRadius(radius);

        double area = circleCalculator.calcArea();
        double circumference = circleCalculator.calcCircumference();

        System.out.println(
            "半径" + radius + "メートルの円の面積は" + area + "平方メートル, 円周の長さは" + circumference + "メートルです"
        );
    }
}

class CircleCalculator {
    /** 円周率(固定値) **/
    private double pi = 3.1415;

    /** 半径 **/
    private double radius;

    public void setRadius(double r){
         radius = r;
    }
    /**
     * 面積を求める
     * @return 面積
     */
    public double calcArea() {
        return Math.pow(radius, 2) * pi;
    }

    /**
     * 円周の長さを求める
     * @return 円周の長さ
     */
    public double calcCircumference() {
        return radius * 2 * pi;
    }
}