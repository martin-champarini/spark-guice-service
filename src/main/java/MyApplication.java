import javax.inject.Inject;

public class MyApplication {

    private MessageService service;
    private String serviceName;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
//	constructor based injector
//	@Inject
//	public MyApplication(MessageService svc){
//		this.service=svc;
//	}

    //setter method injector
    @Inject
    public void setService(MessageService svc){
        this.service=svc;
    }

    public boolean sendMessage(String msg, String rec){
        //some business logic here
        System.out.println("Nombre de servicio " + this.serviceName);
        return service.sendMessage(msg, rec);
    }
}
