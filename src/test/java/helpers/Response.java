package helpers;

public class Response {
    public String responseText;
    public int statusCode;

    public Response(String text, int statusCode) {
        this.statusCode = statusCode;
        this.responseText = text;
    }
}
