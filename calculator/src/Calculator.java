public class Calculator {

    static String calculator(Sentense rv) throws NumberOutOfRangeException {

        int x = Integer.parseInt(rv.x);
        int y = Integer.parseInt(rv.y);

        if(x>10 || x<1 || y>10 || y<1) {
            throw new NumberOutOfRangeException();
        }

        int result=0;
        switch(rv.operator){
            case "+":
                result = x+y;
                break;
            case "-":
                result = x-y;
                break;
            case "*":
                result = x*y;
                break;
            case "/":
                result = x/y;
                break;
        }
        return Integer.toString(result);
    }

}
