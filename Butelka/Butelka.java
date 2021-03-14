public class Butelka
{
    private double howManyLiters;
    private int volume;

    public Butelka (int volume,double howManyLiters ){
        this.volume = volume;
        this.howManyLiters = howManyLiters;
    }

    public int getVolume(){
        return volume;
    }

    public double getHowManyLiters(){
        return howManyLiters;
    }

    public void pourIn(double quantity ){
        this.howManyLiters = howManyLiters+quantity;
    }

    public boolean pourOut (double quantity){
        if(quantity<=howManyLiters){
        this.howManyLiters = howManyLiters-quantity;
        }
        else{
            System.out.println("Niewystarczająca ilość wody w butelce");
            return false;
        }
        return true;
    }

    public void pourOver (double quantity, Butelka whichBottle){
        if(this.pourOut(quantity)){
            whichBottle.pourIn(quantity);
        }
        else{
            System.out.println("Niewystarczająca ilość wody w butelce");
        }
    }
}
