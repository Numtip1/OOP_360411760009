package lab7;

public class Pet {
    //class Attributes
    private  String ownerName;
    private  String petName;
    private  int petAge;

    //constructor
    public  Pet () {}

    public Pet (String ownerName ,String petName, int petAge) {
        this.ownerName = ownerName;
        this.petName = petName;
        this.petAge = petAge;
    }

    //getter and setter metthods
    public String getOwnerName () {
        return this.ownerName;
    }
    public void  setOwnerName(String newOwnername){
        this.ownerName = newOwnername;
    }
    public String getPetName (){
        return  this.petName;
    }
    public void  setPetName (String newPetname){
        this.petName = newPetname;
    }
    public int petAge () {
        return this.petAge;
    }
    public void  setPetAge (int newpetAge) {
        this.petAge = newpetAge;
    }







}//class
