package com.Entity;

import lombok.*;

import javax.persistence.*;



@AllArgsConstructor // 풀생성자
@ToString //객체내 필드 정보확인
@Getter
@Setter // get set
@Builder //객체 생성 안정성 보장
@Entity
@Table(name = "test")
public class MemberEntityTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int pno;

    @Column
    String title;

    @Column
    String content;


    public MemberEntityTest() {
        int pno = (this.pno);
        String title = (this.title);
        String content = (this.content);


    }
}