package com.stackroute.javape5;

import java.util.HashMap;
import java.util.Map;

public class ReplaceMapValues {

    public HashMap<String,String> replaceValueAtKey2ToValueAtKey1(Map<String,String> inputMap) {

        // create hashMap of type string,string
        HashMap<String,String> outputMap= new HashMap<>();

        // if input has more than two values , return error message
        if(inputMap.size()==2){
            // replace the map value for key2 with map value of key1
            outputMap.put("val2",inputMap.get("val1"));
            // empty the value of key1
            outputMap.put("val1","");
        } else {
            outputMap.put("output","Wrong input");
        }
        // return output map after replacement is done
        return outputMap;
    }

}
