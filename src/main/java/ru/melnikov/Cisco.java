package ru.melnikov;

import ru.melnikov.mypackage1.CiscoIfEntry;

import java.util.List;

class Cisco {
    private String hostname;
    private String loopback;
    private String index;
    private String regionCode;
    private String regionName;

    public Cisco(String host, List<CiscoIfEntry> interfaces) {
        this.hostname=host;
        String[] hosts = host.split("-");

        if (hosts.length>3) {
            this.index = new StringBuilder(hosts[2]).toString();
            this.regionCode = String.join("-",hosts[0] , hosts[1]);
        }
        interfaces.stream()
                .filter(e -> "Lo0".equals(e.getInstanceName()))
                .findFirst()
                .ifPresent(l->{
                    this.loopback=l.getNetworkAddress();
                });



    }

    @Override
    public String toString() {
        return hostname + "," + loopback + "," + regionCode + "," + index;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getLoopback() {
        return loopback;
    }

    public void setLoopback(String loopback) {
        this.loopback = loopback;
    }
}
