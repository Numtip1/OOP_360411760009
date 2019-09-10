package lab7;

public class PetApp {
    public static void main(String[] args) {

        //crete class instant (object)
        Pet pet1 = new Pet();

        pet1.setOwnerName("May");
        pet1.setPetName("Owen");
        pet1.setPetAge(2);

        System.out.println(pet1.getOwnerName());
        System.out.println(pet1.getPetName());
        System.out.println(pet1.petAge());



        Pet pet2 =new Pet();
        pet2.setOwnerName("tatar");
        pet2.setPetName("chin B");
        pet2.setPetAge(3);

        System.out.println(pet2.getOwnerName());
        System.out.println(pet2.getPetName());
        System.out.println(pet2.petAge());


        Pet pet3 = new Pet ("May","lala",5);
        System.out.println(pet3.getOwnerName());
        System.out.println(pet3.getPetName());
        System.out.println(pet3.petAge());











    }//main
}//class
