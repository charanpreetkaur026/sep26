public class NameLengthException extends Throwable {

    private String message;
    public NameLengthException(String message){
        super(message);
        this.message= message;
    }

   // public
}
