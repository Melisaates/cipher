/**
 * Musteri class
 * @author : Melisa ATEŞ-20120205045
 * 11.03.2021
 * atesmel12@gmail.com
 * İki müşterinin bilgilerini class oluşturarak ekrana yazdıran ve bakiye farklarını hesaplayan program.*/

class Musteri {
    
    String isim;
    int hesapNO;
    int bakiye;

    
    Musteri(String i,int h,int b){
        isim=i;
        hesapNO=h;
        bakiye=b;
    }

    public static void main(String[] args) {
       
        Musteri customer1=new Musteri("Ali",111,3000);
        Musteri customer2=new Musteri("Ayşe",222,2000);
       
        System.out.println(customer1.isim + "," + customer1.hesapNO + "," + customer1.bakiye + "\n");
        System.out.println(customer2.isim + "," + customer2.hesapNO + "," + customer2.bakiye + "\n");
        
        System.out.println(Math.abs(customer1.bakiye-customer2.bakiye));

    }
}
