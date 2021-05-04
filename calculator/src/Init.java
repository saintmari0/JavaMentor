public class Init  {
    static Sentense init(String str) throws InvalidArithmeticOperatorException {

        String[] symbols = {"+", "-", "*", "/"};
        Sentense rv = new Sentense();

        for(int i=0; i<symbols.length; i++){
            if(str.contains(symbols[i])){
                rv.operator = symbols[i];
                rv.x=str.substring(0, str.indexOf(rv.operator));
                rv.y=str.substring(str.indexOf(rv.operator)+1);
                break;
            }
        }

        if (rv.operator == null){
            throw new InvalidArithmeticOperatorException();
        }

        if(rv.x.matches("\\d+")){
            rv.typeofX="isArabic";
        }else if(rv.x.matches("^(C{0,1})|(L?X{0,3}|X[LC])(V?I{0,3}|I[VX])$")){
            rv.typeofX="isRoman";
        }

        if(rv.y.matches("\\d+")){
            rv.typeofY="isArabic";
        }else if(rv.y.matches("^(C{0,1})|(L?X{0,3}|X[LC])(V?I{0,3}|I[VX])$")){
            rv.typeofY="isRoman";
        }

        return rv;
    }
}
