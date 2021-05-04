public class Check {

    static Sentense check(Sentense rv) throws WrongTypeNumberException, DifferentTypesOfNumbersException {

        if (rv.typeofX == null || rv.typeofY==null){
            throw new WrongTypeNumberException();
        }
        else if(!rv.typeofX.equals(rv.typeofY)){
            throw new DifferentTypesOfNumbersException();
        }
        else if(rv.typeofX.equals("isRoman")){
            rv.isRoman=true;
        }
        return rv;
    }

}
