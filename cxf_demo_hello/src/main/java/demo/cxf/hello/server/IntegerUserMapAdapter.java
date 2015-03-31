package demo.cxf.hello.server;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;


public class IntegerUserMapAdapter extends XmlAdapter<IntegerUserMap, Map<Integer, UserImpl>> {
    
	public IntegerUserMap marshal(Map<Integer, UserImpl> v) throws Exception {
        IntegerUserMap map = new IntegerUserMap();
        for (Map.Entry<Integer, UserImpl> e : v.entrySet()) { 
            IntegerUserMap.IntegerUserEntry iue = new IntegerUserMap.IntegerUserEntry();
            iue.setUser(e.getValue());
            iue.setId(e.getKey());
            map.getEntries().add(iue);
        }
        return map;
    }

    public Map<Integer, UserImpl> unmarshal(IntegerUserMap v) throws Exception {
        Map<Integer, UserImpl> map = new LinkedHashMap<Integer, UserImpl>();
        for (IntegerUserMap.IntegerUserEntry e : v.getEntries()) {
            map.put(e.getId(), e.getUser());
        }
        return map;
    }

}
