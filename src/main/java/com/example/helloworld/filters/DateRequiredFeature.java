package com.example.helloworld.filters;

import com.example.helloworld.DateRequired;

import javax.ws.rs.container.DynamicFeature;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.FeatureContext;

/**
 * Created by sandeep.naga on 12/06/16.
 */
public class DateRequiredFeature implements DynamicFeature {

    @Override
    public void configure(ResourceInfo resourceInfo, FeatureContext featureContext) {
        if(resourceInfo.getResourceMethod().getAnnotation(DateRequired.class) != null){
            featureContext.register(DateNotSpecifiedFilter.class);
        }
    }
}
