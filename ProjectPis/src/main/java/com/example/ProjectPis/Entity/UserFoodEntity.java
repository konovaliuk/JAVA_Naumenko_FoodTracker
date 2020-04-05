package com.example.ProjectPis.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "userfood", schema = "fatsecret")
public class UserFoodEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "datemeal")
    private String datemeal;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "food_id", referencedColumnName = "id")
    private UserFoodEntity userFoodEntity;

    public String getDatemeal() {
        return datemeal;
    }

    public void setDatemeal(String datemeal) {
        this.datemeal = datemeal;
    }
    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public UserFoodEntity getUserFoodEntity() {
        return userFoodEntity;
    }

    public void setUserFoodEntity(UserFoodEntity userFoodEntity) {
        this.userFoodEntity = userFoodEntity;
    }
}
