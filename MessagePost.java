import java.util.*;
/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost
{
    // instance variables - replace the example below with your own
    private String username;
    private String message;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments; 
    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author, String text)
    {
        // initialise instance variables
        username = author;
        message = text;
        likes = 0;
        comments = new ArrayList<>();
        System.currentTimeMillis();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void like()
    {
      likes++;
    }
    
    public void unlike()
    {
        if (likes == 0)
        {
            System.out.println("No puedes quitar algo que no tienes");
        }
        else{
            likes--;
        }
    }
    
    public void addComment(String text)
    {
        comments.add(text);
    }
    
    public String getText()
    {
        return message;
    }
    
    public long getTimeStamp()
    {
        return System.currentTimeMillis();
    }
    
    public void display()
    {
        System.out.println("---------------------------------------------");
        System.out.println("Author: " + username);
        System.out.println("Text: " + message);
        System.out.println("Likes: " + likes);
        System.out.println("Time posted: " + timestamp);
        System.out.println("---------------------------------------------");
    }
}
