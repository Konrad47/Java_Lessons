public class Main
{
    public static void main (String[] args){

        Butelka[] butelka = new Butelka[3];

        butelka[0] = new Butelka(10,5);
        butelka[1] = new Butelka(10,6);
        butelka[2] = new Butelka(10,8);


        butelka[0].pourIn(2);
        butelka[0].pourOut(4);

        butelka[1].pourOver(2,butelka[2]);

        System.out.println(butelka[0].getHowManyLiters());
        System.out.println(butelka[1].getHowManyLiters());
        System.out.println(butelka[2].getHowManyLiters());

    }
}
