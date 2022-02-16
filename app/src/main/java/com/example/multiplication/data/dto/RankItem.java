package com.example.multiplication.data.dto;

public class RankItem {

    private int id;
    private String name;
    private int count;
    private String regTime;

    public RankItem(
            int id,
            String name,
            int count,
            String regTime
    ) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.regTime = regTime;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public String getRegTime() {
        return regTime;
    }
}
