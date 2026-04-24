package com.GJJ.entity;

// 这里必须是 javax ！！！
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "htb105")
public class Htb105 {

    @Id
    @Column(name = "acct", length = 20)
    private String acct;

    @Column(name = "name", length = 20)
    private String name;

    @Column(name = "cert_no", length = 30)
    private String cert_no;

    @Column(name = "cert_type", length = 1)
    private String cert_type;
}