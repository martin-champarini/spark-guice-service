import com.google.inject.Singleton;

@Singleton
public class FacebookService implements MessageService {
    @Override
    public boolean sendMessage(String msg, String receipient) {
        System.out.println("Message sent to Facebook user "+receipient+" with message="+msg);
        return true;
    }
}
