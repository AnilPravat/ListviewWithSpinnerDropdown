package myapp.anilandroid.com.customspinner.model;

public class Countryitems {

    int Images;
    String Names;
    String Capital;

    public Countryitems(int images, String names, String capital) {
        Images = images;
        Names = names;
        Capital = capital;
    }

    public int getImages() {
        return Images;
    }

    public void setImages(int images) {
        Images = images;
    }

    public String getNames() {
        return Names;
    }

    public void setNames(String names) {
        Names = names;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String capital) {
        Capital = capital;
    }
}
