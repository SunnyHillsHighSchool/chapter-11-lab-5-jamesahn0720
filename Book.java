public class Book
{
  
  public static boolean isValidISBN(String isbn)
  {
   int sum = 0;
    for(int i = 0; i < isbn.length();i++)
    {
      sum+= Character.digit(isbn.charAt(i),10)*(10-i);
    }
    return (sum%11 == 0);
    
    
  }
}
