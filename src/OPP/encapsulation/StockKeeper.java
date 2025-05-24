package OPP.encapsulation;

public class StockKeeper {
    private String name;

  StockKeeper(String name){
      setName(name);
  }
    public String getName(){
      return name;
    }
    /**
     * Sets the name of the StockKeeper.
     * The name must not be null or empty.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name provided.");
        }
    }

    /**
     * Manages the details of an Album by setting its properties and printing its details.
     *
     * @param album the Album object to manage
     * @param name the name to set for the album
     * @param artist the artist to set for the album
     * @param price the price to set for the album
     * @param numberOfCopies the number of copies sold to set for the album
     */
    public void manageAlbum(Album album, String name, String artist, double price, int numberOfCopies) {
       //Defining states and behaviors of Album class
        album.setName(name);
        album.setArtist(artist);
        album.setPrice(price);
        album.setNumberOfCopiesSold(numberOfCopies);
        double totalSale = Math.round(album.getPrice() * album.getNumberOfCopiesSold() * 100.0) / 100.0;

        System.out.println("*************>Album details<*************");
        System.out.println("Managed album: " + name + " by " + artist);
        System.out.println("Album Name: " + album.getName());
        System.out.println("Artist Name: " + album.getArtist());
        System.out.println("Price: £" + album.getPrice());
        System.out.println("Number of Copies sold: " + album.getNumberOfCopiesSold());
        System.out.println("Total sale of " + name + " is: £" + String.format("%.2f", totalSale));
    }
}
