package pl.jwojciechowski.model;

import org.springframework.stereotype.Component;

@Component
public class Product {

    private long product_id;
    private String product_name;
    private String category;
    private String description;
    private String product_price;
    private String expiration_date;

    public Product() {
    }

    public Product(long product_id, String product_name, String category, String description, String product_price, String expiration_date) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.category = category;
        this.description = description;
        this.product_price = product_price;
        this.expiration_date = expiration_date;
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    public String getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", product_price=" + product_price +
                ", expiration_date=" + expiration_date +
                '}';
    }
}
