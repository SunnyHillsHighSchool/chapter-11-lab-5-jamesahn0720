public class Book
{
  
  public static boolean isValidISBN(String isbn)
  {
    if (isbn.length() == 10)
      return isValidISBN10(isbn); 
    else if (isbn.length() == 13)
      return isValidISBN13(isbn);
    
    return false;
    
    
  }
}
