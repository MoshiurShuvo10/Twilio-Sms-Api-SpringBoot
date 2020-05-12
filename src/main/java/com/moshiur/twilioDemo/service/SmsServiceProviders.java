package com.moshiur.twilioDemo.service;

import com.moshiur.twilioDemo.model.SmsRequest;

public interface SmsServiceProviders {

    void sendSMS(SmsRequest smsRequest);
}
