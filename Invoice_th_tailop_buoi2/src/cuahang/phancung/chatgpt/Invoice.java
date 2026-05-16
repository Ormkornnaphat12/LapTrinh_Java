package cuahang.phancung.chatgpt;

public class Invoice {
    public String partNumber;
    public String partDescription;
    public int quantity;
    public double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem)
    {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = (quantity > 0) ? quantity : 0;
        this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0.0;
    }
    public String getPartNumber() {return partNumber;}
    public void setPartNumber(String partNumber){ this.partNumber = partNumber; }
    public String getPartDescription(){return partDescription; }
    public void setPartDescription (String partDescription){this.partDescription = partDescription; }
    public int getQuantity(){ return quantity;}
    public void setQuantity(int quantity) {this.quantity = (quantity > 0) ? quantity : 0;}
    public double getPricePerItem(){return pricePerItem; }
    public void setPricePerItem(double pricePerItem) {this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0.0;}
    public  double getInvoicerAmount()
    {
        return quantity * pricePerItem;
    }
    @Override
    public String toString()
    {
        return String.format("Number: %-8s | Describe: %-15s | Quantity: %-4d | Price: %-8.2f | Total: %.2f", partNumber, partDescription,quantity, pricePerItem, getInvoicerAmount());
    }
}
