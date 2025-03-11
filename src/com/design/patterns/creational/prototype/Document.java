package com.design.patterns.creational.prototype;

public class Document implements DocumentPrototype {
    private String title;
    private String content;
    private String author;

    public Document(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    // Cloning method
    @Override
    public DocumentPrototype clone() {
        return new Document(this.title, this.content, this.author);
    }

    // Display document details
    public void showDocument() {
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
        System.out.println("Author: " + author);
        System.out.println("----------------------------");
    }

    // Modify content of the cloned document
    public void setContent(String newContent) {
        this.content = newContent;
    }
}
