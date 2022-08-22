package com.foodie.foodie.domain.scrap.domain;

import com.foodie.foodie.domain.account.domain.jpo.AccountJpo;
import com.foodie.foodie.domain.post.domain.Post;
import com.foodie.foodie.domain.account.domain.Account;
import com.foodie.foodie.global.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "scrap")
public class Scrap extends BaseEntity {

    @Column(columnDefinition = "VARCHAR(20)", nullable = false)
    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id", nullable = false)
    private AccountJpo accountJpo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    public Scrap(String type, AccountJpo accountJpo, Post post) {
        this.type = type;
        this.accountJpo = accountJpo;
        this.post = post;
    }
}
