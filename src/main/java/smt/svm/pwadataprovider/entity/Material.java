package smt.svm.pwadataprovider.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "material")
public class Material {

    @Id
    private String id;
    private String categoryId;
    private String name;
    private String description;
    private String defaultImageId;
    private String detailImageId;
    private String stockInfo;
    private String price;

    public Material() {
    }

    public Material(String categoryId, String name, String description, String defaultImageId, String detailImageId, String stockInfo, String price) {
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.defaultImageId = defaultImageId;
        this.detailImageId = detailImageId;
        this.stockInfo = stockInfo;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDefaultImageId() {
        return defaultImageId;
    }

    public void setDefaultImageId(String defaultImageId) {
        this.defaultImageId = defaultImageId;
    }

    public String getDetailImageId() {
        return detailImageId;
    }

    public void setDetailImageId(String detailImageId) {
        this.detailImageId = detailImageId;
    }

    public String getStockInfo() {
        return stockInfo;
    }

    public void setStockInfo(String stockInfo) {
        this.stockInfo = stockInfo;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
