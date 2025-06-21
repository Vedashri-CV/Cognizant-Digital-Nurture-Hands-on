package Week1.Data_Structures_and_Algorithm.Search_Function;
public class Product{
int productId;
String productName;
String category;

public Product(int productId, String productName, String category) {
    this.productId = productId;
    this.productName = productName;
    this.category = category;
}

@Override
public String toString() {
    return "[" + productId + ", " + productName + ", " + category + "]";
}
}