package com.msr.better.feign.model;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @since 2021-07-03
 */
public class Order {
    private Long id;
    private String name;
    private int sums;

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

    public int getSums() {
        return sums;
    }

    public void setSums(int sums) {
        this.sums = sums;
    }
}
