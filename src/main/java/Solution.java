import client.NewRequest;
import client.OldRequest;
import client.Request;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Solution {

    public static void main(String[] args) {
        final ObjectMapper mapper = new ObjectMapper();

//        Request request = Request.create("John", 11).build();
//        NewRequest request = new NewRequest("John", 12);
        OldRequest request = new OldRequest("John", 3);

        try {
            System.out.println("request = " + mapper.writeValueAsString(request));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
