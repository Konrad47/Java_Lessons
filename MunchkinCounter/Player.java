public class Player
{

    private String name;
    private  int level;
    private  int power;

    public Player (String name, int level, int power){
        this.name = name;
        this.level = level;
        this.power = power;

    }

    public Player() {

    }

    public int getLevel(){
        return level;
    }

    public int getPower(){
        return power;
    }

    public String getName(){
        return name;
    }

    public void setLevel(){
        this.level = level + 1;
    }

    public  void setPower (){
        this.power = power + 1;
    }

    public void showPlayer(){
        System.out.println();
        System.out.println("Imię: "+name);
        System.out.println("Level: "+level);
        System.out.println("Siła: "+power);

    }
}
