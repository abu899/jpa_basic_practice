package jpabook.jpashop.domain;

import javax.persistence.Entity;

@Entity
public class Album extends Item {

    private String title;
    private String etc;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }
}
