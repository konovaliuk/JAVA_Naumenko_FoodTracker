package com.example.ProjectPis.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "food", schema = "fatsecret")
public class FoodEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "food")
    private String food;
    @Column(name = "calories")
    private int calories;
    @Column(name = "fat")
    private int fat;
    @Column(name = "carb")
    private int carb;
    @Column(name = "protein")
    private int protein;



    @ManyToOne
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private UserEntity userEntity;

    @OneToMany(mappedBy = "userFoodEntity", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<UserFoodEntity> userFoodEntities;

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

}