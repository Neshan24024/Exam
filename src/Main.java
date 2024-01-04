import models.T_Shirt;
import models.Order;
public class Main {
    public static void main(String[] args) {
        String[] Available_Size={"Xl","Medium","Large"};
        T_Shirt T_Shirt1=new T_Shirt("Gorkhali Batman","572",1235,"Karuma","You either die a hero or live long enough to see yourself be villain",new String[]{"Xl","Medium","Large"});
        T_Shirt1.displayInfo();
        Order Order1 = new Order("Neshan Shrestha", "9800000000", new int[]{572},new double[]{1235} );
        Order1.printBillWithVAT();
    }
}