public class Pair {
    int num1;
    int num2;

    Pair(int x , int y){
        this.num1 = x;
        this.num2 = y;
    }

    @Override
    public String toString(){
        return "( " +  num1 + "," + num2 + ")";
    }
}
