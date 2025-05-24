package OPP.encapsulation;

public class Main {

    public static void main(String[] args) {

        StockKeeper johnDoe = new StockKeeper("John Doe");
        johnDoe.manageAlbum(new Album(), "The Dark Side of the Moon", "Pink Floyd", 19.99, 100);
        johnDoe.manageAlbum(new Album(), "Abbey Road", "The Beatles", 24.99, 50);
        johnDoe.manageAlbum(new Album(), "Back in Black", "AC/DC", 15.99, 75);
        johnDoe.manageAlbum(new Album(), "Rumours", "Fleetwood Mac", 18.99, 60);
        johnDoe.manageAlbum(new Album(), "Hotel California", "Eagles", 22.99, 80);
    }
}
