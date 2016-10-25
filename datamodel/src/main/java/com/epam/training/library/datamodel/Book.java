package com.epam.training.library.datamodel;

public class Book extends AbstractModel {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", getId()=" + getId() + "]";
    }

}
