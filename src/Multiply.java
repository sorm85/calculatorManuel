public abstract class Multiply implements Operation {


    @Override//km_80
    public double calculate (double x, double y ) {
        double result = 0 ;
        result = x * y ;
        return result ;
    }

    @Override//km_80
    public String operationName(){
        return "The multiplycation of these numbers is" ;
    }
}
