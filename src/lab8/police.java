package lab8;

public class police extends  PersonEX {

    String workCountry;

    public police (String name, int bornYear, String workCountry){
    super(name,bornYear);
    this.workCountry = workCountry;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println( "I'm a police work in "+
                workCountry+".");
    }
}
