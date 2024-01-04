package models;
import java.util.Arrays;
public class T_Shirt {
        String Name;
        String Product_Code;
        int Price;
        String Brand;
        String Description;
        String[] Available_Sizes;
        public T_Shirt(String name, String productCode, int price, String brand, String description, String[] availableSizes) {
            this.Name = name;
            this.Product_Code = productCode;
            this.Price = price;
            this.Brand = brand;
            this.Description = description;
            this.Available_Sizes = availableSizes;
        }
    public void displayInfo(){
        String name=this.Name;
        String productCode=this.Product_Code;
        int price =this.Price;
        String brand=this.Brand;
        String description=this.Description;
        String[] availableSizes= this.Available_Sizes;
        System.out.println("Hello, the name of the product is "+name+" , the product code is "+productCode+" , its sizes are "+Arrays.toString(Available_Sizes)+" , its brand is "+brand+" , description of the T_shirt is '"+description+"' and its price is Rs. "+price+".");

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getProduct_Code() {
        return Product_Code;
    }

    public void setProduct_Code(String product_Code) {
        Product_Code = product_Code;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String[] getAvailable_Sizes() {
        return Available_Sizes;
    }

    public void setAvailable_Sizes(String[] available_Sizes) {
        Available_Sizes = available_Sizes;
    }
}