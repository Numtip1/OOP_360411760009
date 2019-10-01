package lab8;

import java.time.Year;

public class PersonEX {
    String name;
    int bornYear;

    public  PersonEX (String name, int bornYear) {
        this.name = name;
        this.bornYear = bornYear;
    }
    public  void introduce (){
        System.out.print("My name is"+name+ ",");
        System.out.print("I was bron in"+bornYear+".");
    }

}
