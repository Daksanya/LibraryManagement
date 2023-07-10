class LibraryItem{
    int id;
    String title;
   private int year;
   public void setYear(int y){
    this.year=y;
   }
    public int getYear(){
        return year;
    }
   
}
class Book extends LibraryItem{
    String author;
}
  
class Magazine extends Book{
    int issue;
    public void printYear(){
        System.out.println(this.getYear());
    }
    
}
public interface LibraryManagement {
    public static void main(String[] args) {
        Magazine magazine = new Magazine();
        magazine.issue=10;
        magazine.author="J.K Rowling";
        magazine.id=1001;
        magazine.title="Harry Potter and The chamber of Secrets";
        magazine.setYear(2000);
        System.out.println(magazine.issue+", "+magazine.author+", "+magazine.id+", "+magazine.title);
        magazine.printYear();
         }

   
}