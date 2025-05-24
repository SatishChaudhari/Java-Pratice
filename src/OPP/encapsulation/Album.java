package OPP.encapsulation;

public class Album {

    private String name;
    private String artist;
    private double price;
    private int numberOfCopiesSold;

    public void sellCopies(){
        if (numberOfCopiesSold > 0) {
            numberOfCopiesSold--;
            System.out.println("Sold one copy of " + name + " by " + artist);
        } else {
            System.out.println("No copies left to sell.");
        }
    }

    public void orderCopies(int num){
        if (num > 0) {
            numberOfCopiesSold += num;
            System.out.println("Ordered " + num + " copies of " + name + " by " + artist);
        } else {
            System.out.println("Invalid number of copies to order.");
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if(price > 0) {
            this.price = Math.round(price * 100.0) / 100.0; // Round to two decimal places
          //  this.price = price;
        } else {
            System.out.println("Price must be positive.");
        }

    }
    public int getNumberOfCopiesSold() {
        return numberOfCopiesSold;
    }
    public void setNumberOfCopiesSold(int numberOfCopiesSold) {
        if(numberOfCopiesSold > 0) {
            this.numberOfCopiesSold = numberOfCopiesSold;
        } else {
            System.out.println("Number of copies sold cannot be negative.");
        }
    }
}
