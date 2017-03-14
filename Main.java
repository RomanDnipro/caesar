import static java.lang.Character.isLetter;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toUpperCase;
import static jdk.nashorn.internal.objects.ArrayBufferView.length;
//import Helper.*;
public class Main {

//    @Override
//    public String toString() {
//        // TODO Auto-generated method stub
//        return super.toString();
//    }
    public static void main(String[] args) {
	Helper helper = new Helper();
	//проверка
        int k = helper.check(args);
        String p = helper.getString();
        //p.toUpperCase();
        for(int i = 0; i < p.length(); i++){

            char symbol = p.charAt(i);

            if(isLetter(symbol)){
                if(isUpperCase(symbol)){
                    symbol = (char) ((((int)symbol - 65 + k) % 26) + 65);
                }else{
                    symbol = (char) ((((int)symbol - 97 + k) % 26) + 97);
                }
            }
            System.out.print(symbol);
        }
	System.out.println();
    }
}
