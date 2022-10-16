package com.assignment.MarketApplication;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Helper {
    private static <T> Object getFieldValue(Object object, String fieldName){
        try{
            Field field = object.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            var value = field.get(object);
            return value;
        }catch (Exception exception){
        }
        return null;
    }

    public static <T> String getStringField(T object, String fieldName){
        try{
            return getFieldValue(object, fieldName).toString();
        }catch (Exception exception){
            return null;
        }
    }

    public static String getStringField(Object object, Integer index){
        try{
            return ((Object[])object)[index].toString();
        }catch (Exception exception){
            return null;
        }
    }
}
