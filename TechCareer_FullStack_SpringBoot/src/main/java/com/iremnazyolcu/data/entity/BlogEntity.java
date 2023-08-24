package com.iremnazyolcu.data.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.util.Date;

// LOMBOK
@Data
@Log4j2
@ToString

// ENTITY
// Entity class'ı ne demektir? :
// Oluşturulan entity class'ının, database'e gidip table oluşturacağı anlamına geliyor
@Entity
// database'deki table name 'blogs' olsun
@Table(name = "blogs")
// Blog(N) Categories(1)
public class BlogEntity implements Serializable {

    // Serialization
    public static final Long serialVersionUID = 1L;

    // ID
    // ID'nin PK olduğu kesinlikle belirtilmeli :
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // database'deki column name 'blog_id' olsun
    @Column(name = "blog_id", unique = true, nullable = false, insertable = true, updatable = false)
    private Long blogId;

    // HEADER
    @Column(name = "header", length = 500, columnDefinition = "varchar(500) default 'Header has not been written...'")
    private String header;

    // CONTENT
    // Lob: Hibernate'de karşımıza gelen yapıdır
    // Large Object anlamına gelir, yani büyük veriler için kullanılır
    @Lob
    private String content;

    // DATE
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date systemDate;

    // Database'de olmasın ama Javada olsun :
    /*
    @Transient
    private String justJava;
    */


}
