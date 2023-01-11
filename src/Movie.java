public class Movie {
    
    private String name;
    private String format;
    private double rating;

    public Movie(String name, String format, double rating) {
        setName(name);
        setFormat(format);
        setRating(rating);
    }

    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isBlank() || name == null) {
            throw new IllegalArgumentException("Name cannot be blank or null");
        } else {
            this.name = name;
        }
    }
    
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        if( format.isBlank() ||format == null ) {
            throw new IllegalArgumentException("Format cannot be blank or null");
        }
        this.format = format;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating > 10 ||rating < 0 ) {
            throw new IllegalArgumentException("Rating cannot be under 0 or greater than 10");
        }
        this.rating = rating;
    }

    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    }    

}