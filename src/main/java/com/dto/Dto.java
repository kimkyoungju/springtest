package com.dto;



import com.Entity.MemberEntityTest;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import java.lang.reflect.Member;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Dto {
    private  int pno;
    private  String title;
    private  String content;

    public MemberEntityTest toEntityTest(){
        return MemberEntityTest.builder().
                   pno(this.pno).
                   title(this.title).
                   content(this.content).
                   build();
    }
}
