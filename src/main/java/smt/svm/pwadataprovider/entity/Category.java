package smt.svm.pwadataprovider.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "category")
public class Category {

    @Id
    private String id;
    private String firmId;
    private String name;
    private String description;
    private String iconImageId;
    private String backgroundImageId;

    public Category() {
    }

    public Category(String firmId, String name, String description, String iconImageId, String backgroundImageId) {
        this.firmId = firmId;
        this.name = name;
        this.description = description;
        this.iconImageId = iconImageId;
        this.backgroundImageId = backgroundImageId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getIconImageId() {
        return iconImageId;
    }

    public void setIconImageId(String iconImageId) {
        this.iconImageId = iconImageId;
    }

    public String getBackgroundImageId() {
        return backgroundImageId;
    }

    public void setBackgroundImageId(String backgroundImageId) {
        this.backgroundImageId = backgroundImageId;
    }

    public String getFirmId() {
        return firmId;
    }

    public void setFirmId(String firmId) {
        this.firmId = firmId;
    }
}
