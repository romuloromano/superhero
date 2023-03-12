package io.github.romuloromano.superhero.model;

public class Image {

    private int id;
    private String name;

    private String urlImage;

    public Image() {
    }

    public Image(int id, String name, String urlImage) {
        this.id = id;
        this.name = name;
        this.urlImage = urlImage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrlImage() {
        return urlImage;
    }

    @Override
    public String toString() {
        return "**Super Hero - Image**\n" +
                "Name= " + name + '\n' +
                "Url Image= " + urlImage + '\n';
    }
}
