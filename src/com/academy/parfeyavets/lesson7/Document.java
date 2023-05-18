package com.academy.parfeyavets.lesson7;

import java.util.Objects;

public class Document implements Printable, Comparable<Document>, Cloneable {
    private String documentName;
    private int numberOfPages;

    public Document() {
    }

    public Document(String documentName, int numberOfPages) {
        this.documentName = documentName;
        this.numberOfPages = numberOfPages;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Document document = (Document) obj;
        return numberOfPages == document.numberOfPages && Objects.equals(numberOfPages, document.numberOfPages);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int code = 1;
        code = prime * code + numberOfPages;
        code = prime * code + ((documentName == null) ? 0 : documentName.hashCode());
        return code;
    }

    @Override
    public String toString() {
        return "Document: " + this.documentName + ", pages: " + this.numberOfPages;
    }

    @Override
    public int compareTo(Document o) {
        return this.numberOfPages - o.numberOfPages;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
