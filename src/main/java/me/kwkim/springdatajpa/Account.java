package me.kwkim.springdatajpa;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
//@Column 생략됨
public class Account {
    @Id
    @GeneratedValue
    //레퍼타입이 원시 타입보다 좋은 이유는 식별 명확하게 할 수 있다.
    private Long id;
    @Column(nullable = false, unique = true)
    private String username;
    private String password;
    @OneToMany
    //어노테이션의 끝이 many인경우는 컬렉션을 이용한 레퍼런스를 사용
    private Set<Study> studies = new HashSet<>();

    public Set<Study> getStudies() {
        return studies;
    }

    public void setStudies(Set<Study> studies) {
        this.studies = studies;
    }

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
