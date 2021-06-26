package JAVAThanTrieu.Bai55;

public class Movie {
    private String name;
    private int year;
    private String director;
    private float price;
    private float start;

    public Movie() {
    }

    public Movie(String name, int year, String director, float price, float start) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.price = price;
        this.start = start;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getStart() {
        return start;
    }

    public void setStart(float start) {
        this.start = start;
    }

    /**
     * Sắp xếp theo thứ tự tăng dần của tên phim a-z
     * @param o là đối tượng movie khác cần so sánh
     * @return
     */
//    @Override
//    public int compareTo(Movie o) {
//        return this.name.compareTo(o.name);
//    }
}
