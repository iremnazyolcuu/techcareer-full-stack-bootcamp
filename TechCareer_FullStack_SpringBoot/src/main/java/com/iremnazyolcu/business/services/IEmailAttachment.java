package com.iremnazyolcu.business.services;

import com.iremnazyolcu.business.dto.EmailDto;

public interface IEmailAttachment  {

    public EmailDto basicSendEmail(EmailDto emailDto);
    public EmailDto intermediaSendEmail(EmailDto emailDto);
}
