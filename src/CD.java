//make information for a CD
public class CD {
	double Price;
	int numSongs;
	String singer;
	
	//default
	CD(){
		Price = 0;
		numSongs++;
		singer = " ";
	}
	
	//constructor
	CD(double newPrice, int newNumSongs, String newSinger){
		if (newPrice > 0){
			Price = newPrice;
			singer = newSinger;
			numSongs = newNumSongs;
		}	
	}
	
	public double getPrice() {
		return Price;
	}
	
	public int getNumSongs() {
		return numSongs;
	}
	
	public String getSinger() {
		return singer;
	}
	
	public void setPrice(double newPrice) {
		if (newPrice > 0) {
			Price = newPrice;
		}
	}
	
	public void setNumSongs(int newNumSongs) {
		if (newNumSongs > 0) {
			numSongs = newNumSongs;
		}
	}
	
	public void setSinger(String Singer) {
			singer = Singer;
	}
}
