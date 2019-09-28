package visitor;

public class Book implements ItemElement
{
    private int price;
    private String isbnNumber;
  
    public Book(int cost, String isbn)
    {
        this.price=cost;
        this.isbnNumber=isbn;
    }
  
    public int getPrice() 
    {
        return price;
    }
  
    public String getIsbnNumber() 
    {
        return isbnNumber;
    }
  
    @Override
    public int accept(ShoppingCartVisitor visitor) 
    {
        return visitor.visit(this);
    }
    
    /*@Override
    int calculateCost()   // moved to visitor
    {
    	 int cost=0;
        
        if(price > 50)    //apply 5$ discount if book price is greater than 50
        {
            cost = price-5;
        }
        else
            cost = price;
             
        System.out.println("Book ISBN::" + isbnNumber + " cost ="+cost);
        return cost;
    }*/
}
