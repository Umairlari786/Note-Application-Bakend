package model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Notes")
public class NoteModel {
    private String Name;
    private String Address;

    public NoteModel(String title,String description)
    {
        this.Name = title;
        this.Address = description;
    }

    public String getTitle() {
        return Name;
    }

    public void setTitle(String title) {
        Name = title;
    }

    public String getDescription() {
        return Address;
    }

    public void setDescription(String description) {
        this.Address = description;
    }

}
