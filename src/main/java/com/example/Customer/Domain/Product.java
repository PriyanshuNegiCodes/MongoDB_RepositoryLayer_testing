package com.example.Customer.Domain;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@EqualsAndHashCode
public class Product {
    private int productId;
    private String productName;
    private String productDescription;
    @Override
    public boolean equals(Object obj){
        Product product= (Product) obj;
        if(this.getProductId()==product.getProductId()
                &&this.getProductName().equals((product.getProductName()))
                && this.getProductDescription().equals(product.getProductDescription())
        ){
            return true;
        }else {
            return false;
        }
    }
}
