public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0, "red");

        System.out.println("Aria obiectului circle1 este: " + circle1.getAria());
        System.out.println("Perimetrul obiectului circle1 este: " + circle1.getPerimetre());
        System.out.println("Culoarea obiectului circle1 este:  " + circle1.color);

        Circle circle2 = new Circle(7.0, "green");

        System.out.println("Aria obiectului circle2 este: " + circle2.getAria());
        System.out.println("Perimetrul obiectului circle2 este: " + circle2.getPerimetre());
        System.out.println("Culoarea obiectului circle2 este:  " + circle2.color);

        Circle circle3 = new Circle(8.0, "black");

        System.out.println("Aria obiectului circle2 este: " + circle3.getAria());
        System.out.println("Perimetrul obiectului circle2 este: " + circle3.getPerimetre());
        System.out.println("Culoarea obiectului circle2 este:  " + circle3.color);

        Circle circle4 = new Circle(10.0, "pink");
        System.out.println("APELARE METODE OBJECT CLASS");
        System.out.println(circle4.toString());

        createArrayofCircle();
    }

        private static void createArrayofCircle () {
            Circle[] circleArray = new Circle[10];

            for (int i = 0; i <= circleArray.length - 1; i++){
                if (i % 2 == 0) {
                    Circle circleEven = new Circle(i + 1, "blue");
                    circleArray[i] = circleEven;
                } else {
                    Circle circleOdd = new Circle(i + 1, "green");
                    circleArray[i] = circleOdd;
                }
            }
            //afisare culori ale cercurilor din array cu for each
            for (Circle itemCircle : circleArray) {
                System.out.println(itemCircle.color);
        }


    }
}
