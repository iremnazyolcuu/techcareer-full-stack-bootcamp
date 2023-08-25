package com.iremnazyolcu.auditing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.util.Date;

// SUPER CLASS
@MappedSuperclass
@JsonIgnoreProperties(value = {"created_date, updated_date"}, allowGetters = true)
abstract public class AuditingAwareBaseEntity implements Serializable {

    // Serialization
    public static final Long serialVersionUID = 1L;

    // AUDITING
    // KİM EKLEDİ?
    @CreatedBy
    @Column(name = "created_user")
    protected String createdUser;

    // KİM NE ZAMAN EKLEDİ?
    @CreatedDate
    @Column(name = "created_date")
    protected Date createdDate;

    // KİM GÜNCELLEDİ?
    @LastModifiedBy
    @Column(name = "updated_user")
    protected String updatedUser;

    // KİM NE ZAMAN GÜNCELLEDİ?
    @LastModifiedDate
    @Column(name = "updated_date")
    protected Date updatedDate;

}
