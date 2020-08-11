package me.kwkim.springdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
//관계의 주인  -> 상대테이블의 정보를 외래키로 참조하고 있기때문에  ->값이 반영이 된다
public class Study {
    @Id
    @GeneratedValue
    private Long  id;
    private String name;
    @ManyToOne
    //해당 래퍼런스가 하나이면 one 여러개변 many를 어노테이션을 매핑해준다
    private Account owner;

    public Account getOwner() {
        return owner;
    }

    public void setOwner(Account owner) {
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
