package helpers;

public class Response {
    public String responseText;
    public int statusCode;

    public Response(String responseText, int statusCode) {
        this.statusCode = statusCode;
        this.responseText = responseText;
    }
}
