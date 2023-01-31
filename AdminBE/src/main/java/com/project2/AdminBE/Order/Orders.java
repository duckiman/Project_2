package com.project2.AdminBE.Order;

import javax.persistence.*;

@Entity
@Table(name ="Orders")
public class Orders {
    @Id
    @SequenceGenerator(
            name = "orders",
            sequenceName = "orders_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "orders_sequence"
    )
    private Long id;
    @Column(name = "user_Id")
    private Long user_Id;

    public Orders() {
    }

    public Orders(Long id, Long user_Id) {
        this.id = id;
        this.user_Id = user_Id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(Long user_Id) {
        this.user_Id = user_Id;
    }
}
