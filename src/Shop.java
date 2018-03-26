public class Shop {
    private String Title = "亞洲資工站";
    private String Address = "柳豐路500號";
    private String Postcode = "41354";
    public void setTitle (String newTitle){
        this.Title=newTitle;
    }

    public String getTitle() {
        return Title;
    }
    public void setAddress(String newAddress){
        this.Address=newAddress;
    }

    public String getAddress() {
        return Address;
    }
    public void setPostcode(String newPostcode){
        this.Postcode=newPostcode;
    }

    public String getPostcode() {
        return Postcode;
    }
}
