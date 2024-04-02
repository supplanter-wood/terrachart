package terraform.flowchart.models.minorModels;

public class NetworkData {
    private String gateway;
    private String global_ipv6_address;
    private int global_ipv6_prefix_length;
    private String ip_address;
    private int ip_prefix_length;
    private String ipv6_gateway;
    private String mac_address;
    private String network_name;

    // Constructors are not shown for brevity

    public String getGateway() {
        return gateway;
    }

    public String getGlobalIpv6Address() {
        return global_ipv6_address;
    }

    public int getGlobalIpv6PrefixLength() {
        return global_ipv6_prefix_length;
    }

    public String getIpAddress() {
        return ip_address;
    }

    public int getIpPrefixLength() {
        return ip_prefix_length;
    }

    public String getIpv6Gateway() {
        return ipv6_gateway;
    }

    public String getMacAddress() {
        return mac_address;
    }

    public String getNetworkName() {
        return network_name;
    }
}