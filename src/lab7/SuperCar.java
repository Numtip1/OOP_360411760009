package lab7;

public class SuperCar {
    
        //class Attributes
        private  String carbrandName;
        private  String carcalor;
        private  String carenginesize;
        private  String maxspeed;
        private  String countryoforigin;

    //constructor
    public  SuperCar () {}

    public SuperCar (String carbrandName ,String carcalor, String carenginesize,String maxspeed,String countryoforigin  ) {
        this.carbrandName = carbrandName;
        this.carcalor = carcalor;
        this.carenginesize = carenginesize;
        this.maxspeed = maxspeed;
        this.countryoforigin = countryoforigin;

    }
        //getter and setter metthods
            public String getcarbrandName () {
                return this.carbrandName;
            }
            public void  setcarbrandName(String newcarbrandName){
                this.carbrandName = newcarbrandName;
        }
        
    public String getcarcalor () {
        return this.carcalor;
    }
    public void  setcarcalor (String newcarcalor) {
        this.carbrandName = newcarcalor;
    }
    public String getcarenginesize () {
        return this.carenginesize ;
    }
    public void  setcarenginesize (String newcarenginesize ) {
        this.carenginesize = newcarenginesize;
    }
    public String getmaxspeed () {
        return this.maxspeed ;
    }
    public void  setmaxspeed (String newmaxspeed ) {
        this.maxspeed = newmaxspeed;
    }
    public String getcountryoforigin () {
        return this.countryoforigin ;
    }
    public void  setcountryoforigin(String newcountryoforigin ) {
        this.countryoforigin = newcountryoforigin;
    }   
    
    
    public  void getSuperinto (){
        System.out.println(carbrandName+carcalor+carenginesize+ maxspeed+countryoforigin);
    }
        
        
    
}
