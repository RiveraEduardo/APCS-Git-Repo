/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
//Activity 2
public class Magpie2

{
    /**
     * Get a default greeting 	
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "I like my cat Mitterns";
        }
        else if (statement.indexOf("dog") >= 0
        || statement.indexOf("cat") >= 0
        || statement.indexOf("sister") >= 0
        || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your pets.";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    public String getResponse2(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "I like all the state capitals";
        }
        else if (statement.indexOf("sacramento") >= 0
        || statement.indexOf("cat") >= 0
        || statement.indexOf("sister") >= 0
        || statement.indexOf("brother") >= 0)
        {
            response = "me too.";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    public String getResponse3(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "He sounds like a good teacher.";
        }
        else if (statement.indexOf("Mr.") >= 0
        || statement.indexOf("cat") >= 0
        || statement.indexOf("sister") >= 0
        || statement.indexOf("brother") >= 0)
        {
            response = "Yea he really is!!";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }
    public String getResponse4(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "I love chicken.";
        }
        else if (statement.indexOf("kfc.") >= 0
        || statement.indexOf("cat") >= 0
        || statement.indexOf("sister") >= 0
        || statement.indexOf("brother") >= 0)
        {
            response = "Yea he really is!!";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    public String getResponse5(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "I love you.";
        }
        else if (statement.indexOf("love.") >= 0
        || statement.indexOf("cat") >= 0
        || statement.indexOf("sister") >= 0
        || statement.indexOf("brother") >= 0)
        {
            response = "Yea he really is!!";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    public String getResponse6(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "I love borger.";
        }
        else if (statement.indexOf("food") >= 0
        || statement.indexOf("cat") >= 0
        || statement.indexOf("sister") >= 0
        || statement.indexOf("brother") >= 0)
        {
            response = "Yea he really is!!";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    public String getResponse7(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "I love pineapple.";
        }
        else if (statement.indexOf("fruit") >= 0
        || statement.indexOf("cat") >= 0
        || statement.indexOf("sister") >= 0
        || statement.indexOf("brother") >= 0)
        {
            response = "Yea he really is!!";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    public String getResponse8(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "He can milly rock.";
        }
        else if (statement.indexOf("dance") >= 0
        || statement.indexOf("cat") >= 0
        || statement.indexOf("sister") >= 0
        || statement.indexOf("brother") >= 0)
        {
            response = "Yea he really is!!";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }
    

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 8;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "Would you really be happy if you had fried chicken?";
        }
        else if (whichResponse == 5)
        {
            response = "Why do you like me?";
        }
        else if (whichResponse == 6)
        {
            response = "Why do you like borger";
        }
        else if (whichResponse == 7)
        {
            response = "why do you love pineapple?";
        }
        else if (whichResponse == 8)
        {
            response = "Can you milly rock";
        }

        return response;
    }

   }