package com.flyline.client.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Place {
    private String code;
    private Date date;
    private List<PermittedTime> permittedTime;

    public String getCode(){
        return code;
    }

    public Date getDate(){
        return date;
    }

    public void setCode(String _code){
        code = _code;
    }

    public void setDate(Date _date){
        date= _date;
    }

    @Override
    public boolean equals(Object other){
        if(this == other){
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Place that = (Place) other;
        return Objects.equals(date, that.getCode()) &&
                Objects.equals(code, that.getDate());
    }

    public List<PermittedTime> getPermittedTime() {
        return permittedTime;
    }

    public void setPermittedTime(List<PermittedTime> permittedTime) {
        this.permittedTime = permittedTime;
    }
}
