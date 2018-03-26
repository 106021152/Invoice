public class Invoice {
    Shop sh = new Shop();
    public Invoice(){

    }
    public void ShowInto(){
        System.out.println("店名："+sh.getTitle());
        System.out.println("地址："+sh.getAddress());
        System.out.println("郵遞區號："+sh.getPostcode());
        System.out.println("===========================================");
    }
}