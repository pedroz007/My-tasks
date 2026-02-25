package com.example.MyTasks.util;

public enum Status {
    NAO_INICIADA(false),
    INICIADA(false),
    FINALIZADA(true),
    CANCELADA(true);

    private final boolean finalizada;

    Status(boolean finalizada){
        this.finalizada = finalizada;
    }

    public boolean isFilnaizada(){
        return finalizada;
    }
}
