package test;

public class BookSwapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book1 galaxy = new Book1();
		galaxy.setTitle("The Hitchhiker's Guide to the Galaxy");
		Book1 wap = new Book1();
		wap.setTitle("War and Peace");
		BookSwapper bookswapper= new BookSwapper();
		bookswapper.swapTitle(galaxy, wap);
		System.out.println("galaxy title: " + galaxy.getTitle() 
		                             + " wap title: " + wap.getTitle());
	}
	
	 public void swapTitle(Book1 book1, Book1 book2){
         String temp = book1.getTitle();
         book1.setTitle(book2.getTitle());
         book2.setTitle(temp);
	 }

}

class Book1 {
    private String title;
    private String author;
    private double price;

    public String getTitle() {
            return title;
    }

    public void setTitle(String title) {
             this.title = title;
    }
}
