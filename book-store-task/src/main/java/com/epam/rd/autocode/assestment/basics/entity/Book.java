package com.epam.rd.autocode.assestment.basics.entity;

import com.epam.rd.autocode.assestment.basics.entity.enums.AgeGroup;
import com.epam.rd.autocode.assestment.basics.entity.enums.Language;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

class Book {
    private long id;
    private String name;
    private String genre;
    private AgeGroup ageGroup;
    private BigDecimal price;
    private LocalDate publicationYear;
    private String author;
    private int numberOfPages;
    private String characteristics;
    private String description;
    private Language language;

    // Default constructor
    public Book() {
    }

    // Parameterized constructor
    public Book(long id, String name, String genre, AgeGroup ageGroup, BigDecimal price,
                LocalDate publicationYear, String author, int numberOfPages,
                String characteristics, String description, Language language) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.ageGroup = ageGroup;
        this.price = price;
        this.publicationYear = publicationYear;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.characteristics = characteristics;
        this.description = description;
        this.language = language;
    }

    // Getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(AgeGroup ageGroup) {
        this.ageGroup = ageGroup;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(LocalDate publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    // equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return id == book.id &&
                numberOfPages == book.numberOfPages &&
                Objects.equals(name, book.name) &&
                Objects.equals(genre, book.genre) &&
                ageGroup == book.ageGroup &&
                Objects.equals(price, book.price) &&
                Objects.equals(publicationYear, book.publicationYear) &&
                Objects.equals(author, book.author) &&
                Objects.equals(characteristics, book.characteristics) &&
                Objects.equals(description, book.description) &&
                language == book.language;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, genre, ageGroup, price, publicationYear, author, numberOfPages, characteristics, description, language);
    }

    // toString
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name=" + name +
                ", genre=" + genre +
                ", ageGroup=" + ageGroup +
                ", price=" + price +
                ", publicationYear=" + publicationYear +
                ", author=" + author +
                ", numberOfPages=" + numberOfPages +
                ", characteristics=" + characteristics +
                ", description=" + description +
                ", language=" + language +
                '}';
    }
}
