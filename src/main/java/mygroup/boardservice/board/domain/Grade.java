package mygroup.boardservice.board.domain;


import mygroup.boardservice.common.CodeEnum;

public enum Grade implements CodeEnum {
    VIP,
    COMMON;


//    private String code;
//
//    Grade(String code){
//        this.code = code;
//    }

    @Override
    public String getCode() {
        return this.name().toLowerCase();
    }
}
