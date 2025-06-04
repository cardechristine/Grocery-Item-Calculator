public class ItemToPurchase {

    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    //Default Constructor
    public ItemToPurchase() {
        itemName = "none";
        itemPrice = 0;
        itemQuantity = 0;
    }

    public void setName(String productName){  //set name
        itemName = productName;
    }
    public String getName(){                //get name
        return itemName;
    }

    public void setPrice(int productPrice){    //set price
        itemPrice = productPrice;
    }

    public int getPrice(){              //get price
        return itemPrice;
    }

    public void setQuantity(int productQuantity){   //set quantity
        itemQuantity = productQuantity;
    }

    public int getQuantity(){           //get quantity
        return itemQuantity;
    }

    public void printItemPurchase() {
        System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice +
                " = $" + (itemPrice * itemQuantity));
    }
}