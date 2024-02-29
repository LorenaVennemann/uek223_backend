package com.example.demo.domain.imagepost;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "post_likes")
public class PostLikes {

    @Id
    private UUID id;

    private UUID userId;

    private UUID postId;

}
