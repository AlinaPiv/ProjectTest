package lesson4;

public class TriangleSquare {

    public double sqrMethod(int a, int b, int c) throws MyException {

 if(testValue1(a,b,c)) throw new MyException("Текст моей ошибки");
 if(testValue21(a,b,c)) throw new MyException("Текст моей ошибки");
 if(testValue22(a,b,c)) throw new MyException("Текст моей ошибки");
 if(testValue23(a,b,c)) throw new MyException("Текст моей ошибки");
     double p=(a+b+c)/2;
     double s=((p*((p-a)*((p-b)*((p-c))))));
     double result=Math.sqrt(s);

    return result;

    }

    private boolean testValue1(int a, int b, int c){

        return a<0 || b<0 || c<0;
    }

     private boolean testValue21(int a, int b, int c){
        return ((a + b) > c);
    }

     private boolean testValue22(int a, int b, int c){

        return ((a + c) > b);
    }
         private boolean testValue23(int a, int b, int c){

        return ((b + c) > a);
    }


}
