package com.lilianaserrano.sabesabor;

/**
 * Created by mp on 21/02/2015.
 */
public class PersonalInfo {
    private String name = "";
    private String mobile = "";

    public void SetName(String name){
        this.name = name;
    }
    public String GetName(){
        return this.name;
    }

    public void SetMobile(String mobile){
        this.mobile = mobile;
    }
    public String GetMobile(){
        return this.mobile;
    }
}
