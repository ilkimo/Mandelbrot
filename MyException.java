
public class MyException extends Exception {
    private String errMsg;

    public MyException(String errMsg) {
        super(errMsg);
        this.errMsg = errMsg;
    }

    public MyException() {
        super();
        errMsg = "No exception msg...";
    }

    public String getErrMsg() {return errMsg;}
}
