package lab8;

public class Sheriff extends  PersonEX {

    String workState;
    public Sheriff (String name, int bornyear, String workState){
        super(name, bornyear);
        this.workState = workState;
    }

    public Sheriff(String name, int bornYear) {
        super(name, bornYear);
        System.out.println("I'm a sheriff and work"+workState+ ".");
    }
}
