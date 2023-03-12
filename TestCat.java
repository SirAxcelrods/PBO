
package pbo;


public class TestCat{
    public static void main(String[] args) {
         Cat jahil = new Cat();
         jahil.setName("pylo");
         jahil.setWeight(9);
         jahil.setAge(5);
         jahil.setColor("black");
         jahil.setRas("persia");
        System.out.println("Cats name is = " + jahil.getName());
        System.out.println("Cats weight is = " + jahil.getWeight());
        System.out.println("Cats age is = " + jahil.getAge());
        System.out.println("Cats color is = " + jahil.getColor());
        System.out.println("Cats ras is = " + jahil.getRas());

    }
}

