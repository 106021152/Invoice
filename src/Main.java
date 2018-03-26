
public class Main {
    public static void main(String[] args) {
        Invoice inv =new Invoice();
        inv.ShowInto();
        Product prods[] = new Product[10];

        prods[0]=new Product("乾坤袋",100.20f,3);
        prods[1]=new Product("雷神斧",1112.30f,2);
        prods[2]=new Product("惡魔槌",93.50f,1);
        prods[3]=new Product("破魔劍",130.40f,5);
        for(int i = 0 ;i<4;i++){
            prods[i].ShowInto();
        }
        System.out.println("===========================================");

    }
}