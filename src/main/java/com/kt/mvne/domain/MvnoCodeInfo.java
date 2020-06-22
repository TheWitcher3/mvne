package com.kt.mvne.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
public class MvnoCodeInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String codeGroupId;
    private String codeGroupName;
    private String codeGroupDescription;
    private String codeDet;
    private String codeDetName;
    private int codeLength;
    private int desplayOrder;
    private boolean useYn;

    @CreationTimestamp
    private Timestamp createDate;
    @UpdateTimestamp
    private Timestamp updateDate;

    public MvnoCodeInfo(String codeGroupId, String codeGroupName, String codeGroupDescription, String codeDet, String codeDetName, int codeLength, int desplayOrder, boolean useYn) {
        this.codeGroupId = codeGroupId;
        this.codeGroupName = codeGroupName;
        this.codeGroupDescription = codeGroupDescription;
        this.codeDet = codeDet;
        this.codeDetName = codeDetName;
        this.codeLength = codeLength;
        this.desplayOrder = desplayOrder;
        this.useYn = useYn;
    }
}
