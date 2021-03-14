public class Main
{
    public static void main (String[] args){

        int dodawanie = Kalkulator.add(10, 17);
        System.out.println("Wynik dodawania = "+dodawanie);

        int odejmowanie = Kalkulator.subtraction(10, 17);
        System.out.println("Wynik odejmowania = "+odejmowanie);

        int mnozenie = Kalkulator.multiplication(11,17);
        System.out.println("Wynik mnożenia = "+mnozenie);

        double dzielenie = Kalkulator.division(14,3);
        System.out.println("Wynik dzielenia = "+dzielenie);

        int wartoscPola = Kalkulator.poleKwadratu(10);
        System.out.println("Pole kwadratu = "+wartoscPola);

        double pierwiastek = Kalkulator.root(10);
        System.out.println("Pierwiastek = "+pierwiastek);

        int poleTrojkata = Kalkulator.areaOfTriangle(4,7);
        System.out.println("Pole trójkąta = "+ poleTrojkata);
    }
}
