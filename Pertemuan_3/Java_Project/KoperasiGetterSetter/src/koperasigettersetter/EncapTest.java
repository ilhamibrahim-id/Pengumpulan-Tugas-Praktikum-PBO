package koperasigettersetter;
public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(35);
        
        System.out.println("Name : " + encap.getName());
        System.out.println("Age : " + encap.getAge());
        
        encap.setName("Ilham");
        encap.setAge(15);
        
        System.out.println("Name : " + encap.getName());
        System.out.println("Age : " + encap.getAge());
    }
}
