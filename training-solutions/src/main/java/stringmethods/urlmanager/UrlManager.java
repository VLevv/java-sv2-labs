package stringmethods.urlmanager;

public class UrlManager {
    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    private String cutProtocol(String url){
        return url.substring(0,url.indexOf(":"));
    }

    private Integer cutPort(String url){
        if(url.indexOf(":",url.indexOf(":")+1)==-1){
            return null;
        }
        return Integer.parseInt(url.substring(url.indexOf(":",url.indexOf(":")+1)+1,url.indexOf("/",url.indexOf(":")+3)));
    }

    private String cutHost(String url) {
        if (cutPort(url) == null) {
            return url.substring(url.indexOf(":") + 3, url.indexOf("/", url.indexOf(":" )+3));
        }
        return url.substring(url.indexOf(":") + 3, url.indexOf(":", url.indexOf(":" )+3));
    }

    private String cutPath(String url){
        if(url.contains("?")){
        return url.substring(url.indexOf("/",url.indexOf(cutHost(url)))+1,url.indexOf("?"));
        }
        return url.substring(url.indexOf("/",url.indexOf(cutHost(url)))+1);
    }


    private String cutQuery(String url){
        if(url.contains("?")) {
            return url.substring(url.indexOf("?") + 1);
        }
        return "";
    }

    public UrlManager(String url){
        protocol = cutProtocol(url);
        port=cutPort(url);
        host=cutHost(url);
        path=cutPath(url);
        query=cutQuery(url);
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public boolean hasProperty(String key){
        return query.contains(key);
    }

    public String getProperty(String key){
        String[] tmp = query.split("&");
        for(String s:tmp){
            if(s.contains(key)){
                return s.substring(s.indexOf("=")+1);
            }
        }
        return "key not found";
    }

    public static void main(String[] args) {
        UrlManager manager = new UrlManager("https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02");
        System.out.println(manager.getProtocol());
        System.out.println(manager.getPort());
        System.out.println(manager.getHost());
        System.out.println(manager.getPath());
        System.out.println(manager.hasProperty("endtime"));
        System.out.println(manager.getProperty("format"));
    }
}
