package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {
    private List<DnsEntry> entries = new ArrayList<>();

    public static class DnsEntry {
        private String name;
        private String Ip;

        public DnsEntry(String name, String ip) {
            this.name = name;
            Ip = ip;
        }
    }

    public void addEntry(String hostName,String hostIp){
        for (DnsEntry e :
                entries) {
            if(e.Ip.equals(hostIp)||e.name.equals(hostName)){
                throw new IllegalArgumentException("Already exists");
            }
        }
        entries.add(new DnsEntry(hostName,hostIp));
    }

    public void removeEntryByName(String hostName){
        for (DnsEntry e :
                entries) {
            if(e.name.equals(hostName)){
                entries.remove(e);
                return;
            }
        }
    }

    public void removeEntryByIp(String hostIp){
        for (DnsEntry e :
                entries) {
            if(e.Ip.equals(hostIp)){
                entries.remove(e);
                return;
            }
        }
    }

    public String getIpByName(String hostName){
        for (DnsEntry e :
                entries) {
            if(e.name.equals(hostName)){
                return e.Ip;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    public String getNameByIp(String hostIp){
        for (DnsEntry e :
                entries) {
            if(e.Ip.equals(hostIp)){
                return e.name;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }
}
