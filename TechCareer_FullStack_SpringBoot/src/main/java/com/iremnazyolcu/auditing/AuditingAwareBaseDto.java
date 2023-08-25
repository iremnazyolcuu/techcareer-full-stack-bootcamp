package com.iremnazyolcu.auditing;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.util.Date;

// LOMBOK
@Getter
@Setter
abstract public class AuditingAwareBaseDto implements Serializable {

    // Serialization
    public static final Long serialVersionUID = 1L;

    // ID
    private Long id;

    // DATE
    @Builder.Default
    private Date systemDate = new Date(System.currentTimeMillis());

    // AUDITING
    // @JsonIgnore: backend'e veri giderken bu bilgiyi gösterme anlamında
    // KİM EKLEDİ?
    @JsonIgnore
    protected String createdUser;

    // KİM NE ZAMAN EKLEDİ?
    @JsonIgnore
    protected Date createdDate;

    // KİM GÜNCELLEDİ?
    protected String updatedUser;

    // KİM NE ZAMAN GÜNCELLEDİ?
    protected Date updatedDate;
}
