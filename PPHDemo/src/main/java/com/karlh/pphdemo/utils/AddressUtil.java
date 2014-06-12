/**
 * Created by khirschhornjr on 6/12/14.
 */

package com.karlh.pphdemo.utils;

import com.paypal.merchant.sdk.domain.Address;
import com.paypal.merchant.sdk.domain.DomainFactory;

public class AddressUtil {

    public static Address getDefaultUSMerchantAddress() {
        Address.Builder builder = DomainFactory.newAddressBuilder();
        builder.
                setLine1("2141 North 1st St").
                setLine2("Apt #12").
                setCity("San Jose").
                setState("CA").
                setCountryCode("US").
                setPostalCode("95131").
                setPhoneNumber("4086977092");
        return builder.build();
    }

    public static Address getDefaultUKMerchantAddress() {
        Address.Builder builder = DomainFactory.newAddressBuilder();
        builder.
                setLine1("34726 South Broadway").
                setCity("Wolverhampton").
                setState("West Midlands").
                setCountryCode("GB").
                setPostalCode("W12 4LQ").
                setPhoneNumber("05725854438");
        return builder.build();
    }
}

