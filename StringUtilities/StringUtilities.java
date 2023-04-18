import java.util.*;

public class StringUtilities
{
    
    
    public StringUtilities()
    {
        
    }
    
    /**
     * @param  s the set for which an unmodifiable view is to be returned.
     * @return      the image at the specified URL
     */
    public void judgeInputString(String string)
    {
        if (string.toLowerCase() == "quit")
        {
            return;
        }
        else if (string.length() < 7)
        {
            System.out.println("The input was too short");
        }
        else if (string.length() > 7)
        {
            System.out.println("The input was too long");
        }
        else
        {
            System.out.println(string.substring(2, 5));
        }
    }
    
    public boolean isPalindrome(String string)
    {
        int middle = (string.length()-1)/2;
        int count = 0;
        
        for (int i = 0; i < middle; i++)
        {
            if (string.charAt(i) == string.charAt(string.length() - 1 - i))
            {
                count++;
            }
        }
        
        if (count == middle)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public int getPositionOfSubstring(String toBeSearched, String toBeFound)
    {
        int length = toBeFound.length();
        char[] characters = new char[toBeFound.length()];
        
        for (int index = 0; index <= toBeSearched.length() - length - 1; index++)
        {
            for (int j = 0; j <= toBeFound.length()-1; j++)
            {
                characters[j] = toBeSearched.charAt(index + j);
            }
            
            String chars = new String(characters);
            
            if (chars.equals(toBeFound))
            {
                return index;
            }
        }
        
        return -1;
    }
    
    public void printAllPositionsOfSubstring(String toBeSearched, String toBeFound)
    {
        int length = toBeFound.length();
        char[] characters = new char[toBeFound.length()];
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        
        for (int index = 0; index < toBeSearched.length() - length - 1; index++)
        {
            for (int j = 0; j <= toBeFound.length()-1; j++)
            {
                characters[j] = toBeSearched.charAt(index + j);
            }
            
            String chars = new String(characters);
            
            if (chars.equals(toBeFound))
            {
                indexes.add(Integer.valueOf(index));
            }
        }
        
        for (Integer index : indexes)
        {
            System.out.println("This occured at index " + index);
        }
    }
}
