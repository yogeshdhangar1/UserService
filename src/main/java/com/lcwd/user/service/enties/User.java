package com.lcwd.user.service.enties;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "micro_user")
public class User {

    @Id
    @Column(name = "UserId")
    private String useId;
    @Column(name = "UserName",length = 15)
    private String name;
    @Column(name = "UserEmail")
    private String email;
    @Column(name = "UserAbout")
    private String about;
    @Column(name = "UserDOB")
    private int dateOfBirth;

    @Transient
    private List<Rating> ratings = new ArrayList<>();

}
