package mx.edu.utng.lajosefa.Entity;

/**
 * Created by Diana Manzano on 29/03/2018.
 */

public class Result {
    public String message_id;

    public Result(String message_id) {
        this.message_id = message_id;
    }

    public Result() {
    }

    public String getMessage_id() {
        return message_id;
    }

    public void setMessage_id(String message_id) {
        this.message_id = message_id;
    }

}
