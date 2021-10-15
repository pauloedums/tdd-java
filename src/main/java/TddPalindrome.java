import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/palindrome")
public class TddPalindrome {

    @GET
    @Path("/{palindrome}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPalindrome(@PathParam("palindrome") String palindrome){
        if(checkIfIsPalindrome(palindrome)){
            String result = "Parabéns a sua palavra é um palíndromo: " + palindrome;
            return Response.ok(result).build();
        }
        return Response.ok("O dado utilizado não é um palíndromo").build();
    }

    public Boolean checkIfIsPalindrome(String palindrome){
        String text = palindrome.replaceAll("[^a-zA-Z0-9]", "").replaceAll(" ", "").toLowerCase();
        int len = text.length();
        for (int i = 0; i < len / 2; ++i) {
            if (text.charAt(i) != text.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    
}
