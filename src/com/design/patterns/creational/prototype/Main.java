package com.design.patterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        // Create an original document template
        Document originalDoc = new Document("Project Report", "Initial Draft", "John Doe");

        // Clone the original document
        Document clonedDoc1 = (Document) originalDoc.clone();
        Document clonedDoc2 = (Document) originalDoc.clone();

        // Modify cloned document content
        clonedDoc1.setContent("Revised Draft - Version 1");
        clonedDoc2.setContent("Final Draft - Version 2");

        // Display original and cloned documents
        System.out.println("Original Document:");
        originalDoc.showDocument();

        System.out.println("Cloned Document 1:");
        clonedDoc1.showDocument();

        System.out.println("Cloned Document 2:");
        clonedDoc2.showDocument();
    }
}
