package com.Project.SpringAngular.DTO;

public class NewsSaveDTO {

    private String newstitle;
    private String newscontent;

    public NewsSaveDTO(String newstitle, String newscontent) {
        this.newstitle = newstitle;
        this.newscontent = newscontent;
    }

    public NewsSaveDTO() {
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle;
    }

    public String getNewscontent() {
        return newscontent;
    }

    public void setNewscontent(String newscontent) {
        this.newscontent = newscontent;
    }

    @Override
    public String toString() {
        return "NewsDTO{" +
                ", newstitle='" + newstitle + '\'' +
                ", newscontent='" + newscontent + '\'' +
                '}';
    }
}
