package Interf;

public class DogDog extends Dog {

    @Override
    public int height(int x) {
        return x + x + x;
    }

    @Override
    public int weight(int x) {
        return x * x + 25;
    }

    @Override
    public int traffic (int x){
        return x % 2 + 30;
    }


}
