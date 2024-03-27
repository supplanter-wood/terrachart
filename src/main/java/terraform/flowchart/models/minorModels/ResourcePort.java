package terraform.flowchart.models.minorModels;

public class ResourcePort {

    private int external;
    private int internal;
    private String ip;
    private String protocol;

    public int getExternal() {
        return external;
    }

    public int getInternal() {
        return internal;
    }

    public String getIp() {
        return ip;
    }

    public String getProtocol() {
        return protocol;
    }
}
