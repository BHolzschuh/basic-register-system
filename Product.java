package q4;

public class Product {
    /**
     * Constructs a product instance.
     * @param name name of the product
     * @param upc upc for the product
     * @param price price of the product
     */
    public Product(String name, int upc, int price){
        this.name = name;
        this.upc = upc;
        this.price = price;
    }

    /**
     * gets the name of the product
     * @return name of the product
     */
    public String getName(){
        return name;
    }

    /**
     * gets the upc of the product
     * @return upc of the product
     */
    public int getUPC(){
        return upc;
    }

    /**
     * gets the price of the product
     * @return price of the product
     */
    public int getPrice(){
        return price;
    }

    private String name;
    private int upc;
    private int price;
}
