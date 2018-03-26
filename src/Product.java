import java.text.DecimalFormat;

public class Product {
    String Name;
    float Price;
    int Quantity;
    DecimalFormat De = new DecimalFormat("#00");
    public Product(String name1,float price1, int quantity1){
        Name=name1;
        Price=price1;
        Quantity=quantity1;
    }
    public void ShowInto(){
        System.out.print(this.Name+"\t\t");
        System.out.print(this.Price+"\t\t");
        System.out.print(this.Quantity+"\t\t");
        System.out.println(De.format(Math.round(this.Price*this.Quantity*10)/10f)+"\t\t");
    }
}
