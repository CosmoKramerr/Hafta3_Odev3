package Kodlama_io.Core.Logging;

public class DBLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Logged to database : "+data);
    }
}
