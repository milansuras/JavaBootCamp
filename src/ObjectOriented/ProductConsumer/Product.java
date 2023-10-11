package ObjectOriented.ProductConsumer;

public class Product {
    private String itemNo;
    private String name;
    private double price;
    private short qty;

    public Product (String itemNo){
        itemNo=itemNo;
    }
    public Product(String itemNo, String name){
        itemNo=itemNo;
        this.name=name;
    }
    public Product(String itemNo,String name, double price, short qty){
        itemNo=itemNo;
        this.name=name;
        setPrice(price);
        setQty(qty);
    }

    public String  getItemNo(){
        return itemNo;
    }
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public short getQty(){
        return  qty;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public void setQty(short qty){
        this.qty=qty;
    }

}
