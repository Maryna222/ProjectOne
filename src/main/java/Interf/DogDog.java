package Interf;

public class DogDog implements Animals {

    @Override
    public int Height(int x) {
        return x + x + x;
    }

    @Override
    public int Weight(int x) {
        return x * x + 25;
    }

    @Override
    public int traffic (int x){
        return x % 2 + 30;
    }

    public void eat (){
        System.out.println("Собака ест");
    }

}
