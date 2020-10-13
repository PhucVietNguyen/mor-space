package com.mor.space.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BaseEntity {

    @Column(name = "create_date")
    private Date createDate;
    @Column(name = "create_by")
    private String createBy;
    @Column(name = "update_date")
    private Date updateDate;
    @Column(name = "update_by")
    private String updateBy;
    @Column(name = "delete_flg")
    private Boolean deleteFlg;
}
