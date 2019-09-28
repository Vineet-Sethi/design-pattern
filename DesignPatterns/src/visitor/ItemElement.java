package visitor;

interface ItemElement
{
    int accept(ShoppingCartVisitor visitor);
    //int calculateCost();
    
}