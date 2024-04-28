package org.microservices.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
@MappedSuperclass
@Getter @Setter @ToString
public class BaseEntity {
    @Column(updatable = false) //updated is not possible
    private LocalDateTime created_at;
    @Column(updatable = false)
    private String created_by;
    @Column(insertable = false)
    private LocalDateTime updated_at;
    @Column(insertable = false)
    private String updated_by;
}
