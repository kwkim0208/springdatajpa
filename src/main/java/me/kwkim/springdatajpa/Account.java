package me.kwkim.springdatajpa;

import javax.persistence.*;
import java.util.Date;

@Entity
//@Column 생략됨
public class Account {
    @Id
    @GeneratedValue
    //레퍼타입이 원시 타입보다 좋은 이유는 식별 명확하게 할 수 있다.
    private Long id;
    @Column(nullable = false,unique = true)



    








    private String username;
    private String password;
    @Temporal(TemporalType.TIMESTAMP)
    private Date regdate;
    @Transient
    //컬럼으로 매핑 하고 싶지 않을떄
    private String x;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegdate() {
        return regdate;
    } 

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }
}
