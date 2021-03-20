import com.google.inject.Singleton;

@Singleton
public class EmailService implements MessageService{
    @Override
    public boolean sendMessage(String msg, String receipient) {
        System.out.println("Email Message sent to "+receipient+" with message="+msg);
        return true;
    }
}
