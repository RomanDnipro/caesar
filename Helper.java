import java.util.Scanner;

/**
 * Created by Роман on 14.03.2017.
 */

public class Helper {
    /**
     * Проверка количества аргументов командной строки
     * (должен быть один обязательный аргумент(имя файла) +
     * аргумент-ключ)
     * и является ли вводимый ключ целым числом !=0
     */
    static int check(String args[]) {
        if (args.length != 1) {
            System.out.println("print the key next time");
            System.exit(1);
        }
        int k = Integer.parseInt(args[0]) % 26;
        if (k == 0) {
            System.out.println("print the key next time");
            System.exit(1);
        }
        return k;
    }

    public static String getString(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
