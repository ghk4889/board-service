package mygroup.boardservice.board.domain;


import mygroup.boardservice.common.CodeEnum;

public enum Grade implements CodeEnum{
    VIP,
    COMMON;


    @Override
    public String getCode() {
        return this.name().toLowerCase();
    }
}

