package Day1005.Calculator2;

public class Calculator {

    private NumberCreator numberCreator;
    private int baseNum;
    public void plus(int num){
        System.out.println(num+numberCreator.create(baseNum));
    }

    public Calculator(NumberCreator numberCreator) {
        this.numberCreator = numberCreator;
        this.baseNum=10;

    }
    public Calculator(NumberCreator numberCreator,int baseNum){
        this.numberCreator= numberCreator;
        this.baseNum=baseNum;
    }
}
