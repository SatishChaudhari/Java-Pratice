package OPP.encapsulation;

public class StockKeeper {
    public String name;

    public StockKeeper(String name) {
        this.name = name;
    }

    public void manageAlbum(Album album, String name, String artist, double price, int numberOfCopies) {
       //Defining states and behaviors of Album class
        album.setName(name);
        album.setArtist(artist);
        album.setPrice(price);
        album.setNumberOfCopiesSold(numberOfCopies);
        double totalSale = Math.round(album.getPrice() * album.getNumberOfCopiesSold() * 100.0) / 100.0;


        System.out.println("             Album details        ");
        System.out.println("===================================");
        System.out.println("Managed album: " + name + " by " + artist);
        System.out.println("Album Name: " + album.getName());
        System.out.println("Artist Name: " + album.getArtist());
        System.out.println("Price: £" + album.getPrice());
        System.out.println("Number of Copies sold: " + album.getNumberOfCopiesSold());
        System.out.println("Total sale of " + name + " is: £" + String.format("%.2f", totalSale));
        System.out.println(".....................................");
    }
}
