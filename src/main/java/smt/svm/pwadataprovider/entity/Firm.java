package smt.svm.pwadataprovider.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "firm")
public class Firm {

    @Id
    private String id;
    private String name;
    private String type;
    private String description;
    private String address;
    private String iconImageId;
    private String backgroundImageId;

    public Firm() {
    }

    public Firm(String name, String type, String description, String address, String iconImageId, String backgroundImageId) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.address = address;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
}
