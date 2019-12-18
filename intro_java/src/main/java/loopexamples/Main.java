package loopexamples;

public class Main {
    public static void main(String[] args) {
        int[] arrayInt = {10, 20, 30, 40, 50};
        afisareElementeArray(arrayInt);
        int suma = sumaNrArray(arrayInt);
        int numar = 1501;
        inversareNumar(numar);
// afisare char string
        String propozitie = "Ana are mere";

        char[] arrayCaractere = propozitie.toCharArray();

        int nrVocale = 0;

        for ( char element: arrayCaractere) {
            System.out.println(element);
            if (element =='a' || element == 'e' || element == 'i' || element == 'o' || element == 'u'){
                nrVocale++;
            }
        }
        System.out.println("Nr vocale din string e:" + nrVocale);
        System.out.println("am iesit din bucla for. Suma finala este:" + suma);

    }
     private static void inversareNumar(int numar) {
        int numarInversat = 0;

        while (numar > 0) {
            numarInversat = numarInversat * 10 + numar % 10;
            numar = numar / 10;
         }
         System.out.println("Numarul inversat este:" + numarInversat);
     }
    private static int sumaNrArray(int[] arrayInt) {
        int suma = 0;

        for (int elem : arrayInt) {
            if (elem == 30) {
                continue;
            }
            if (suma > 100) {
                break;
            }
            suma = suma + elem;
            System.out.println("element:" + elem + " suma:" + suma);
        }


        return suma;
    }

    private static void afisareElementeArray(int[] arrayInt) {
        // afisare elemente array

        for (int elem : arrayInt) {
            System.out.println(elem);
        }
    }
}
