package Kodlama_io.Core.Logging;

public class EmailLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Logged to e-mail : "+data);

    }
}
