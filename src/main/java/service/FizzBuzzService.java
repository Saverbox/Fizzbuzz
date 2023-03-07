package service;

public class FizzBuzzService {

    public String getResultOfNumber(int i) {
        String result = "";
        if (i%3 == 0){
            result = "Fizz";
        }
        if (i%5 == 0){
            result = result+"Buzz";
        }
        if (result != ""){
            return result;
        }else{
            return Integer.toString(i);
        }
        
    }

}
