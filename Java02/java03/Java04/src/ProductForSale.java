public abstract  class ProductForSale {

    protected String type;
    protected double price;
    protected String description;


    public ProductForSale(String type, double price, String description){
        this.type = type;
        this.price = price;
        this.description = description;

    }

   public double getSalesPrice(int qty){
      return qty * price;
   }

   public void printPricedItem(int qty){
        System.out.println("%2d qty at $%8.2f each, %-15%s %-15s ");
   }

   public abstract void showDetails();
}
