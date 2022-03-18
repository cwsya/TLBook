package org.cwsya.tlbook.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cws
 */
@Component
public class BeanCopyUtil {
    public static <V> V copyBean(Object source,Class<V> clazz){
        V result = null;
        try {
            result=clazz.newInstance();
            BeanUtils.copyProperties(source,result);
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return result;
    }
    public static <V,O> List<V> copyBeanList(List<O> list,Class<V> clazz){
        return list.stream()
                .map(o -> copyBean(o, clazz))
                .collect(Collectors.toList());
    }
}
